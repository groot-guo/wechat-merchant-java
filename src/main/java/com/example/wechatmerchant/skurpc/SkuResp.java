// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sku.proto

package com.example.wechatmerchant.skurpc;

/**
 * Protobuf type {@code sku.SkuResp}
 */
public final class SkuResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sku.SkuResp)
    SkuRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SkuResp.newBuilder() to construct.
  private SkuResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SkuResp() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SkuResp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SkuResp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.example.wechatmerchant.skurpc.CommonRsp.Builder subBuilder = null;
            if (common_ != null) {
              subBuilder = common_.toBuilder();
            }
            common_ = input.readMessage(com.example.wechatmerchant.skurpc.CommonRsp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(common_);
              common_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              data_ = new java.util.ArrayList<com.example.wechatmerchant.skurpc.SkuInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            data_.add(
                input.readMessage(com.example.wechatmerchant.skurpc.SkuInfo.parser(), extensionRegistry));
            break;
          }
          case 24: {

            total_ = input.readUInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_SkuResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_SkuResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.wechatmerchant.skurpc.SkuResp.class, com.example.wechatmerchant.skurpc.SkuResp.Builder.class);
  }

  public static final int COMMON_FIELD_NUMBER = 1;
  private com.example.wechatmerchant.skurpc.CommonRsp common_;
  /**
   * <code>.sku.CommonRsp common = 1;</code>
   * @return Whether the common field is set.
   */
  @java.lang.Override
  public boolean hasCommon() {
    return common_ != null;
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
    return getCommon();
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private java.util.List<com.example.wechatmerchant.skurpc.SkuInfo> data_;
  /**
   * <code>repeated .sku.SkuInfo data = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.example.wechatmerchant.skurpc.SkuInfo> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .sku.SkuInfo data = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.example.wechatmerchant.skurpc.SkuInfoOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .sku.SkuInfo data = 2;</code>
   */
  @java.lang.Override
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .sku.SkuInfo data = 2;</code>
   */
  @java.lang.Override
  public com.example.wechatmerchant.skurpc.SkuInfo getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .sku.SkuInfo data = 2;</code>
   */
  @java.lang.Override
  public com.example.wechatmerchant.skurpc.SkuInfoOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
  }

  public static final int TOTAL_FIELD_NUMBER = 3;
  private int total_;
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
    if (common_ != null) {
      output.writeMessage(1, getCommon());
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(2, data_.get(i));
    }
    if (total_ != 0) {
      output.writeUInt32(3, total_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (common_ != null) {
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.wechatmerchant.skurpc.SkuResp)) {
      return super.equals(obj);
    }
    com.example.wechatmerchant.skurpc.SkuResp other = (com.example.wechatmerchant.skurpc.SkuResp) obj;

    if (hasCommon() != other.hasCommon()) return false;
    if (hasCommon()) {
      if (!getCommon()
          .equals(other.getCommon())) return false;
    }
    if (!getDataList()
        .equals(other.getDataList())) return false;
    if (getTotal()
        != other.getTotal()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.wechatmerchant.skurpc.SkuResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.wechatmerchant.skurpc.SkuResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.SkuResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.wechatmerchant.skurpc.SkuResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.SkuResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.wechatmerchant.skurpc.SkuResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.SkuResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.wechatmerchant.skurpc.SkuResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.SkuResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.wechatmerchant.skurpc.SkuResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.SkuResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.wechatmerchant.skurpc.SkuResp parseFrom(
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
  public static Builder newBuilder(com.example.wechatmerchant.skurpc.SkuResp prototype) {
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
   * Protobuf type {@code sku.SkuResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sku.SkuResp)
      com.example.wechatmerchant.skurpc.SkuRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_SkuResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_SkuResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.wechatmerchant.skurpc.SkuResp.class, com.example.wechatmerchant.skurpc.SkuResp.Builder.class);
    }

    // Construct using com.example.wechatmerchant.skurpc.SkuResp.newBuilder()
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
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (commonBuilder_ == null) {
        common_ = null;
      } else {
        common_ = null;
        commonBuilder_ = null;
      }
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataBuilder_.clear();
      }
      total_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_SkuResp_descriptor;
    }

    @java.lang.Override
    public com.example.wechatmerchant.skurpc.SkuResp getDefaultInstanceForType() {
      return com.example.wechatmerchant.skurpc.SkuResp.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.wechatmerchant.skurpc.SkuResp build() {
      com.example.wechatmerchant.skurpc.SkuResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.wechatmerchant.skurpc.SkuResp buildPartial() {
      com.example.wechatmerchant.skurpc.SkuResp result = new com.example.wechatmerchant.skurpc.SkuResp(this);
      int from_bitField0_ = bitField0_;
      if (commonBuilder_ == null) {
        result.common_ = common_;
      } else {
        result.common_ = commonBuilder_.build();
      }
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
      result.total_ = total_;
      onBuilt();
      return result;
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
      if (other instanceof com.example.wechatmerchant.skurpc.SkuResp) {
        return mergeFrom((com.example.wechatmerchant.skurpc.SkuResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.wechatmerchant.skurpc.SkuResp other) {
      if (other == com.example.wechatmerchant.skurpc.SkuResp.getDefaultInstance()) return this;
      if (other.hasCommon()) {
        mergeCommon(other.getCommon());
      }
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
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
            bitField0_ = (bitField0_ & ~0x00000001);
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
      this.mergeUnknownFields(other.unknownFields);
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
      com.example.wechatmerchant.skurpc.SkuResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.wechatmerchant.skurpc.SkuResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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
      return commonBuilder_ != null || common_ != null;
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
        onChanged();
      } else {
        commonBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     */
    public Builder setCommon(
        com.example.wechatmerchant.skurpc.CommonRsp.Builder builderForValue) {
      if (commonBuilder_ == null) {
        common_ = builderForValue.build();
        onChanged();
      } else {
        commonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     */
    public Builder mergeCommon(com.example.wechatmerchant.skurpc.CommonRsp value) {
      if (commonBuilder_ == null) {
        if (common_ != null) {
          common_ =
            com.example.wechatmerchant.skurpc.CommonRsp.newBuilder(common_).mergeFrom(value).buildPartial();
        } else {
          common_ = value;
        }
        onChanged();
      } else {
        commonBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     */
    public Builder clearCommon() {
      if (commonBuilder_ == null) {
        common_ = null;
        onChanged();
      } else {
        common_ = null;
        commonBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.sku.CommonRsp common = 1;</code>
     */
    public com.example.wechatmerchant.skurpc.CommonRsp.Builder getCommonBuilder() {
      
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

    private java.util.List<com.example.wechatmerchant.skurpc.SkuInfo> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        data_ = new java.util.ArrayList<com.example.wechatmerchant.skurpc.SkuInfo>(data_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.wechatmerchant.skurpc.SkuInfo, com.example.wechatmerchant.skurpc.SkuInfo.Builder, com.example.wechatmerchant.skurpc.SkuInfoOrBuilder> dataBuilder_;

    /**
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public java.util.List<com.example.wechatmerchant.skurpc.SkuInfo> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public com.example.wechatmerchant.skurpc.SkuInfo getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public Builder setData(
        int index, com.example.wechatmerchant.skurpc.SkuInfo value) {
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
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public Builder setData(
        int index, com.example.wechatmerchant.skurpc.SkuInfo.Builder builderForValue) {
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
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public Builder addData(com.example.wechatmerchant.skurpc.SkuInfo value) {
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
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public Builder addData(
        int index, com.example.wechatmerchant.skurpc.SkuInfo value) {
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
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public Builder addData(
        com.example.wechatmerchant.skurpc.SkuInfo.Builder builderForValue) {
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
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public Builder addData(
        int index, com.example.wechatmerchant.skurpc.SkuInfo.Builder builderForValue) {
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
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.example.wechatmerchant.skurpc.SkuInfo> values) {
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
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .sku.SkuInfo data = 2;</code>
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
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public com.example.wechatmerchant.skurpc.SkuInfo.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public com.example.wechatmerchant.skurpc.SkuInfoOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public java.util.List<? extends com.example.wechatmerchant.skurpc.SkuInfoOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public com.example.wechatmerchant.skurpc.SkuInfo.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          com.example.wechatmerchant.skurpc.SkuInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public com.example.wechatmerchant.skurpc.SkuInfo.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, com.example.wechatmerchant.skurpc.SkuInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .sku.SkuInfo data = 2;</code>
     */
    public java.util.List<com.example.wechatmerchant.skurpc.SkuInfo.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.wechatmerchant.skurpc.SkuInfo, com.example.wechatmerchant.skurpc.SkuInfo.Builder, com.example.wechatmerchant.skurpc.SkuInfoOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.wechatmerchant.skurpc.SkuInfo, com.example.wechatmerchant.skurpc.SkuInfo.Builder, com.example.wechatmerchant.skurpc.SkuInfoOrBuilder>(
                data_,
                ((bitField0_ & 0x00000001) != 0),
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
      onChanged();
      return this;
    }
    /**
     * <code>uint32 total = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotal() {
      
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


    // @@protoc_insertion_point(builder_scope:sku.SkuResp)
  }

  // @@protoc_insertion_point(class_scope:sku.SkuResp)
  private static final com.example.wechatmerchant.skurpc.SkuResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.wechatmerchant.skurpc.SkuResp();
  }

  public static com.example.wechatmerchant.skurpc.SkuResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SkuResp>
      PARSER = new com.google.protobuf.AbstractParser<SkuResp>() {
    @java.lang.Override
    public SkuResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SkuResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SkuResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SkuResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.wechatmerchant.skurpc.SkuResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

