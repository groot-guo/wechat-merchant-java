package com.example.wechatmerchant.domain;

import com.example.wechatmerchant.repository.db.entity.ShoppingCartEntity;

import java.util.List;

public interface ShoppingCartRepository {

    void deleteShoppingCart(String openid, String skuId);

    void addShoppingCart(String openid, String skuId, String skuName, Long skuCount);

    void updateShoppingCart(String openid, String skuId, Long skuCount);

    List<ShoppingCartEntity> queryShoppingCart(String openid);
}
