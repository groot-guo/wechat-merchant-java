package com.example.wechatmerchant.pojo.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserError {
    USER_NOT_FOUND_ERROR(10001, "the user is not existed !"),
    USER_IS_EXISTED_ERROR(10002, "the user is existed !"),;

    private final Integer errorCode;
    private final String errorMsg;
}
