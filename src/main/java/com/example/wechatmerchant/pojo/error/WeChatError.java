package com.example.wechatmerchant.pojo.error;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum WeChatError {
    INVALID_SIGNATURE(87009, "invalid_signature"),
    OK(0, "ok");

    private final Integer errCode;
    private final String errMsg;


}
