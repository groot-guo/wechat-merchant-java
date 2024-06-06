package com.example.wechatmerchant.filter;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.*;
import org.springframework.web.util.pattern.PathPattern;
import org.springframework.web.util.pattern.PathPatternParser;
import reactor.core.publisher.Mono;

import java.util.List;


// 只允许测试接口通过
@Slf4j
@Component
public class ReqAuthFilter implements WebFilter {

    private final PathPattern testPathPattern = new PathPatternParser().parse("/api/test/**");
    private final PathPattern loginPath = new PathPatternParser().parse("/api/user/login");

    // todo 配置放在 nacos 中
    final String X_TEST_VALUE = "test";

    @Override
    @NonNull
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();


        if (testPathPattern.matches(request.getPath().pathWithinApplication())) {
            // 匹配test url
            return filterTestUrl(exchange, chain);
        } else if (!loginPath.matches(request.getPath().pathWithinApplication())) {
            // 匹配 需要登录鉴权 todo
            List<String> cookie = request.getHeaders().get("Set-Cookie");

            return chain.filter(exchange);
        }
        return chain.filter(exchange);
    }

    // test api filter
    Mono<Void> filterTestUrl(ServerWebExchange exchange, WebFilterChain chain) {
        // 执行特定于 "/api/test/**" 的过滤逻辑
        ServerHttpRequest request = exchange.getRequest();

        List<String> xTest = request.getHeaders().get("X-Test");

        if (xTest == null  || xTest.isEmpty() || !X_TEST_VALUE.equals(xTest.get(0))) {
            // 不满足条件，提前返回响应
            // 设置响应状态码和内容
            exchange.getResponse().setStatusCode(HttpStatus.OK);
            // 返回一个包含你想要发送的数据的Mono
            return exchange.getResponse().writeWith(Mono.just(exchange.getResponse().bufferFactory().wrap("Fail request".getBytes())));
        }

        return chain.filter(exchange);
    }
}
