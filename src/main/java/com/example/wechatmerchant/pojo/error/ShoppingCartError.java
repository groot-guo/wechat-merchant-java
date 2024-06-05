package com.example.wechatmerchant.pojo.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ShoppingCartError {
    NOT_FOUND_SHOPPING_INFO(11001, "the user has not product in shopping cart !");

    private final Integer errorCode;
    private final String errorMsg;
}
