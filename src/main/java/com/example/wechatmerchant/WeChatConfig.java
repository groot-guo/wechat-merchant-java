package com.example.wechatmerchant;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

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
}
