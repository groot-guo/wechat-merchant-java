package com.example.wechatmerchant.repository.db.entity;


import lombok.Data;

@Data
public class UserSessionEntity {

    private Integer id ;

    private String openId;

    private String sessionKey ;

    private Integer ctime;

    private Integer mtime;
}
