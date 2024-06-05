package com.example.wechatmerchant.repository.db.mapper;

import com.example.wechatmerchant.repository.db.entity.ShoppingCartEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShoppingCartEntityMapper {

    @Delete("delete from shopping_cart_tab where openid = #{openid} and sku_id = #{skuId}")
    void deleteByOpenidSkuId(String openid, String skuId);

    @Insert("insert into shopping_cart_tab (openid, sku_id, sku_name, sku_count, ctime, mtime) " +
            "values (#{openid}, #{skuId}, #{skuName}, #{skuCount}, #{ctime}, #{mtime})")
    void insert(ShoppingCartEntity record);

    // 默认按照 mtime 排序
    @Select("select * from shopping_cart_tab where openid = #{openid} order by mtime")
    List<ShoppingCartEntity> selectByOpenid(String openid);

    @Select("select * from shopping_cart_tab where openid = #{openid} and sku_id = #{skuId}")
    ShoppingCartEntity selectByOpenidSkuId(String openid, String skuId);

    @Update("update shopping_cart_tab set sku_count = #{skuCount} where openid = #{openid} and sku_id = #{skuId}")
    void updateByOpenidSkuId(String openid, String skuId, Long skuCount);

}
