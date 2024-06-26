package com.example.wechatmerchant.repository.db.mapper;

import org.apache.ibatis.annotations.*;

import com.example.wechatmerchant.repository.db.entity.UserSessionEntity;

@Mapper
public interface UserSessionEntityMapper {

    @Update("update user_session_tab set session_key=#{sessionKey}, mtime=#{mtime} where openid=#{userSession.openId}")
    void updateUserSession(UserSessionEntity userSession);

    @Insert("insert user_session_tab (openid, session_key, ctime, mtime) values (#{openId}, #{sessionKey}, #{ctime}, #{mtime})")
    void insertUserSession(UserSessionEntity userSession);

    @Select("select * from user_session_tab where openid = #{openId}")
    UserSessionEntity getUserSessionByOpenId(String openId);

    @Delete("delete from user_session_tab where openid=#{openId}")
    void deleteUserSessionByOpenId(String openId);
}
