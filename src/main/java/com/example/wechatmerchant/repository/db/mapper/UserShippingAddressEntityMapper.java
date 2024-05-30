package com.example.wechatmerchant.repository.db.mapper;


import com.example.wechatmerchant.repository.db.entity.UserShippingAddressEntity;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserShippingAddressEntityMapper {

    @Insert("insert user_shipping_address_tab (openid, shipping_address) values (#{openid}, #{hipping_address})")
    void insert(UserShippingAddressEntity shippingAddress);

    @Update("update user_shipping_address_tab set shipping_address = #{shipping_address} where openid = #{openid}")
    void update (UserShippingAddressEntity shippingAddress);

    @Select("select * from user_shipping_address_tab where openid = #{openid}")
    UserShippingAddressEntity getShippingAddressByOpenid(String openid);

    @Delete("delete from user_shipping_address_tab where openid = #{openid}")
    void deleteByOpenid(String openid);
}
