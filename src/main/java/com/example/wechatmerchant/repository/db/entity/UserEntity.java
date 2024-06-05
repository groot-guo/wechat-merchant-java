package com.example.wechatmerchant.repository.db.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

/*
内部实现字段，会与数据库进行匹配，不存在则返回 null，只会优化首字母大写。
所以当字段返回与数据必须一致，才赋值返回。
使用 lombok 帮助生成 get set 函数, 还有构造函数，及以下注解方法
@RequiredArgsConstructor：生成一个构造函数，该构造函数包含所有标记为final的字段，以及所有使用@NonNull注解的字段。
@ToString：生成一个toString方法，默认情况下，它会打印类名、所有字段的名称和值。
@EqualsAndHashCode：生成equals和hashCode方法。
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class UserEntity extends CommonEntity {

    private Long id ;

    private String openId;

    private String nickName;

    private String phone;

    private String avatarUrl;
}

