package com.example.wechatmerchant.controllers;

import com.example.wechatmerchant.skurpc.SkuRpcClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class ShopCartController {

    private final SkuRpcClient skuRpcClient;

    @PostMapping("/shopping_cart/get")
    void getShoppingCartInfo() {
        List<String> data = new ArrayList<String>();
        data.add("1");
        try {
            skuRpcClient.reduceSkuInventory(data);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
