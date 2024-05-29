package com.example.wechatmerchant.repository.db.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class UserShippingAddressEntity extends CommonEntity {

    private Integer id;

    private String openid;

    private String shippingAddress;
}
