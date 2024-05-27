package com.example.wechatmerchant.repository;

import com.example.wechatmerchant.domain.UserRepository;
import com.example.wechatmerchant.repository.db.entity.UserEntity;
import com.example.wechatmerchant.repository.db.mapper.UserEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class UserRepositoryImp implements UserRepository {

    private final UserEntityMapper userMapper;

    @Override
    public void insertUser(UserEntity user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(UserEntity user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(String openId) {
        userMapper.deleteUser(openId);
    }

    @Override
    public UserEntity getUserByOpenId(String openId) {
        return userMapper.getUserById(openId);
    }
    // 其他方法...
}
