// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sku.proto

// Protobuf Java Version: 3.25.3
package com.example.wechatmerchant.skurpc;

public final class Sku {
  private Sku() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_CommonRsp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_CommonRsp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_SkuReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_SkuReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_SkuResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_SkuResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_SkuInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_SkuInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_CreateSkuReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_CreateSkuReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_GetItemInfoReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_GetItemInfoReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_GetItemInfoResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_GetItemInfoResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_ItemInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_ItemInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_CreateOrUpdateItemInfoReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_CreateOrUpdateItemInfoReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_SkuInventoryReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_SkuInventoryReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_SkuInventoryResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_SkuInventoryResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_SkuInventoryInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_SkuInventoryInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_UpdateSkuInventoryInfoReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_UpdateSkuInventoryInfoReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_GetShopInfoReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_GetShopInfoReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_GetShopInfoResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_GetShopInfoResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_CreateShopReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_CreateShopReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sku_UpdateShopReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sku_UpdateShopReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030src/main/proto/sku.proto\022\003sku\"&\n\tCommo" +
      "nRsp\022\014\n\004code\030\001 \001(\003\022\013\n\003msg\030\002 \001(\t\"@\n\006SkuRe" +
      "q\022\016\n\006sku_id\030\001 \003(\t\022\023\n\013page_number\030\002 \001(\004\022\021" +
      "\n\tpage_size\030\003 \001(\004\"T\n\007SkuResp\022\036\n\006common\030\001" +
      " \001(\0132\016.sku.CommonRsp\022\032\n\004data\030\002 \003(\0132\014.sku" +
      ".SkuInfo\022\r\n\005total\030\003 \001(\r\"\252\001\n\007SkuInfo\022\016\n\006s" +
      "ku_id\030\001 \001(\t\022\020\n\010sku_name\030\002 \001(\t\022\021\n\tsku_ima" +
      "ge\030\003 \001(\t\022\017\n\007item_id\030\004 \001(\r\022\021\n\titem_name\030\005" +
      " \001(\t\022\022\n\nproduct_id\030\006 \001(\r\022\024\n\014product_name" +
      "\030\007 \001(\t\022\r\n\005ctime\030\010 \001(\r\022\r\n\005mtime\030\t \001(\r\"r\n\014" +
      "CreateSkuReq\022\017\n\007item_id\030\001 \001(\t\022\020\n\010item_na" +
      "m\030\002 \001(\t\022\022\n\nproduct_id\030\003 \001(\t\022\024\n\014product_n" +
      "ame\030\004 \001(\t\022\025\n\rinventory_qty\030\005 \001(\r\"q\n\016GetI" +
      "temInfoReq\022\017\n\007item_id\030\001 \001(\r\022\021\n\titem_name" +
      "\030\002 \001(\t\022\023\n\013category_id\030\003 \001(\r\022\025\n\rcategory_" +
      "name\030\004 \001(\t\022\017\n\007shop_id\030\005 \001(\r\"]\n\017GetItemIn" +
      "foResp\022\036\n\006common\030\001 \001(\0132\016.sku.CommonRsp\022\033" +
      "\n\004data\030\002 \003(\0132\r.sku.ItemInfo\022\r\n\005total\030\003 \001" +
      "(\r\"k\n\010ItemInfo\022\017\n\007item_id\030\001 \001(\r\022\021\n\titem_" +
      "name\030\002 \001(\t\022\023\n\013category_id\030\003 \001(\r\022\025\n\rcateg" +
      "ory_name\030\004 \001(\t\022\017\n\007shop_id\030\005 \001(\r\"{\n\031Creat" +
      "eOrUpdateItemInfoReq\022\017\n\007item_id\030\001 \001(\r\022\021\n" +
      "\titem_name\030\002 \001(\t\022\023\n\013category_id\030\003 \001(\r\022\024\n" +
      "\014category_nam\030\004 \001(\t\022\017\n\007shop_id\030\005 \001(\r\"!\n\017" +
      "SkuInventoryReq\022\016\n\006sku_id\030\001 \003(\t\"W\n\020SkuIn" +
      "ventoryResp\022\036\n\006common\030\001 \001(\0132\016.sku.Common" +
      "Rsp\022#\n\004data\030\002 \003(\0132\025.sku.SkuInventoryInfo" +
      "\"M\n\020SkuInventoryInfo\022\016\n\006sku_id\030\001 \001(\t\022\025\n\r" +
      "inventory_qty\030\002 \001(\r\022\022\n\ndamage_qty\030\003 \001(\r\"" +
      "V\n\031UpdateSkuInventoryInfoReq\022\016\n\006sku_id\030\001" +
      " \001(\t\022\025\n\rinventory_qty\030\002 \001(\r\022\022\n\ndamage_qt" +
      "y\030\003 \001(\r\"\n\n\010Response\"4\n\016GetShopInfoReq\022\017\n" +
      "\007shop_id\030\001 \001(\r\022\021\n\tshop_name\030\002 \001(\t\"U\n\017Get" +
      "ShopInfoResp\022\036\n\006common\030\001 \001(\0132\016.sku.Commo" +
      "nRsp\022\017\n\007shop_id\030\002 \001(\r\022\021\n\tshop_name\030\003 \001(\t" +
      "\"3\n\rCreateShopReq\022\017\n\007shop_id\030\001 \001(\r\022\021\n\tsh" +
      "op_name\030\002 \001(\t\"3\n\rUpdateShopReq\022\017\n\007shop_i" +
      "d\030\001 \001(\r\022\021\n\tshop_name\030\002 \001(\t2i\n\nSkuService" +
      "\022\'\n\nGetSkuInfo\022\013.sku.SkuReq\032\014.sku.SkuRes" +
      "p\0222\n\rCreateSkuInfo\022\021.sku.CreateSkuReq\032\016." +
      "sku.CommonRsp2\313\001\n\013ItemService\0228\n\013GetItem" +
      "Info\022\023.sku.GetItemInfoReq\032\024.sku.GetItemI" +
      "nfoResp\022@\n\016CreateItemInfo\022\036.sku.CreateOr" +
      "UpdateItemInfoReq\032\016.sku.CommonRsp\022@\n\016Upd" +
      "ateItemInfo\022\036.sku.CreateOrUpdateItemInfo" +
      "Req\032\016.sku.CommonRsp2\363\004\n\023SkuInventoryServ" +
      "ice\022B\n\023GetSkuInventoryInfo\022\024.sku.SkuInve" +
      "ntoryReq\032\025.sku.SkuInventoryResp\022H\n\026Updat" +
      "eSkuInventoryInfo\022\036.sku.UpdateSkuInvento" +
      "ryInfoReq\032\016.sku.CommonRsp\022H\n\026DeductSkuIn" +
      "ventorySaga\022\036.sku.UpdateSkuInventoryInfo" +
      "Req\032\016.sku.CommonRsp\022P\n\036DeductSkuInventor" +
      "ySagaRollback\022\036.sku.UpdateSkuInventoryIn" +
      "foReq\032\016.sku.CommonRsp\022J\n\030DeductSkuInvent" +
      "oryTccTry\022\036.sku.UpdateSkuInventoryInfoRe" +
      "q\032\016.sku.CommonRsp\022M\n\033DeductSkuInventoryT" +
      "ccSubmit\022\036.sku.UpdateSkuInventoryInfoReq" +
      "\032\016.sku.CommonRsp\022O\n\035DeductSkuInventoryTc" +
      "cRollback\022\036.sku.UpdateSkuInventoryInfoRe" +
      "q\032\016.sku.CommonRsp\022F\n\024DeductSkuInventoryX" +
      "a\022\036.sku.UpdateSkuInventoryInfoReq\032\016.sku." +
      "CommonRsp2\263\001\n\013ShopService\0228\n\013GetShopInfo" +
      "\022\023.sku.GetShopInfoReq\032\024.sku.GetShopInfoR" +
      "esp\0224\n\016CreateShopInfo\022\022.sku.CreateShopRe" +
      "q\032\016.sku.CommonRsp\0224\n\016UpdateShopInfo\022\022.sk" +
      "u.UpdateShopReq\032\016.sku.CommonRspB,\n!com.e" +
      "xample.wechatmerchant.skurpcP\001Z\005./skub\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sku_CommonRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sku_CommonRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_CommonRsp_descriptor,
        new java.lang.String[] { "Code", "Msg", });
    internal_static_sku_SkuReq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sku_SkuReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_SkuReq_descriptor,
        new java.lang.String[] { "SkuId", "PageNumber", "PageSize", });
    internal_static_sku_SkuResp_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sku_SkuResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_SkuResp_descriptor,
        new java.lang.String[] { "Common", "Data", "Total", });
    internal_static_sku_SkuInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sku_SkuInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_SkuInfo_descriptor,
        new java.lang.String[] { "SkuId", "SkuName", "SkuImage", "ItemId", "ItemName", "ProductId", "ProductName", "Ctime", "Mtime", });
    internal_static_sku_CreateSkuReq_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_sku_CreateSkuReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_CreateSkuReq_descriptor,
        new java.lang.String[] { "ItemId", "ItemNam", "ProductId", "ProductName", "InventoryQty", });
    internal_static_sku_GetItemInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_sku_GetItemInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_GetItemInfoReq_descriptor,
        new java.lang.String[] { "ItemId", "ItemName", "CategoryId", "CategoryName", "ShopId", });
    internal_static_sku_GetItemInfoResp_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_sku_GetItemInfoResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_GetItemInfoResp_descriptor,
        new java.lang.String[] { "Common", "Data", "Total", });
    internal_static_sku_ItemInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_sku_ItemInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_ItemInfo_descriptor,
        new java.lang.String[] { "ItemId", "ItemName", "CategoryId", "CategoryName", "ShopId", });
    internal_static_sku_CreateOrUpdateItemInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_sku_CreateOrUpdateItemInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_CreateOrUpdateItemInfoReq_descriptor,
        new java.lang.String[] { "ItemId", "ItemName", "CategoryId", "CategoryNam", "ShopId", });
    internal_static_sku_SkuInventoryReq_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_sku_SkuInventoryReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_SkuInventoryReq_descriptor,
        new java.lang.String[] { "SkuId", });
    internal_static_sku_SkuInventoryResp_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_sku_SkuInventoryResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_SkuInventoryResp_descriptor,
        new java.lang.String[] { "Common", "Data", });
    internal_static_sku_SkuInventoryInfo_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_sku_SkuInventoryInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_SkuInventoryInfo_descriptor,
        new java.lang.String[] { "SkuId", "InventoryQty", "DamageQty", });
    internal_static_sku_UpdateSkuInventoryInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_sku_UpdateSkuInventoryInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_UpdateSkuInventoryInfoReq_descriptor,
        new java.lang.String[] { "SkuId", "InventoryQty", "DamageQty", });
    internal_static_sku_Response_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_sku_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_Response_descriptor,
        new java.lang.String[] { });
    internal_static_sku_GetShopInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_sku_GetShopInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_GetShopInfoReq_descriptor,
        new java.lang.String[] { "ShopId", "ShopName", });
    internal_static_sku_GetShopInfoResp_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_sku_GetShopInfoResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_GetShopInfoResp_descriptor,
        new java.lang.String[] { "Common", "ShopId", "ShopName", });
    internal_static_sku_CreateShopReq_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_sku_CreateShopReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_CreateShopReq_descriptor,
        new java.lang.String[] { "ShopId", "ShopName", });
    internal_static_sku_UpdateShopReq_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_sku_UpdateShopReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sku_UpdateShopReq_descriptor,
        new java.lang.String[] { "ShopId", "ShopName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
