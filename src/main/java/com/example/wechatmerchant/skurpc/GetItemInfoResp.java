// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sku.proto

// Protobuf Java Version: 3.25.3
package com.example.wechatmerchant.skurpc;

/**
 * Protobuf type {@code sku.GetItemInfoResp}
 */
public final class GetItemInfoResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sku.GetItemInfoResp)
    GetItemInfoRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetItemInfoResp.newBuilder() to construct.
  private GetItemInfoResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetItemInfoResp() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetItemInfoResp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_GetItemInfoResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_GetItemInfoResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.wechatmerchant.skurpc.GetItemInfoResp.class, com.example.wechatmerchant.skurpc.GetItemInfoResp.Builder.class);
  }

  private int bitField0_;
  public static final int COMMON_FIELD_NUMBER = 1;
  private com.example.wechatmerchant.skurpc.CommonRsp common_;
  /**
   * <code>.sku.CommonRsp common = 1;</code>
   * @return Whether the common field is set.
   */
  @java.lang.Override
  public boolean hasCommon() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.sku.CommonRsp common = 1;</code>
   * @return The common.
   */
  @java.lang.Override
  public com.example.wechatmerchant.skurpc.CommonRsp getCommon() {
    return common_ == null ? com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance() : common_;
  }
  /**
   * <code>.sku.CommonRsp common = 1;</code>
   */
  @java.lang.Override
  public com.example.wechatmerchant.skurpc.CommonRspOrBuilder getCommonOrBuilder() {
    return common_ == null ? com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance() : common_;
  }

  public static final int DATA_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.example.wechatmerchant.skurpc.ItemInfo> data_;
  /**
   * <code>repeated .sku.ItemInfo data = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.example.wechatmerchant.skurpc.ItemInfo> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .sku.ItemInfo data = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.example.wechatmerchant.skurpc.ItemInfoOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .sku.ItemInfo data = 2;</code>
   */
  @java.lang.Override
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .sku.ItemInfo data = 2;</code>
   */
  @java.lang.Override
  public com.example.wechatmerchant.skurpc.ItemInfo getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .sku.ItemInfo data = 2;</code>
   */
  @java.lang.Override
  public com.example.wechatmerchant.skurpc.ItemInfoOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
  }

  public static final int TOTAL_FIELD_NUMBER = 3;
  private int total_ = 0;
  /**
   * <code>uint32 total = 3;</code>
   * @return The total.
   */
  @java.lang.Override
  public int getTotal() {
    return total_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getCommon());
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(2, data_.get(i));
    }
    if (total_ != 0) {
      output.writeUInt32(3, total_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommon());
    }
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, data_.get(i));
    }
    if (total_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, total_);
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
    if (!(obj instanceof com.example.wechatmerchant.skurpc.GetItemInfoResp)) {
      return super.equals(obj);
    }
    com.example.wechatmerchant.skurpc.GetItemInfoResp other = (com.example.wechatmerchant.skurpc.GetItemInfoResp) obj;

    if (hasCommon() != other.hasCommon()) return false;
    if (hasCommon()) {
      if (!getCommon()
          .equals(other.getCommon())) return false;
    }
    if (!getDataList()
        .equals(other.getDataList())) return false;
    if (getTotal()
        != other.getTotal()) return false;
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
    if (hasCommon()) {
      hash = (37 * hash) + COMMON_FIELD_NUMBER;
      hash = (53 * hash) + getCommon().hashCode();
    }
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + getTotal();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.wechatmerchant.skurpc.GetItemInfoResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.wechatmerchant.skurpc.GetItemInfoResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.GetItemInfoResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.wechatmerchant.skurpc.GetItemInfoResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.GetItemInfoResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.wechatmerchant.skurpc.GetItemInfoResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.GetItemInfoResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.wechatmerchant.skurpc.GetItemInfoResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.wechatmerchant.skurpc.GetItemInfoResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.wechatmerchant.skurpc.GetItemInfoResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.GetItemInfoResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.wechatmerchant.skurpc.GetItemInfoResp parseFrom(
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
  public static Builder newBuilder(com.example.wechatmerchant.skurpc.GetItemInfoResp prototype) {
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
   * Protobuf type {@code sku.GetItemInfoResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sku.GetItemInfoResp)
      com.example.wechatmerchant.skurpc.GetItemInfoRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_GetItemInfoResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_GetItemInfoResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.wechatmerchant.skurpc.GetItemInfoResp.class, com.example.wechatmerchant.skurpc.GetItemInfoResp.Builder.class);
    }

    // Construct using com.example.wechatmerchant.skurpc.GetItemInfoResp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCommonFieldBuilder();
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
      } else {
        data_ = null;
        dataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      total_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_GetItemInfoResp_descriptor;
    }

    @java.lang.Override
    public com.example.wechatmerchant.skurpc.GetItemInfoResp getDefaultInstanceForType() {
      return com.example.wechatmerchant.skurpc.GetItemInfoResp.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.wechatmerchant.skurpc.GetItemInfoResp build() {
      com.example.wechatmerchant.skurpc.GetItemInfoResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.wechatmerchant.skurpc.GetItemInfoResp buildPartial() {
      com.example.wechatmerchant.skurpc.GetItemInfoResp result = new com.example.wechatmerchant.skurpc.GetItemInfoResp(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.example.wechatmerchant.skurpc.GetItemInfoResp result) {
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
    }

    private void buildPartial0(com.example.wechatmerchant.skurpc.GetItemInfoResp result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.common_ = commonBuilder_ == null
            ? common_
            : commonBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.total_ = total_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.example.wechatmerchant.skurpc.GetItemInfoResp) {
        return mergeFrom((com.example.wechatmerchant.skurpc.GetItemInfoResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.wechatmerchant.skurpc.GetItemInfoResp other) {
      if (other == com.example.wechatmerchant.skurpc.GetItemInfoResp.getDefaultInstance()) return this;
      if (other.hasCommon()) {
        mergeCommon(other.getCommon());
      }
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000002);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
          }
        }
      }
      if (other.getTotal() != 0) {
        setTotal(other.getTotal());
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
            case 10: {
              input.readMessage(
                  getCommonFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.example.wechatmerchant.skurpc.ItemInfo m =
                  input.readMessage(
                      com.example.wechatmerchant.skurpc.ItemInfo.parser(),
                      extensionRegistry);
              if (dataBuilder_ == null) {
                ensureDataIsMutable();
                data_.add(m);
              } else {
                dataBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 24: {
              total_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.example.wechatmerchant.skurpc.CommonRsp common_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.wechatmerchant.skurpc.CommonRsp, com.example.wechatmerchant.skurpc.CommonRsp.Builder, com.example.wechatmerchant.skurpc.CommonRspOrBuilder> commonBuilder_;
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     * @return Whether the common field is set.
     */
    public boolean hasCommon() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     * @return The common.
     */
    public com.example.wechatmerchant.skurpc.CommonRsp getCommon() {
      if (commonBuilder_ == null) {
        return common_ == null ? com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance() : common_;
      } else {
        return commonBuilder_.getMessage();
      }
    }
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     */
    public Builder setCommon(com.example.wechatmerchant.skurpc.CommonRsp value) {
      if (commonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        common_ = value;
      } else {
        commonBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     */
    public Builder setCommon(
        com.example.wechatmerchant.skurpc.CommonRsp.Builder builderForValue) {
      if (commonBuilder_ == null) {
        common_ = builderForValue.build();
      } else {
        commonBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     */
    public Builder mergeCommon(com.example.wechatmerchant.skurpc.CommonRsp value) {
      if (commonBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          common_ != null &&
          common_ != com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()) {
          getCommonBuilder().mergeFrom(value);
        } else {
          common_ = value;
        }
      } else {
        commonBuilder_.mergeFrom(value);
      }
      if (common_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     */
    public Builder clearCommon() {
      bitField0_ = (bitField0_ & ~0x00000001);
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     */
    public com.example.wechatmerchant.skurpc.CommonRsp.Builder getCommonBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCommonFieldBuilder().getBuilder();
    }
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     */
    public com.example.wechatmerchant.skurpc.CommonRspOrBuilder getCommonOrBuilder() {
      if (commonBuilder_ != null) {
        return commonBuilder_.getMessageOrBuilder();
      } else {
        return common_ == null ?
            com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance() : common_;
      }
    }
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.wechatmerchant.skurpc.CommonRsp, com.example.wechatmerchant.skurpc.CommonRsp.Builder, com.example.wechatmerchant.skurpc.CommonRspOrBuilder> 
        getCommonFieldBuilder() {
      if (commonBuilder_ == null) {
        commonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.wechatmerchant.skurpc.CommonRsp, com.example.wechatmerchant.skurpc.CommonRsp.Builder, com.example.wechatmerchant.skurpc.CommonRspOrBuilder>(
                getCommon(),
                getParentForChildren(),
                isClean());
        common_ = null;
      }
      return commonBuilder_;
    }

    private java.util.List<com.example.wechatmerchant.skurpc.ItemInfo> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        data_ = new java.util.ArrayList<com.example.wechatmerchant.skurpc.ItemInfo>(data_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.wechatmerchant.skurpc.ItemInfo, com.example.wechatmerchant.skurpc.ItemInfo.Builder, com.example.wechatmerchant.skurpc.ItemInfoOrBuilder> dataBuilder_;

    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public java.util.List<com.example.wechatmerchant.skurpc.ItemInfo> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public com.example.wechatmerchant.skurpc.ItemInfo getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public Builder setData(
        int index, com.example.wechatmerchant.skurpc.ItemInfo value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public Builder setData(
        int index, com.example.wechatmerchant.skurpc.ItemInfo.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public Builder addData(com.example.wechatmerchant.skurpc.ItemInfo value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public Builder addData(
        int index, com.example.wechatmerchant.skurpc.ItemInfo value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public Builder addData(
        com.example.wechatmerchant.skurpc.ItemInfo.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public Builder addData(
        int index, com.example.wechatmerchant.skurpc.ItemInfo.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.example.wechatmerchant.skurpc.ItemInfo> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public com.example.wechatmerchant.skurpc.ItemInfo.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public com.example.wechatmerchant.skurpc.ItemInfoOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public java.util.List<? extends com.example.wechatmerchant.skurpc.ItemInfoOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public com.example.wechatmerchant.skurpc.ItemInfo.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          com.example.wechatmerchant.skurpc.ItemInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public com.example.wechatmerchant.skurpc.ItemInfo.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, com.example.wechatmerchant.skurpc.ItemInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .sku.ItemInfo data = 2;</code>
     */
    public java.util.List<com.example.wechatmerchant.skurpc.ItemInfo.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.wechatmerchant.skurpc.ItemInfo, com.example.wechatmerchant.skurpc.ItemInfo.Builder, com.example.wechatmerchant.skurpc.ItemInfoOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.wechatmerchant.skurpc.ItemInfo, com.example.wechatmerchant.skurpc.ItemInfo.Builder, com.example.wechatmerchant.skurpc.ItemInfoOrBuilder>(
                data_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }

    private int total_ ;
    /**
     * <code>uint32 total = 3;</code>
     * @return The total.
     */
    @java.lang.Override
    public int getTotal() {
      return total_;
    }
    /**
     * <code>uint32 total = 3;</code>
     * @param value The total to set.
     * @return This builder for chaining.
     */
    public Builder setTotal(int value) {

      total_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 total = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotal() {
      bitField0_ = (bitField0_ & ~0x00000004);
      total_ = 0;
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


    // @@protoc_insertion_point(builder_scope:sku.GetItemInfoResp)
  }

  // @@protoc_insertion_point(class_scope:sku.GetItemInfoResp)
  private static final com.example.wechatmerchant.skurpc.GetItemInfoResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.wechatmerchant.skurpc.GetItemInfoResp();
  }

  public static com.example.wechatmerchant.skurpc.GetItemInfoResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetItemInfoResp>
      PARSER = new com.google.protobuf.AbstractParser<GetItemInfoResp>() {
    @java.lang.Override
    public GetItemInfoResp parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetItemInfoResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetItemInfoResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.wechatmerchant.skurpc.GetItemInfoResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

