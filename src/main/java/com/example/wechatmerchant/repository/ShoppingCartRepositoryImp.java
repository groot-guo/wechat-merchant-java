package com.example.wechatmerchant.repository;

import com.example.wechatmerchant.domain.ShoppingCartRepository;
import com.example.wechatmerchant.repository.db.entity.ShoppingCartEntity;
import com.example.wechatmerchant.repository.db.mapper.ShoppingCartEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class ShoppingCartRepositoryImp implements ShoppingCartRepository {

    private final ShoppingCartEntityMapper shoppingCartEntityMapper;

    @Override
    public void deleteShoppingCart(String openid, String skuId) {
        shoppingCartEntityMapper.deleteByOpenidSkuId(openid, skuId);
    }

    @Override
    public void addShoppingCart(String openid, String skuId, String skuName, Long skuCount) {
        ShoppingCartEntity shoppingCartEntity = new ShoppingCartEntity();
        shoppingCartEntity.setOpenid(openid);
        shoppingCartEntity.setSkuId(skuId);
        shoppingCartEntity.setSkuCount(skuCount);
        shoppingCartEntity.setSkuName(skuName);
        shoppingCartEntityMapper.insert(shoppingCartEntity);
    }

    @Override
    public void updateShoppingCart(String openid, String skuId,  Long skuCount) {
        shoppingCartEntityMapper.updateByOpenidSkuId(openid, skuId, skuCount);
    }

    @Override
    public List<ShoppingCartEntity> queryShoppingCart(String openid) {
        return shoppingCartEntityMapper.selectByOpenid(openid);
    }
}
