package com.example.wechatmerchant.wechat;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
    config 热更新时，确保配置初始化时不是单例，只被创建一次，那么配置不会被修改 @Bean 只会创建一次，所以此处用法不对
 */
@Configuration
@Data
@RefreshScope
public  class WeChatConfig {
    @Value("${wechat.appid:test}")
    private String appId;

    @Value("${wechat.app-secret:test}")
    private String appSecret;

    @Value("${wechat.grant-type:client_credential}")
    private String grantType;

    @Value("${wechat.sig_method:test}")
    private String sigMethod;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
