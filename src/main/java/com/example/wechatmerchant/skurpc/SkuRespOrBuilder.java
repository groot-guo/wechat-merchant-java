// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pb/sku.proto

package com.example.wechatmerchant.skurpc;

public interface SkuRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sku.SkuResp)
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
   * <code>repeated .sku.SkuInfo data = 2;</code>
   */
  java.util.List<com.example.wechatmerchant.skurpc.SkuInfo> 
      getDataList();
  /**
   * <code>repeated .sku.SkuInfo data = 2;</code>
   */
  com.example.wechatmerchant.skurpc.SkuInfo getData(int index);
  /**
   * <code>repeated .sku.SkuInfo data = 2;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .sku.SkuInfo data = 2;</code>
   */
  java.util.List<? extends com.example.wechatmerchant.skurpc.SkuInfoOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .sku.SkuInfo data = 2;</code>
   */
  com.example.wechatmerchant.skurpc.SkuInfoOrBuilder getDataOrBuilder(
      int index);
}
