// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sku.proto

// Protobuf Java Version: 3.25.3
package com.example.wechatmerchant.skurpc;

public interface GetItemInfoRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sku.GetItemInfoResp)
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
   * <code>repeated .sku.ItemInfo data = 2;</code>
   */
  java.util.List<com.example.wechatmerchant.skurpc.ItemInfo> 
      getDataList();
  /**
   * <code>repeated .sku.ItemInfo data = 2;</code>
   */
  com.example.wechatmerchant.skurpc.ItemInfo getData(int index);
  /**
   * <code>repeated .sku.ItemInfo data = 2;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .sku.ItemInfo data = 2;</code>
   */
  java.util.List<? extends com.example.wechatmerchant.skurpc.ItemInfoOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .sku.ItemInfo data = 2;</code>
   */
  com.example.wechatmerchant.skurpc.ItemInfoOrBuilder getDataOrBuilder(
      int index);

  /**
   * <code>uint32 total = 3;</code>
   * @return The total.
   */
  int getTotal();
}
