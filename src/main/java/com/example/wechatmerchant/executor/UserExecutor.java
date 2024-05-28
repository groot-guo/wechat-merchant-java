package com.example.wechatmerchant.executor;


import com.example.wechatmerchant.domain.UserRepository;
import com.example.wechatmerchant.domain.UserSessionRepository;
import com.example.wechatmerchant.pojo.error.UserError;
import com.example.wechatmerchant.pojo.exception.UserException;
import com.example.wechatmerchant.pojo.vo.UserVO;
import com.example.wechatmerchant.repository.db.entity.UserEntity;
import com.example.wechatmerchant.repository.db.entity.UserSessionEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Objects;


@Component
@AllArgsConstructor
public class UserExecutor {

    private final UserRepository userRepository;

    private final UserSessionRepository usersessionRepository;

    @Transactional
    public void createUser(UserVO.RegisterUserReq userReq) {

        Instant now = Instant.now();
        UserEntity userEntity = new UserEntity();
        userEntity.setOpenId(userReq.getOpenId());
        userEntity.setNickName(userReq.getNickName());
        userEntity.setPhone(userReq.getPhone());
        userEntity.setAvatarUrl(userReq.getAvatarUrl());
        userEntity.setCtime(now.getNano());
        userEntity.setMtime(now.getNano());

        userRepository.insertUser(userEntity);
    }

    public void createUserSession(UserVO.UserLoginReq userLoginReq) throws UserException {
        UserEntity userEntity = userRepository.getUserByOpenId(userLoginReq.getOpenId());
        if (userEntity == null || Objects.equals(userEntity.getOpenId(), "")) {
            // define error msg todo
            throw new UserException(UserError.USER_NOT_FOUND_ERROR);
        }
        // db save
        Instant now = Instant.now();
        UserSessionEntity userSessionEntity = new UserSessionEntity();
        userSessionEntity.setOpenId(userLoginReq.getOpenId());
        userSessionEntity.setSessionKey(userLoginReq.getSessionKey());
        userSessionEntity.setCtime(now.getNano());
        userSessionEntity.setMtime(now.getNano());

        usersessionRepository.createUserSession(userSessionEntity);

    }

    // get user session
    public UserSessionEntity getUserSession(String openId) throws UserException {
        UserSessionEntity userSessionEntity = usersessionRepository.getUserSessionByOpenid(openId);

        if (userSessionEntity == null) {
            throw new UserException(UserError.USER_NOT_FOUND_ERROR);
        }
        if (userSessionEntity.getSessionKey() == null || Objects.equals(userSessionEntity.getSessionKey(), "")) {
            throw new UserException(UserError.USER_NOT_FOUND_ERROR);
        }

        return userSessionEntity;
    }

    public UserEntity getUserByOpenId(String openId) {
        return userRepository.getUserByOpenId(openId);
    }
}
