package com.example.wechatmerchant.repository.db.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class UserShippingAddressEntity extends CommonEntity {

    private Long id;

    private String openid;

    private String shippingAddress;
}
