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
import java.util.Objects;


// 只允许测试接口通过
@Slf4j
@Component
public class ReqTestFilter implements WebFilter {

    private final PathPattern pathPattern = new PathPatternParser().parse("/api/test/**");

    // todo 配置放在 nacos 中
    final String X_TEST_VALUE = "test";

    @Override
    @NonNull
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();
        if (pathPattern.matches(request.getPath().pathWithinApplication())) {
            // 执行特定于 "/api/test/**" 的过滤逻辑

            List<String> xTest = request.getHeaders().get("X-Test");

            if (xTest == null  || xTest.isEmpty() || !X_TEST_VALUE.equals(xTest.get(0))) {
                // 不满足条件，提前返回响应
                return createEarlyResponse(exchange);
            }

            return chain.filter(exchange);
        } else {
            // 对于不匹配的路径，直接继续处理
            return chain.filter(exchange);
        }
    }

    private Mono<Void> createEarlyResponse(ServerWebExchange exchange) {
        // 设置响应状态码和内容
        exchange.getResponse().setStatusCode(HttpStatus.OK);
        // 返回一个包含你想要发送的数据的Mono
        return exchange.getResponse().writeWith(Mono.just(exchange.getResponse().bufferFactory().wrap("Fail request".getBytes())));
    }
}
