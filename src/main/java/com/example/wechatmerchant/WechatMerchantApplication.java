package com.example.wechatmerchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WechatMerchantApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatMerchantApplication.class, args);
    }

}
