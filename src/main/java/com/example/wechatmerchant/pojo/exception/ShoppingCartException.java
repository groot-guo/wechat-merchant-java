package com.example.wechatmerchant.pojo.exception;

import com.example.wechatmerchant.pojo.error.ShoppingCartError;
import lombok.Getter;


//  todo 此处还能优化，共同继承一个 error，然后都能进行构造
@Getter
public class ShoppingCartException extends Exception {
    private final int errorCode;

    public ShoppingCartException(ShoppingCartError shoppingCartError) {
        super(shoppingCartError.getErrorMsg());
        this.errorCode = shoppingCartError.getErrorCode();
    }
}
