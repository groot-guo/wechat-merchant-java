package com.example.wechatmerchant.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import com.example.wechatmerchant.domain.UserSessionRepository;
import com.example.wechatmerchant.repository.db.entity.UserSessionEntity;
import com.example.wechatmerchant.repository.db.mapper.UserSessionEntityMapper;


@Repository
@AllArgsConstructor
public class UserSessionRepositoryImp implements UserSessionRepository {

    private final UserSessionEntityMapper userSessionEntityMapper;

    @Override
    public UserSessionEntity getUserSessionByOpenid(String openId) {
        return userSessionEntityMapper.getUserSessionByOpenId(openId);
    }

    @Override
    public void createUserSession(UserSessionEntity userSession) {
        userSessionEntityMapper.insertUserSession(userSession);
    }

    @Override
    public void updateUserSession(UserSessionEntity userSession) {
        userSessionEntityMapper.updateUserSession(userSession);
    }

    @Override
    public void deleteUserSession(String openId) {
        userSessionEntityMapper.deleteUserSessionByOpenId(openId);
    }
}
