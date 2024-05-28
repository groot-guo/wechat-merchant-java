package com.example.wechatmerchant.service;

import com.example.wechatmerchant.WeChatConfig;
import com.example.wechatmerchant.pojo.vo.WeChatVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
class WeChatServiceTest {
    private static final Logger logger = LoggerFactory.getLogger(WeChatServiceTest.class);

    @Mock
    private WeChatConfig weChatConfig;

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private WeChatService weChatService;


    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }



    @Test
    void getAccessToken() {
        // 模拟依赖的行为
        when(weChatConfig.getAppId()).thenReturn("123123");
        when(weChatConfig.getAppSecret()).thenReturn("test");
        when(weChatConfig.getAppSecret()).thenReturn("client_credential");

        // 调用 Service 方法
        WeChatVO.AccessTokenResp rsp = weChatService.getAccessToken();
        System.out.println(weChatConfig);
        logger.info(weChatConfig.toString());

        // 验证依赖的方法是否被调用
        verify(weChatConfig).getAppId();
        verify(weChatConfig).getAppSecret();
        verify(weChatConfig).getGrantType();

        // 使用断言验证结果
        assertEquals("", rsp);
    }


    // 这个方法用于提供测试参数
    static Iterable<WeChatVO.CheckSessionReq> checkSessionReqProvider() {
        // 创建并返回不同的AccessTokenReq实例
        return Stream.of(
                new WeChatVO.CheckSessionReq("3333", "122")
                // 更多实例...
        ).collect(Collectors.toList());
    }

    @ParameterizedTest
    @MethodSource("checkSessionReqProvider")
    void checkSession(WeChatVO.CheckSessionReq req) {
        // 模拟依赖的行为
//        when(restTemplate.someMethod()).thenReturn(expectedResult);

        // 调用 Service 方法
        weChatService.checkSession(req);

        // 验证依赖的方法是否被调用
//        verify(myDependency).someMethod();

        // 使用断言验证结果
//        assertEquals("", result);
    }
}