package com.example.wechatmerchant.repository;

import com.example.wechatmerchant.domain.UserShippingAddressRepository;
import com.example.wechatmerchant.repository.db.entity.UserShippingAddressEntity;
import com.example.wechatmerchant.repository.db.mapper.UserShippingAddressEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@AllArgsConstructor
public class UserShippingAddressRepositoryImp implements UserShippingAddressRepository {

    private final UserShippingAddressEntityMapper shippingAddressMapper;

    @Override
    public void createUserShippingAddress(UserShippingAddressEntity shippingAddress) {

    }

    @Override
    public void updateUserShippingAddress(UserShippingAddressEntity shippingAddress) {

    }

    @Override
    public void deleteUserShippingAddress(UserShippingAddressEntity shippingAddress) {

    }

    @Override
    public UserShippingAddressEntity getUserShippingAddress(String userId) {
        return null;
    }
}
