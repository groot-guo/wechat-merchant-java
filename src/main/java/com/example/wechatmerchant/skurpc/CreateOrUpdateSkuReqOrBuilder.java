// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sku.proto

package com.example.wechatmerchant.skurpc;

public interface CreateOrUpdateSkuReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sku.CreateOrUpdateSkuReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sku_id = 1;</code>
   * @return The skuId.
   */
  String getSkuId();
  /**
   * <code>string sku_id = 1;</code>
   * @return The bytes for skuId.
   */
  com.google.protobuf.ByteString
      getSkuIdBytes();

  /**
   * <code>string sku_name = 2;</code>
   * @return The skuName.
   */
  String getSkuName();
  /**
   * <code>string sku_name = 2;</code>
   * @return The bytes for skuName.
   */
  com.google.protobuf.ByteString
      getSkuNameBytes();

  /**
   * <code>string sku_image = 3;</code>
   * @return The skuImage.
   */
  String getSkuImage();
  /**
   * <code>string sku_image = 3;</code>
   * @return The bytes for skuImage.
   */
  com.google.protobuf.ByteString
      getSkuImageBytes();

  /**
   * <code>string sku_count = 4;</code>
   * @return The skuCount.
   */
  String getSkuCount();
  /**
   * <code>string sku_count = 4;</code>
   * @return The bytes for skuCount.
   */
  com.google.protobuf.ByteString
      getSkuCountBytes();
}