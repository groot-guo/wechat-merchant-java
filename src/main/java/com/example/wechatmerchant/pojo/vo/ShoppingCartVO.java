package com.example.wechatmerchant.pojo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@Data
public class ShoppingCartVO  {

    @Data
    @EqualsAndHashCode(callSuper = false)
    public static class ShoppingCartRsp extends CommonVO.CommonRsp {
        @JsonProperty("data")
        List<ShoppingCartRspData> data;
    }

    @Data
    public static class ShoppingCartRspData {
        @JsonProperty("openid")
        private String openid;
        @JsonProperty("sku_id")
        private String skuId;
        @JsonProperty("sku_name")
        private String skuName;
        @JsonProperty("sku_count")
        private Long skuCount;
    }

    @Data
    public static class AddShoppingCartReq {
        @JsonProperty("openid")
        private String openid;
        @JsonProperty("sku_id")
        private String skuId;
        @JsonProperty("sku_name")
        private String skuName;
        @JsonProperty("sku_count")
        private Long skuCount;
    }

}
