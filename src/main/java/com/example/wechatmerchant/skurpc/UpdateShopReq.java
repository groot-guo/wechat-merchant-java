// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sku.proto

// Protobuf Java Version: 3.25.3
package com.example.wechatmerchant.skurpc;

/**
 * Protobuf type {@code sku.UpdateShopReq}
 */
public final class UpdateShopReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sku.UpdateShopReq)
    UpdateShopReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateShopReq.newBuilder() to construct.
  private UpdateShopReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateShopReq() {
    shopName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateShopReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_UpdateShopReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_UpdateShopReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.wechatmerchant.skurpc.UpdateShopReq.class, com.example.wechatmerchant.skurpc.UpdateShopReq.Builder.class);
  }

  public static final int SHOP_ID_FIELD_NUMBER = 1;
  private int shopId_ = 0;
  /**
   * <code>uint32 shop_id = 1;</code>
   * @return The shopId.
   */
  @java.lang.Override
  public int getShopId() {
    return shopId_;
  }

  public static final int SHOP_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object shopName_ = "";
  /**
   * <code>string shop_name = 2;</code>
   * @return The shopName.
   */
  @java.lang.Override
  public java.lang.String getShopName() {
    java.lang.Object ref = shopName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shopName_ = s;
      return s;
    }
  }
  /**
   * <code>string shop_name = 2;</code>
   * @return The bytes for shopName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShopNameBytes() {
    java.lang.Object ref = shopName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shopName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (shopId_ != 0) {
      output.writeUInt32(1, shopId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shopName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, shopName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shopId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, shopId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shopName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, shopName_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.wechatmerchant.skurpc.UpdateShopReq)) {
      return super.equals(obj);
    }
    com.example.wechatmerchant.skurpc.UpdateShopReq other = (com.example.wechatmerchant.skurpc.UpdateShopReq) obj;

    if (getShopId()
        != other.getShopId()) return false;
    if (!getShopName()
        .equals(other.getShopName())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SHOP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getShopId();
    hash = (37 * hash) + SHOP_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getShopName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.wechatmerchant.skurpc.UpdateShopReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.wechatmerchant.skurpc.UpdateShopReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.UpdateShopReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.wechatmerchant.skurpc.UpdateShopReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.UpdateShopReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.wechatmerchant.skurpc.UpdateShopReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.UpdateShopReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.wechatmerchant.skurpc.UpdateShopReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.wechatmerchant.skurpc.UpdateShopReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.wechatmerchant.skurpc.UpdateShopReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.UpdateShopReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.wechatmerchant.skurpc.UpdateShopReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.wechatmerchant.skurpc.UpdateShopReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code sku.UpdateShopReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sku.UpdateShopReq)
      com.example.wechatmerchant.skurpc.UpdateShopReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_UpdateShopReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_UpdateShopReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.wechatmerchant.skurpc.UpdateShopReq.class, com.example.wechatmerchant.skurpc.UpdateShopReq.Builder.class);
    }

    // Construct using com.example.wechatmerchant.skurpc.UpdateShopReq.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      shopId_ = 0;
      shopName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_UpdateShopReq_descriptor;
    }

    @java.lang.Override
    public com.example.wechatmerchant.skurpc.UpdateShopReq getDefaultInstanceForType() {
      return com.example.wechatmerchant.skurpc.UpdateShopReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.wechatmerchant.skurpc.UpdateShopReq build() {
      com.example.wechatmerchant.skurpc.UpdateShopReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.wechatmerchant.skurpc.UpdateShopReq buildPartial() {
      com.example.wechatmerchant.skurpc.UpdateShopReq result = new com.example.wechatmerchant.skurpc.UpdateShopReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.wechatmerchant.skurpc.UpdateShopReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.shopId_ = shopId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.shopName_ = shopName_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.wechatmerchant.skurpc.UpdateShopReq) {
        return mergeFrom((com.example.wechatmerchant.skurpc.UpdateShopReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.wechatmerchant.skurpc.UpdateShopReq other) {
      if (other == com.example.wechatmerchant.skurpc.UpdateShopReq.getDefaultInstance()) return this;
      if (other.getShopId() != 0) {
        setShopId(other.getShopId());
      }
      if (!other.getShopName().isEmpty()) {
        shopName_ = other.shopName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              shopId_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              shopName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int shopId_ ;
    /**
     * <code>uint32 shop_id = 1;</code>
     * @return The shopId.
     */
    @java.lang.Override
    public int getShopId() {
      return shopId_;
    }
    /**
     * <code>uint32 shop_id = 1;</code>
     * @param value The shopId to set.
     * @return This builder for chaining.
     */
    public Builder setShopId(int value) {

      shopId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 shop_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearShopId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      shopId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object shopName_ = "";
    /**
     * <code>string shop_name = 2;</code>
     * @return The shopName.
     */
    public java.lang.String getShopName() {
      java.lang.Object ref = shopName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shopName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string shop_name = 2;</code>
     * @return The bytes for shopName.
     */
    public com.google.protobuf.ByteString
        getShopNameBytes() {
      java.lang.Object ref = shopName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shopName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string shop_name = 2;</code>
     * @param value The shopName to set.
     * @return This builder for chaining.
     */
    public Builder setShopName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      shopName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string shop_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearShopName() {
      shopName_ = getDefaultInstance().getShopName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string shop_name = 2;</code>
     * @param value The bytes for shopName to set.
     * @return This builder for chaining.
     */
    public Builder setShopNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      shopName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sku.UpdateShopReq)
  }

  // @@protoc_insertion_point(class_scope:sku.UpdateShopReq)
  private static final com.example.wechatmerchant.skurpc.UpdateShopReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.wechatmerchant.skurpc.UpdateShopReq();
  }

  public static com.example.wechatmerchant.skurpc.UpdateShopReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateShopReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateShopReq>() {
    @java.lang.Override
    public UpdateShopReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UpdateShopReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateShopReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.wechatmerchant.skurpc.UpdateShopReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

