package com.example.wechatmerchant.service;

import com.example.wechatmerchant.executor.UserExecutor;
import com.example.wechatmerchant.wechat.WeChatClient;
import com.example.wechatmerchant.pojo.exception.UserException;
import com.example.wechatmerchant.pojo.exception.WeChatException;
import com.example.wechatmerchant.pojo.vo.UserVO;
import com.example.wechatmerchant.pojo.vo.WeChatVO;
import com.example.wechatmerchant.repository.db.entity.UserEntity;
import com.example.wechatmerchant.repository.db.entity.UserSessionEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.wechatmerchant.pojo.error.UserError;

@Slf4j
@Service
@AllArgsConstructor
public class UserService {

    private final UserExecutor userExecutor;

    private final RedisTemplate<String, Object> redisTemplate;

    private final WeChatClient weChatService;


    public UserEntity getUserById(String openId) {
        return userExecutor.getUserByOpenId(openId);
    }

    @Transactional
    public UserVO.UserResp registerUser(UserVO.RegisterUserReq userReq) {
        try {
            UserEntity userEntity = userExecutor.getUserByOpenId(userReq.getOpenId());
            if (userEntity != null) {
                throw new UserException(UserError.USER_IS_EXISTED_ERROR);
            }
            userExecutor.createUser(userReq);

        } catch (UserException e) {
            // 返回错误码
            log.error("login: {}", e.getMessage());
            return new UserVO.UserResp(e.getErrorCode(), e.getMessage());
        }
        return null;
    }

    @Transactional
    public UserVO.UserResp login(UserVO.UserLoginReq userLoginReq) {
        try {
            log.info("login: {}", userLoginReq);
            // 1. find openid
            UserEntity userEntity = userExecutor.getUserByOpenId(userLoginReq.getOpenId());
            if (userEntity == null) {
                throw new UserException(UserError.USER_NOT_FOUND_ERROR); // not found user
            }

            // 2. user is existed
            userExecutor.createUserSession(userLoginReq);

            // 3. redis save
            redisTemplate.opsForValue().set(userLoginReq.getOpenId(), userLoginReq.getSessionKey());

            return new UserVO.UserResp(0, "ok");
        } catch (UserException e) {
            // 返回错误码
            log.error("login: {}", e.getMessage());
            return new UserVO.UserResp(e.getErrorCode(), e.getMessage());
        }
    }

    public boolean checkUserSession(UserVO.CheckUserSessionReq checkUserSessionReq) {
        try {
            // aop log 全面接入 todo
            log.info("checkUserSession: {}", checkUserSessionReq);

            // 1. redis get session key
            String sessionKey  = (String) redisTemplate.opsForValue().get(checkUserSessionReq.getOpenId());
            if (sessionKey != null && sessionKey.equals(checkUserSessionReq.getSessionKey())) {
                return true;
            }

            // 2. 请求 wechat 验证
            WeChatVO.CheckSessionReq checkSessionReq = new WeChatVO.CheckSessionReq();
            checkSessionReq.setOpenId(checkUserSessionReq.getOpenId());
            checkSessionReq.setSessionKey(checkUserSessionReq.getSessionKey());

            boolean isExisted = weChatService.checkSession(checkSessionReq);
            // wechat not found ， return false
            if (!isExisted) {
                log.error("sessionKey is null, openid: {}", checkUserSessionReq.getOpenId());
                return false;
            }

            // 3. db repo get session key
            UserSessionEntity userSessionEntity =  userExecutor.getUserSession(checkUserSessionReq.getOpenId());
            // 先判断 存在情况
            if (userSessionEntity != null && userSessionEntity.getSessionKey().equals(checkUserSessionReq.getSessionKey())) {
                return true;
            }

            // 4. session db 中不存在，说明未创建登录过，所以去走登录。由登录创建 数据
            return false;
        } catch (WeChatException | UserException | InterruptedException e) {
            log.error("checkUserSession error", e);
            return false;
        }
    }

}
