// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sku.proto

// Protobuf Java Version: 3.25.3
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
    skuId_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SkuReq();
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
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList skuId_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string sku_id = 1;</code>
   * @return A list containing the skuId.
   */
  public com.google.protobuf.ProtocolStringList
      getSkuIdList() {
    return skuId_;
  }
  /**
   * <code>repeated string sku_id = 1;</code>
   * @return The count of skuId.
   */
  public int getSkuIdCount() {
    return skuId_.size();
  }
  /**
   * <code>repeated string sku_id = 1;</code>
   * @param index The index of the element to return.
   * @return The skuId at the given index.
   */
  public java.lang.String getSkuId(int index) {
    return skuId_.get(index);
  }
  /**
   * <code>repeated string sku_id = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the skuId at the given index.
   */
  public com.google.protobuf.ByteString
      getSkuIdBytes(int index) {
    return skuId_.getByteString(index);
  }

  public static final int PAGE_NUMBER_FIELD_NUMBER = 2;
  private long pageNumber_ = 0L;
  /**
   * <code>uint64 page_number = 2;</code>
   * @return The pageNumber.
   */
  @java.lang.Override
  public long getPageNumber() {
    return pageNumber_;
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private long pageSize_ = 0L;
  /**
   * <code>uint64 page_size = 3;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public long getPageSize() {
    return pageSize_;
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
    for (int i = 0; i < skuId_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, skuId_.getRaw(i));
    }
    if (pageNumber_ != 0L) {
      output.writeUInt64(2, pageNumber_);
    }
    if (pageSize_ != 0L) {
      output.writeUInt64(3, pageSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < skuId_.size(); i++) {
        dataSize += computeStringSizeNoTag(skuId_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSkuIdList().size();
    }
    if (pageNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, pageNumber_);
    }
    if (pageSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, pageSize_);
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
    if (!(obj instanceof com.example.wechatmerchant.skurpc.SkuReq)) {
      return super.equals(obj);
    }
    com.example.wechatmerchant.skurpc.SkuReq other = (com.example.wechatmerchant.skurpc.SkuReq) obj;

    if (!getSkuIdList()
        .equals(other.getSkuIdList())) return false;
    if (getPageNumber()
        != other.getPageNumber()) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
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
    if (getSkuIdCount() > 0) {
      hash = (37 * hash) + SKU_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkuIdList().hashCode();
    }
    hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageNumber());
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageSize());
    hash = (29 * hash) + getUnknownFields().hashCode();
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

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      skuId_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      pageNumber_ = 0L;
      pageSize_ = 0L;
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
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.wechatmerchant.skurpc.SkuReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        skuId_.makeImmutable();
        result.skuId_ = skuId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pageNumber_ = pageNumber_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pageSize_ = pageSize_;
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
      if (other instanceof com.example.wechatmerchant.skurpc.SkuReq) {
        return mergeFrom((com.example.wechatmerchant.skurpc.SkuReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.wechatmerchant.skurpc.SkuReq other) {
      if (other == com.example.wechatmerchant.skurpc.SkuReq.getDefaultInstance()) return this;
      if (!other.skuId_.isEmpty()) {
        if (skuId_.isEmpty()) {
          skuId_ = other.skuId_;
          bitField0_ |= 0x00000001;
        } else {
          ensureSkuIdIsMutable();
          skuId_.addAll(other.skuId_);
        }
        onChanged();
      }
      if (other.getPageNumber() != 0L) {
        setPageNumber(other.getPageNumber());
      }
      if (other.getPageSize() != 0L) {
        setPageSize(other.getPageSize());
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureSkuIdIsMutable();
              skuId_.add(s);
              break;
            } // case 10
            case 16: {
              pageNumber_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              pageSize_ = input.readUInt64();
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

    private com.google.protobuf.LazyStringArrayList skuId_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureSkuIdIsMutable() {
      if (!skuId_.isModifiable()) {
        skuId_ = new com.google.protobuf.LazyStringArrayList(skuId_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string sku_id = 1;</code>
     * @return A list containing the skuId.
     */
    public com.google.protobuf.ProtocolStringList
        getSkuIdList() {
      skuId_.makeImmutable();
      return skuId_;
    }
    /**
     * <code>repeated string sku_id = 1;</code>
     * @return The count of skuId.
     */
    public int getSkuIdCount() {
      return skuId_.size();
    }
    /**
     * <code>repeated string sku_id = 1;</code>
     * @param index The index of the element to return.
     * @return The skuId at the given index.
     */
    public java.lang.String getSkuId(int index) {
      return skuId_.get(index);
    }
    /**
     * <code>repeated string sku_id = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the skuId at the given index.
     */
    public com.google.protobuf.ByteString
        getSkuIdBytes(int index) {
      return skuId_.getByteString(index);
    }
    /**
     * <code>repeated string sku_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The skuId to set.
     * @return This builder for chaining.
     */
    public Builder setSkuId(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSkuIdIsMutable();
      skuId_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string sku_id = 1;</code>
     * @param value The skuId to add.
     * @return This builder for chaining.
     */
    public Builder addSkuId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSkuIdIsMutable();
      skuId_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string sku_id = 1;</code>
     * @param values The skuId to add.
     * @return This builder for chaining.
     */
    public Builder addAllSkuId(
        java.lang.Iterable<java.lang.String> values) {
      ensureSkuIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, skuId_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string sku_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkuId() {
      skuId_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string sku_id = 1;</code>
     * @param value The bytes of the skuId to add.
     * @return This builder for chaining.
     */
    public Builder addSkuIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureSkuIdIsMutable();
      skuId_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long pageNumber_ ;
    /**
     * <code>uint64 page_number = 2;</code>
     * @return The pageNumber.
     */
    @java.lang.Override
    public long getPageNumber() {
      return pageNumber_;
    }
    /**
     * <code>uint64 page_number = 2;</code>
     * @param value The pageNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPageNumber(long value) {

      pageNumber_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 page_number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageNumber() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pageNumber_ = 0L;
      onChanged();
      return this;
    }

    private long pageSize_ ;
    /**
     * <code>uint64 page_size = 3;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public long getPageSize() {
      return pageSize_;
    }
    /**
     * <code>uint64 page_size = 3;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(long value) {

      pageSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 page_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pageSize_ = 0L;
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

