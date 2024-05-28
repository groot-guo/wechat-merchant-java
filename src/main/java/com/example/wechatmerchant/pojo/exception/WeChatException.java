package com.example.wechatmerchant.pojo.exception;


import lombok.Getter;

@Getter
public class WeChatException extends RuntimeException  {

    private final Integer errorCode;

    public WeChatException(Integer errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
    }

}
