package com.example.wechatmerchant.filter;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;


// spring webflux 不支持传统 servlet filter
@Slf4j
@Component
public class ReqWebFilter implements WebFilter {

    @Override
    @NonNull // 声明 确保它遵循相同的非空约束
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        // 记录请求信息
        log.info("Received request: [{}] url: {} header: {}", request.getMethod(), request.getURI(), request.getHeaders());

        // 继续处理请求
        return chain.filter(exchange)
                .then(Mono.fromRunnable(() -> {
                    // 记录响应信息
                    log.info("Completed request: url: {} rsp: {}", request.getURI(), exchange.getResponse());
                }));
    }
}
