package com.example.wechatmerchant.pojo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
public class WeChatVO {

    @Data
    @AllArgsConstructor
     public static class AccessTokenReq {

        private String appId;

        private String appSecret;

        private String grantType;
     }

     @EqualsAndHashCode(callSuper = true)
     @Data
     @NoArgsConstructor
     public static class AccessTokenResp extends CommonVO.WeChatCommonRsp {
        @JsonProperty("access_token")
        private String accessToken;

        @JsonProperty("expires_in")
        private Integer expiresIn;
     }

     @NoArgsConstructor
     public static class CheckSessionReq extends CommonVO.Session {}

}
