// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sku.proto

package com.example.wechatmerchant.skurpc;

public interface ItemInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sku.ItemInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 item_id = 1;</code>
   * @return The itemId.
   */
  int getItemId();

  /**
   * <code>string item_name = 2;</code>
   * @return The itemName.
   */
  java.lang.String getItemName();
  /**
   * <code>string item_name = 2;</code>
   * @return The bytes for itemName.
   */
  com.google.protobuf.ByteString
      getItemNameBytes();

  /**
   * <code>uint32 category_id = 3;</code>
   * @return The categoryId.
   */
  int getCategoryId();

  /**
   * <code>string category_name = 4;</code>
   * @return The categoryName.
   */
  java.lang.String getCategoryName();
  /**
   * <code>string category_name = 4;</code>
   * @return The bytes for categoryName.
   */
  com.google.protobuf.ByteString
      getCategoryNameBytes();

  /**
   * <code>uint32 shop_id = 5;</code>
   * @return The shopId.
   */
  int getShopId();
}
