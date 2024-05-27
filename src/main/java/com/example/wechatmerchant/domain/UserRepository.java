package com.example.wechatmerchant.domain;

import com.example.wechatmerchant.repository.db.entity.UserEntity;

public interface UserRepository {
    void insertUser(UserEntity user);

    void updateUser(UserEntity user);

    void deleteUser(String openId);

    UserEntity getUserByOpenId(String openId);
}
