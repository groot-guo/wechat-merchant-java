// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sku.proto

// Protobuf Java Version: 3.25.3
package com.example.wechatmerchant.skurpc;

public interface UpdateSkuInventoryInfoReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sku.UpdateSkuInventoryInfoReq)
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
   * <code>uint32 inventory_qty = 2;</code>
   * @return The inventoryQty.
   */
  int getInventoryQty();

  /**
   * <code>uint32 damage_qty = 3;</code>
   * @return The damageQty.
   */
  int getDamageQty();
}
