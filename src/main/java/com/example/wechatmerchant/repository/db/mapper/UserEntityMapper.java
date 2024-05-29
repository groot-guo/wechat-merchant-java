package com.example.wechatmerchant.repository.db.mapper;

import com.example.wechatmerchant.repository.db.entity.UserEntity;
import org.apache.ibatis.annotations.*;


@Mapper
public interface UserEntityMapper {

    @Insert("insert into users_tab (openid, nickname, phone, avatar_url) " +
            "values (#{user.openId}, #{user.nickName}, #{user.phone}, #{user.avatarUrl})")
    void insertUser(UserEntity user);

    @Update("update users_tab set nickname=#{user.nickname}, phone=#{user.phone}, " +
            "avatar_url=#{user.avatar_url} where openid=#{user.openid} ")
    void updateUser(UserEntity user);

    @Delete("delete from users_tab where openid = #{openId}")
    void deleteUser(String openId);

    @Select("select * from users_tab where openid = #{openId}")
    UserEntity getUserById(String openId);
}
