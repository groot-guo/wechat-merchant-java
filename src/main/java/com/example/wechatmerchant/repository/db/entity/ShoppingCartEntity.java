package com.example.wechatmerchant.repository.db.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ShoppingCartEntity extends CommonEntity {

    private Long id;

    private String openid;

    private String skuId;

    private String skuName;

    private Long skuCount;
}
