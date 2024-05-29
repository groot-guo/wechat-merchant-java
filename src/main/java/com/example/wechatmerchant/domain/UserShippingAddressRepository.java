package com.example.wechatmerchant.domain;

import com.example.wechatmerchant.repository.db.entity.UserShippingAddressEntity;

public interface UserShippingAddressRepository {

    void createUserShippingAddress(UserShippingAddressEntity shippingAddress);

    void updateUserShippingAddress(UserShippingAddressEntity shippingAddress);

    void deleteUserShippingAddress(UserShippingAddressEntity shippingAddress);

    UserShippingAddressEntity getUserShippingAddress(String userId);
}
