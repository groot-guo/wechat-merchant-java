package com.example.wechatmerchant.repository.db.mapper;


import com.example.wechatmerchant.repository.db.entity.UserShippingAddressEntity;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserShippingAddressEntityMapper {

    @Insert("insert user_shipping_address_tab (openid, shipping_address) values (#{openid}, #{shippingAddress})")
    void insert(UserShippingAddressEntity shippingAddress);

    @Update("update user_shipping_address_tab set shipping_address = #{shippingAddress} where openid = #{openid}")
    void update (UserShippingAddressEntity shippingAddress);

    @Select("select * from user_shipping_address_tab where openid = #{openid} ")
    UserShippingAddressEntity getShippingAddressByOpenid(String openid);

    @Delete("delete from user_shipping_address_tab where openid = #{openid} and shipping_address = #{shippingAddress}")
    void deleteByOpenid(String openid, String shippingAddress);
}
