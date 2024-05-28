package com.example.wechatmerchant.pojo.exception;

import com.example.wechatmerchant.pojo.error.UserError;
import lombok.Getter;


@Getter
public class UserException extends Exception{

    private final int errorCode;

    public UserException(UserError userError) {
        super(userError.getErrorMsg());
        this.errorCode = userError.getErrorCode();
    }
}
