package com.example.wechatmerchant.repository.db.mapper;

import com.example.wechatmerchant.repository.db.entity.UserEntity;
import org.apache.ibatis.annotations.*;

// 实际 执行 sql 时，是执行对应字段的 getter 方法，不需要 写 user 这个实体
@Mapper
public interface UserEntityMapper {

    @Insert("insert into users_tab (openid, nickname, phone, avatar_url, ctime, mtime) " +
            "values (#{openId}, #{nickName}, #{phone}, #{avatarUrl}, #{ctime}, #{mtime})")
    void insertUser(UserEntity user);

    @Update("update users_tab set nickname=#{user.nickname}, phone=#{user.phone}, " +
            "avatar_url=#{user.avatar_url} where openid=#{openid} ")
    void updateUser(UserEntity user);

    @Delete("delete from users_tab where openid = #{openId}")
    void deleteUser(String openId);

    @Select("select * from users_tab where openid = #{openId}")
    UserEntity getUserById(String openId);
}
