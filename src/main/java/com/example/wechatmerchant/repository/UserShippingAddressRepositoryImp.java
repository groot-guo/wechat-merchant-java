package com.example.wechatmerchant.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import com.example.wechatmerchant.domain.UserShippingAddressRepository;
import com.example.wechatmerchant.repository.db.entity.UserShippingAddressEntity;
import com.example.wechatmerchant.repository.db.mapper.UserShippingAddressEntityMapper;



@Repository
@AllArgsConstructor
public class UserShippingAddressRepositoryImp implements UserShippingAddressRepository {

    private final UserShippingAddressEntityMapper shippingAddressMapper;

    @Override
    public void createUserShippingAddress(UserShippingAddressEntity shippingAddress) {
        shippingAddressMapper.insert(shippingAddress);
    }

    @Override
    public void updateUserShippingAddress(UserShippingAddressEntity shippingAddress) {
        shippingAddressMapper.update(shippingAddress);
    }

    @Override
    public void deleteUserShippingAddress(UserShippingAddressEntity shippingAddress) {
        shippingAddressMapper.deleteByOpenid(shippingAddress.getOpenid(), shippingAddress.getShippingAddress());
    }

    @Override
    public UserShippingAddressEntity getUserShippingAddress(String openid) {
        return shippingAddressMapper.getShippingAddressByOpenid(openid);
    }
}
