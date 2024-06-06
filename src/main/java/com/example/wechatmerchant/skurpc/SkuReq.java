// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pb/sku.proto

package com.example.wechatmerchant.skurpc;

/**
 * Protobuf type {@code sku.SkuReq}
 */
public final class SkuReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sku.SkuReq)
    SkuReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SkuReq.newBuilder() to construct.
  private SkuReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SkuReq() {
    skuId_ = "";
    skuName_ = "";
    skuImage_ = "";
    skuCount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SkuReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SkuReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            skuId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            skuName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            skuImage_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            skuCount_ = s;
            break;
          }
          case 40: {

            ctime_ = input.readUInt64();
            break;
          }
          case 48: {

            mtime_ = input.readUInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_SkuReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_SkuReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.wechatmerchant.skurpc.SkuReq.class, com.example.wechatmerchant.skurpc.SkuReq.Builder.class);
  }

  public static final int SKU_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object skuId_;
  /**
   * <code>string sku_id = 1;</code>
   * @return The skuId.
   */
  @java.lang.Override
  public java.lang.String getSkuId() {
    java.lang.Object ref = skuId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skuId_ = s;
      return s;
    }
  }
  /**
   * <code>string sku_id = 1;</code>
   * @return The bytes for skuId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSkuIdBytes() {
    java.lang.Object ref = skuId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skuId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKU_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object skuName_;
  /**
   * <code>string sku_name = 2;</code>
   * @return The skuName.
   */
  @java.lang.Override
  public java.lang.String getSkuName() {
    java.lang.Object ref = skuName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skuName_ = s;
      return s;
    }
  }
  /**
   * <code>string sku_name = 2;</code>
   * @return The bytes for skuName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSkuNameBytes() {
    java.lang.Object ref = skuName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skuName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKU_IMAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object skuImage_;
  /**
   * <code>string sku_image = 3;</code>
   * @return The skuImage.
   */
  @java.lang.Override
  public java.lang.String getSkuImage() {
    java.lang.Object ref = skuImage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skuImage_ = s;
      return s;
    }
  }
  /**
   * <code>string sku_image = 3;</code>
   * @return The bytes for skuImage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSkuImageBytes() {
    java.lang.Object ref = skuImage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skuImage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKU_COUNT_FIELD_NUMBER = 4;
  private volatile java.lang.Object skuCount_;
  /**
   * <code>string sku_count = 4;</code>
   * @return The skuCount.
   */
  @java.lang.Override
  public java.lang.String getSkuCount() {
    java.lang.Object ref = skuCount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skuCount_ = s;
      return s;
    }
  }
  /**
   * <code>string sku_count = 4;</code>
   * @return The bytes for skuCount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSkuCountBytes() {
    java.lang.Object ref = skuCount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skuCount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CTIME_FIELD_NUMBER = 5;
  private long ctime_;
  /**
   * <code>uint64 ctime = 5;</code>
   * @return The ctime.
   */
  @java.lang.Override
  public long getCtime() {
    return ctime_;
  }

  public static final int MTIME_FIELD_NUMBER = 6;
  private long mtime_;
  /**
   * <code>uint64 mtime = 6;</code>
   * @return The mtime.
   */
  @java.lang.Override
  public long getMtime() {
    return mtime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, skuId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, skuName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuImage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, skuImage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuCount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, skuCount_);
    }
    if (ctime_ != 0L) {
      output.writeUInt64(5, ctime_);
    }
    if (mtime_ != 0L) {
      output.writeUInt64(6, mtime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, skuId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, skuName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuImage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, skuImage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuCount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, skuCount_);
    }
    if (ctime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, ctime_);
    }
    if (mtime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, mtime_);
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
    if (!(obj instanceof com.example.wechatmerchant.skurpc.SkuReq)) {
      return super.equals(obj);
    }
    com.example.wechatmerchant.skurpc.SkuReq other = (com.example.wechatmerchant.skurpc.SkuReq) obj;

    if (!getSkuId()
        .equals(other.getSkuId())) return false;
    if (!getSkuName()
        .equals(other.getSkuName())) return false;
    if (!getSkuImage()
        .equals(other.getSkuImage())) return false;
    if (!getSkuCount()
        .equals(other.getSkuCount())) return false;
    if (getCtime()
        != other.getCtime()) return false;
    if (getMtime()
        != other.getMtime()) return false;
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
    hash = (37 * hash) + SKU_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSkuId().hashCode();
    hash = (37 * hash) + SKU_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSkuName().hashCode();
    hash = (37 * hash) + SKU_IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getSkuImage().hashCode();
    hash = (37 * hash) + SKU_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getSkuCount().hashCode();
    hash = (37 * hash) + CTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCtime());
    hash = (37 * hash) + MTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMtime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.wechatmerchant.skurpc.SkuReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.wechatmerchant.skurpc.SkuReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.SkuReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.wechatmerchant.skurpc.SkuReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.SkuReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.wechatmerchant.skurpc.SkuReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.SkuReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.wechatmerchant.skurpc.SkuReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.SkuReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.wechatmerchant.skurpc.SkuReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.wechatmerchant.skurpc.SkuReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.wechatmerchant.skurpc.SkuReq parseFrom(
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
  public static Builder newBuilder(com.example.wechatmerchant.skurpc.SkuReq prototype) {
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
   * Protobuf type {@code sku.SkuReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sku.SkuReq)
      com.example.wechatmerchant.skurpc.SkuReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_SkuReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_SkuReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.wechatmerchant.skurpc.SkuReq.class, com.example.wechatmerchant.skurpc.SkuReq.Builder.class);
    }

    // Construct using com.example.wechatmerchant.skurpc.SkuReq.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      skuId_ = "";

      skuName_ = "";

      skuImage_ = "";

      skuCount_ = "";

      ctime_ = 0L;

      mtime_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.wechatmerchant.skurpc.Sku.internal_static_sku_SkuReq_descriptor;
    }

    @java.lang.Override
    public com.example.wechatmerchant.skurpc.SkuReq getDefaultInstanceForType() {
      return com.example.wechatmerchant.skurpc.SkuReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.wechatmerchant.skurpc.SkuReq build() {
      com.example.wechatmerchant.skurpc.SkuReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.wechatmerchant.skurpc.SkuReq buildPartial() {
      com.example.wechatmerchant.skurpc.SkuReq result = new com.example.wechatmerchant.skurpc.SkuReq(this);
      result.skuId_ = skuId_;
      result.skuName_ = skuName_;
      result.skuImage_ = skuImage_;
      result.skuCount_ = skuCount_;
      result.ctime_ = ctime_;
      result.mtime_ = mtime_;
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
      if (other instanceof com.example.wechatmerchant.skurpc.SkuReq) {
        return mergeFrom((com.example.wechatmerchant.skurpc.SkuReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.wechatmerchant.skurpc.SkuReq other) {
      if (other == com.example.wechatmerchant.skurpc.SkuReq.getDefaultInstance()) return this;
      if (!other.getSkuId().isEmpty()) {
        skuId_ = other.skuId_;
        onChanged();
      }
      if (!other.getSkuName().isEmpty()) {
        skuName_ = other.skuName_;
        onChanged();
      }
      if (!other.getSkuImage().isEmpty()) {
        skuImage_ = other.skuImage_;
        onChanged();
      }
      if (!other.getSkuCount().isEmpty()) {
        skuCount_ = other.skuCount_;
        onChanged();
      }
      if (other.getCtime() != 0L) {
        setCtime(other.getCtime());
      }
      if (other.getMtime() != 0L) {
        setMtime(other.getMtime());
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
      com.example.wechatmerchant.skurpc.SkuReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.wechatmerchant.skurpc.SkuReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object skuId_ = "";
    /**
     * <code>string sku_id = 1;</code>
     * @return The skuId.
     */
    public java.lang.String getSkuId() {
      java.lang.Object ref = skuId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skuId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sku_id = 1;</code>
     * @return The bytes for skuId.
     */
    public com.google.protobuf.ByteString
        getSkuIdBytes() {
      java.lang.Object ref = skuId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skuId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sku_id = 1;</code>
     * @param value The skuId to set.
     * @return This builder for chaining.
     */
    public Builder setSkuId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      skuId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sku_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkuId() {
      
      skuId_ = getDefaultInstance().getSkuId();
      onChanged();
      return this;
    }
    /**
     * <code>string sku_id = 1;</code>
     * @param value The bytes for skuId to set.
     * @return This builder for chaining.
     */
    public Builder setSkuIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      skuId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object skuName_ = "";
    /**
     * <code>string sku_name = 2;</code>
     * @return The skuName.
     */
    public java.lang.String getSkuName() {
      java.lang.Object ref = skuName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skuName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sku_name = 2;</code>
     * @return The bytes for skuName.
     */
    public com.google.protobuf.ByteString
        getSkuNameBytes() {
      java.lang.Object ref = skuName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skuName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sku_name = 2;</code>
     * @param value The skuName to set.
     * @return This builder for chaining.
     */
    public Builder setSkuName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      skuName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sku_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkuName() {
      
      skuName_ = getDefaultInstance().getSkuName();
      onChanged();
      return this;
    }
    /**
     * <code>string sku_name = 2;</code>
     * @param value The bytes for skuName to set.
     * @return This builder for chaining.
     */
    public Builder setSkuNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      skuName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object skuImage_ = "";
    /**
     * <code>string sku_image = 3;</code>
     * @return The skuImage.
     */
    public java.lang.String getSkuImage() {
      java.lang.Object ref = skuImage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skuImage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sku_image = 3;</code>
     * @return The bytes for skuImage.
     */
    public com.google.protobuf.ByteString
        getSkuImageBytes() {
      java.lang.Object ref = skuImage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skuImage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sku_image = 3;</code>
     * @param value The skuImage to set.
     * @return This builder for chaining.
     */
    public Builder setSkuImage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      skuImage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sku_image = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkuImage() {
      
      skuImage_ = getDefaultInstance().getSkuImage();
      onChanged();
      return this;
    }
    /**
     * <code>string sku_image = 3;</code>
     * @param value The bytes for skuImage to set.
     * @return This builder for chaining.
     */
    public Builder setSkuImageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      skuImage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object skuCount_ = "";
    /**
     * <code>string sku_count = 4;</code>
     * @return The skuCount.
     */
    public java.lang.String getSkuCount() {
      java.lang.Object ref = skuCount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skuCount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sku_count = 4;</code>
     * @return The bytes for skuCount.
     */
    public com.google.protobuf.ByteString
        getSkuCountBytes() {
      java.lang.Object ref = skuCount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skuCount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sku_count = 4;</code>
     * @param value The skuCount to set.
     * @return This builder for chaining.
     */
    public Builder setSkuCount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      skuCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sku_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkuCount() {
      
      skuCount_ = getDefaultInstance().getSkuCount();
      onChanged();
      return this;
    }
    /**
     * <code>string sku_count = 4;</code>
     * @param value The bytes for skuCount to set.
     * @return This builder for chaining.
     */
    public Builder setSkuCountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      skuCount_ = value;
      onChanged();
      return this;
    }

    private long ctime_ ;
    /**
     * <code>uint64 ctime = 5;</code>
     * @return The ctime.
     */
    @java.lang.Override
    public long getCtime() {
      return ctime_;
    }
    /**
     * <code>uint64 ctime = 5;</code>
     * @param value The ctime to set.
     * @return This builder for chaining.
     */
    public Builder setCtime(long value) {
      
      ctime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 ctime = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCtime() {
      
      ctime_ = 0L;
      onChanged();
      return this;
    }

    private long mtime_ ;
    /**
     * <code>uint64 mtime = 6;</code>
     * @return The mtime.
     */
    @java.lang.Override
    public long getMtime() {
      return mtime_;
    }
    /**
     * <code>uint64 mtime = 6;</code>
     * @param value The mtime to set.
     * @return This builder for chaining.
     */
    public Builder setMtime(long value) {
      
      mtime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 mtime = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMtime() {
      
      mtime_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:sku.SkuReq)
  }

  // @@protoc_insertion_point(class_scope:sku.SkuReq)
  private static final com.example.wechatmerchant.skurpc.SkuReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.wechatmerchant.skurpc.SkuReq();
  }

  public static com.example.wechatmerchant.skurpc.SkuReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SkuReq>
      PARSER = new com.google.protobuf.AbstractParser<SkuReq>() {
    @java.lang.Override
    public SkuReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SkuReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SkuReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SkuReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.wechatmerchant.skurpc.SkuReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

