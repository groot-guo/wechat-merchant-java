// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sku.proto

// Protobuf Java Version: 3.25.3
package com.example.wechatmerchant.skurpc;

public interface GetShopInfoRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sku.GetShopInfoResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.sku.CommonRsp common = 1;</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <code>.sku.CommonRsp common = 1;</code>
   * @return The common.
   */
  com.example.wechatmerchant.skurpc.CommonRsp getCommon();
  /**
   * <code>.sku.CommonRsp common = 1;</code>
   */
  com.example.wechatmerchant.skurpc.CommonRspOrBuilder getCommonOrBuilder();

  /**
   * <code>uint32 shop_id = 2;</code>
   * @return The shopId.
   */
  int getShopId();

  /**
   * <code>string shop_name = 3;</code>
   * @return The shopName.
   */
  java.lang.String getShopName();
  /**
   * <code>string shop_name = 3;</code>
   * @return The bytes for shopName.
   */
  com.google.protobuf.ByteString
      getShopNameBytes();
}
