// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pb/sku.proto

package com.example.wechatmerchant.skurpc;

public interface SkuReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sku.SkuReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sku_id = 1;</code>
   * @return The skuId.
   */
  java.lang.String getSkuId();
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
  java.lang.String getSkuName();
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
  java.lang.String getSkuImage();
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
  java.lang.String getSkuCount();
  /**
   * <code>string sku_count = 4;</code>
   * @return The bytes for skuCount.
   */
  com.google.protobuf.ByteString
      getSkuCountBytes();

  /**
   * <code>uint64 ctime = 5;</code>
   * @return The ctime.
   */
  long getCtime();

  /**
   * <code>uint64 mtime = 6;</code>
   * @return The mtime.
   */
  long getMtime();
}
