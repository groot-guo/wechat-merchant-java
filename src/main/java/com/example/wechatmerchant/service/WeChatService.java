package com.example.wechatmerchant.service;

import com.example.wechatmerchant.WeChatConfig;
import com.example.wechatmerchant.pojo.error.WeChatError;
import com.example.wechatmerchant.pojo.exception.WeChatException;
import com.example.wechatmerchant.pojo.vo.WeChatVO;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;


@Service
@AllArgsConstructor
public class WeChatService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    private final WeChatConfig weChatConfig;

    private final RestTemplate restTemplate;

    private static final String HMAC_SHA256_ALGORITHM = "HmacSHA256";


    // 无需外部调用，因为 access token 是为了请求其他接口时，加入的参数
    // restTemplate 方法调用示例
    WeChatVO.AccessTokenResp getAccessToken() {
        WeChatVO.AccessTokenResp response;

        // build get http url
        String url = "https://api.weixin.qq.com/cgi-bin/token";
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
                .queryParam("appid", weChatConfig.getAppId())
                .queryParam("secret", weChatConfig.getAppSecret())
                .queryParam("grant_type", weChatConfig.getGrantType());

        // 请求 wechat 服务
        response = restTemplate.getForObject(
                builder.toUriString(),
                WeChatVO.AccessTokenResp.class
        );
        log.info("getAccessToken request:{}, response: {}", builder, response);
        if (response == null) {
            throw new WeChatException(-1, "rsp is null");
        }
        if (response.getAccessToken() == null) {
            throw new WeChatException(response.getErrCode(), "wechat req errormsg:" + response.getErrMsg());
        }
        return response;
    }

    // 对 session key 进行 hash
    String getSignature(String sessionKey) {
        try {
            // 创建HMAC对象
            Mac mac = Mac.getInstance(HMAC_SHA256_ALGORITHM);

            // 使用session_key初始化HMAC对象
            SecretKeySpec secretKeySpec = new SecretKeySpec(sessionKey.getBytes(StandardCharsets.UTF_8), HMAC_SHA256_ALGORITHM);
            mac.init(secretKeySpec);

            // 对空字符串进行签名
            byte[] signatureBytes = mac.doFinal("".getBytes(StandardCharsets.UTF_8));

            // 将签名结果转换为十六进制字符串
            String signature = bytesToHex(signatureBytes);
            System.out.println("Signature: " + signature);
            log.info("getSignature signature: {}", signature);
            return signature;
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            log.error("getSignature, err:{}", e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }


    public boolean checkSession(WeChatVO.CheckSessionReq accessTokenReq) {
        // 1. get access token
        WeChatVO.AccessTokenResp accessTokenRsp  = getAccessToken();

        WeChatVO.CheckSessionResp response;
        String signature = this.getSignature(accessTokenReq.getSessionKey());

        response = WebClient.create("https://api.weixin.qq.com").get()
                .uri(uriBuilder -> uriBuilder
                        .path("/wxa/checksession")
                        .queryParam("access_token", accessTokenRsp.getAccessToken())
                        .queryParam("openid", accessTokenReq.getOpenid())
                        .queryParam("signature", signature)
                        .queryParam("sig_method", "hmac_sha256") // 用户登录态签名哈希方法
                        .build()
                ).retrieve().bodyToMono(WeChatVO.CheckSessionResp.class).block();
        if (response == null) {
            throw new WeChatException(-1, "response is null");
        }
        if (response.getErrCode() == null) {
            throw new WeChatException(-1, "wechat req errormsg:" + response.getErrMsg());
        }
        if (response.getErrCode().equals(WeChatError.INVALID_SIGNATURE.getErrCode())) {
            throw new WeChatException(response.getErrCode(), "wechat req errormsg:" + response.getErrMsg());
        }

        return true;
    }
}
