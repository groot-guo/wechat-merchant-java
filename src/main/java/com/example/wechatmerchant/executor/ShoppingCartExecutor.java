package com.example.wechatmerchant.executor;


import com.example.wechatmerchant.domain.ShoppingCartRepository;
import com.example.wechatmerchant.pojo.error.ShoppingCartError;
import com.example.wechatmerchant.pojo.exception.ShoppingCartException;
import com.example.wechatmerchant.repository.db.entity.ShoppingCartEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ShoppingCartExecutor {
    private final ShoppingCartRepository shoppingCartRepository;

    public List<ShoppingCartEntity> getShoppingCart(String openid) throws ShoppingCartException {
        List<ShoppingCartEntity> result = shoppingCartRepository.queryShoppingCart(openid);

        if (result.isEmpty()) {
            throw new ShoppingCartException(ShoppingCartError.NOT_FOUND_SHOPPING_INFO);
        }

        return result;
    }


    public void insertShoppingCart(String openid, String skuId, String skuName, Long skuCount)  {
        // todo 做一下两种方式区分，由 repo 完成构造写入，此处可以修改为什么
        // todo 另外 sql 判断执行完成，是否返回计数 1？
        shoppingCartRepository.addShoppingCart(openid, skuId, skuName, skuCount);
    }
}
