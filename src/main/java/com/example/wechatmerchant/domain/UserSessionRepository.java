package com.example.wechatmerchant.domain;

import com.example.wechatmerchant.repository.db.entity.UserSessionEntity;

public interface UserSessionRepository {

    UserSessionEntity getUserSessionByOpenid(String openId);

    void createUserSession(UserSessionEntity userSession);

    void updateUserSession(UserSessionEntity userSession);

    void deleteUserSession(String openId);
}
