// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sku.proto

package com.example.wechatmerchant.skurpc;

public interface SkuInventoryReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sku.SkuInventoryReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string sku_id = 1;</code>
   * @return A list containing the skuId.
   */
  java.util.List<java.lang.String>
      getSkuIdList();
  /**
   * <code>repeated string sku_id = 1;</code>
   * @return The count of skuId.
   */
  int getSkuIdCount();
  /**
   * <code>repeated string sku_id = 1;</code>
   * @param index The index of the element to return.
   * @return The skuId at the given index.
   */
  java.lang.String getSkuId(int index);
  /**
   * <code>repeated string sku_id = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the skuId at the given index.
   */
  com.google.protobuf.ByteString
      getSkuIdBytes(int index);
}
