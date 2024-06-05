package com.example.wechatmerchant.service;


import com.example.wechatmerchant.executor.ShoppingCartExecutor;
import com.example.wechatmerchant.pojo.exception.ShoppingCartException;
import com.example.wechatmerchant.pojo.vo.CommonVO;
import com.example.wechatmerchant.pojo.vo.ShoppingCartVO;
import com.example.wechatmerchant.repository.db.entity.ShoppingCartEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
@AllArgsConstructor
public class ShoppingService {

    private final ShoppingCartExecutor shoppingCartExecutor;

    private final RedisTemplate<String, Object> redisTemplate;


    public ShoppingCartVO.ShoppingCartRsp getShoppingCartInfo(String openid) {
        ShoppingCartVO.ShoppingCartRsp shoppingCartRsp = new ShoppingCartVO.ShoppingCartRsp();
        try {
            List<ShoppingCartVO.ShoppingCartRspData> resultList = new ArrayList<>();

            // 1. query redis
            Set<Object> redisData = redisTemplate.opsForZSet().rangeByScore(openid, 0, -1);

            if (redisData != null && !redisData.isEmpty()) {
                for (Object redisDataObj : redisData) {
                    ShoppingCartEntity shoppingCartEntity = (ShoppingCartEntity) redisDataObj;
                    ShoppingCartVO.ShoppingCartRspData shoppingCartRspData = new ShoppingCartVO.ShoppingCartRspData();
                    shoppingCartRspData.setOpenid(shoppingCartEntity.getOpenid());
                    shoppingCartRspData.setSkuId(shoppingCartEntity.getSkuId());
                    shoppingCartRspData.setSkuName(shoppingCartEntity.getSkuName());
                    shoppingCartRspData.setSkuCount(shoppingCartEntity.getSkuCount());
                    resultList.add(shoppingCartRspData);
                }
                // 构造完毕，赋值
                shoppingCartRsp.setData(resultList);
                return shoppingCartRsp;
            }


            // 查 sql
            log.info("redis is not found, query db .");
            List<ShoppingCartEntity> list =  shoppingCartExecutor.getShoppingCart(openid);

            for (ShoppingCartEntity shoppingCartEntity : list) {
                ShoppingCartVO.ShoppingCartRspData shoppingCartRspData = new ShoppingCartVO.ShoppingCartRspData();
                shoppingCartRspData.setOpenid(shoppingCartEntity.getOpenid());
                shoppingCartRspData.setSkuId(shoppingCartEntity.getSkuId());
                shoppingCartRspData.setSkuName(shoppingCartEntity.getSkuName());
                shoppingCartRspData.setSkuCount(shoppingCartEntity.getSkuCount());
                resultList.add(shoppingCartRspData);
            }

            // 构造完毕，赋值
            shoppingCartRsp.setData(resultList);
            return shoppingCartRsp;
        } catch (ShoppingCartException e ) {
            log.error(e.getMessage());
            shoppingCartRsp.setErrorCode(e.getErrorCode());
            shoppingCartRsp.setErrorMsg(e.getMessage());
            return shoppingCartRsp;
        }
    }


    public CommonVO.CommonRsp addShoppingCartInfo(ShoppingCartVO.AddShoppingCartReq addShoppingCartReq) {
        CommonVO.CommonRsp rsp = new CommonVO.CommonRsp();
        try {
            shoppingCartExecutor.insertShoppingCart(
                    addShoppingCartReq.getOpenid(),
                    addShoppingCartReq.getSkuId(),
                    addShoppingCartReq.getSkuName(),
                    addShoppingCartReq.getSkuCount()
            );
            rsp.setErrorCode(0);
            rsp.setErrorMsg("ok");
            return rsp;
        } catch (Exception e) {
            rsp.setErrorCode(-1);
            rsp.setErrorMsg(e.getMessage());
            return rsp;
        }
    }

}
