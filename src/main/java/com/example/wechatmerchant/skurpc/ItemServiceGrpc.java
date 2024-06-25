package com.example.wechatmerchant.skurpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * item service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: src/main/proto/sku.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ItemServiceGrpc {

  private ItemServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sku.ItemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.GetItemInfoReq,
      com.example.wechatmerchant.skurpc.GetItemInfoResp> getGetItemInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItemInfo",
      requestType = com.example.wechatmerchant.skurpc.GetItemInfoReq.class,
      responseType = com.example.wechatmerchant.skurpc.GetItemInfoResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.GetItemInfoReq,
      com.example.wechatmerchant.skurpc.GetItemInfoResp> getGetItemInfoMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.GetItemInfoReq, com.example.wechatmerchant.skurpc.GetItemInfoResp> getGetItemInfoMethod;
    if ((getGetItemInfoMethod = ItemServiceGrpc.getGetItemInfoMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getGetItemInfoMethod = ItemServiceGrpc.getGetItemInfoMethod) == null) {
          ItemServiceGrpc.getGetItemInfoMethod = getGetItemInfoMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.GetItemInfoReq, com.example.wechatmerchant.skurpc.GetItemInfoResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetItemInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.GetItemInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.GetItemInfoResp.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("GetItemInfo"))
              .build();
        }
      }
    }
    return getGetItemInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getCreateItemInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateItemInfo",
      requestType = com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq.class,
      responseType = com.example.wechatmerchant.skurpc.CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getCreateItemInfoMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq, com.example.wechatmerchant.skurpc.CommonRsp> getCreateItemInfoMethod;
    if ((getCreateItemInfoMethod = ItemServiceGrpc.getCreateItemInfoMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getCreateItemInfoMethod = ItemServiceGrpc.getCreateItemInfoMethod) == null) {
          ItemServiceGrpc.getCreateItemInfoMethod = getCreateItemInfoMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq, com.example.wechatmerchant.skurpc.CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateItemInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("CreateItemInfo"))
              .build();
        }
      }
    }
    return getCreateItemInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getUpdateItemInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateItemInfo",
      requestType = com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq.class,
      responseType = com.example.wechatmerchant.skurpc.CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getUpdateItemInfoMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq, com.example.wechatmerchant.skurpc.CommonRsp> getUpdateItemInfoMethod;
    if ((getUpdateItemInfoMethod = ItemServiceGrpc.getUpdateItemInfoMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getUpdateItemInfoMethod = ItemServiceGrpc.getUpdateItemInfoMethod) == null) {
          ItemServiceGrpc.getUpdateItemInfoMethod = getUpdateItemInfoMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq, com.example.wechatmerchant.skurpc.CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateItemInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("UpdateItemInfo"))
              .build();
        }
      }
    }
    return getUpdateItemInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemServiceStub>() {
        @java.lang.Override
        public ItemServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemServiceStub(channel, callOptions);
        }
      };
    return ItemServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemServiceBlockingStub>() {
        @java.lang.Override
        public ItemServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemServiceBlockingStub(channel, callOptions);
        }
      };
    return ItemServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemServiceFutureStub>() {
        @java.lang.Override
        public ItemServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemServiceFutureStub(channel, callOptions);
        }
      };
    return ItemServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * item service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getItemInfo(com.example.wechatmerchant.skurpc.GetItemInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.GetItemInfoResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetItemInfoMethod(), responseObserver);
    }

    /**
     */
    default void createItemInfo(com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateItemInfoMethod(), responseObserver);
    }

    /**
     */
    default void updateItemInfo(com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateItemInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ItemService.
   * <pre>
   * item service
   * </pre>
   */
  public static abstract class ItemServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ItemServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ItemService.
   * <pre>
   * item service
   * </pre>
   */
  public static final class ItemServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ItemServiceStub> {
    private ItemServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemServiceStub(channel, callOptions);
    }

    /**
     */
    public void getItemInfo(com.example.wechatmerchant.skurpc.GetItemInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.GetItemInfoResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetItemInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createItemInfo(com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateItemInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateItemInfo(com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateItemInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ItemService.
   * <pre>
   * item service
   * </pre>
   */
  public static final class ItemServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ItemServiceBlockingStub> {
    private ItemServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.GetItemInfoResp getItemInfo(com.example.wechatmerchant.skurpc.GetItemInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetItemInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.CommonRsp createItemInfo(com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateItemInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.CommonRsp updateItemInfo(com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateItemInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ItemService.
   * <pre>
   * item service
   * </pre>
   */
  public static final class ItemServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ItemServiceFutureStub> {
    private ItemServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.GetItemInfoResp> getItemInfo(
        com.example.wechatmerchant.skurpc.GetItemInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetItemInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.CommonRsp> createItemInfo(
        com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateItemInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.CommonRsp> updateItemInfo(
        com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateItemInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ITEM_INFO = 0;
  private static final int METHODID_CREATE_ITEM_INFO = 1;
  private static final int METHODID_UPDATE_ITEM_INFO = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ITEM_INFO:
          serviceImpl.getItemInfo((com.example.wechatmerchant.skurpc.GetItemInfoReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.GetItemInfoResp>) responseObserver);
          break;
        case METHODID_CREATE_ITEM_INFO:
          serviceImpl.createItemInfo((com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp>) responseObserver);
          break;
        case METHODID_UPDATE_ITEM_INFO:
          serviceImpl.updateItemInfo((com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetItemInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.GetItemInfoReq,
              com.example.wechatmerchant.skurpc.GetItemInfoResp>(
                service, METHODID_GET_ITEM_INFO)))
        .addMethod(
          getCreateItemInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq,
              com.example.wechatmerchant.skurpc.CommonRsp>(
                service, METHODID_CREATE_ITEM_INFO)))
        .addMethod(
          getUpdateItemInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.CreateOrUpdateItemInfoReq,
              com.example.wechatmerchant.skurpc.CommonRsp>(
                service, METHODID_UPDATE_ITEM_INFO)))
        .build();
  }

  private static abstract class ItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.wechatmerchant.skurpc.Sku.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemService");
    }
  }

  private static final class ItemServiceFileDescriptorSupplier
      extends ItemServiceBaseDescriptorSupplier {
    ItemServiceFileDescriptorSupplier() {}
  }

  private static final class ItemServiceMethodDescriptorSupplier
      extends ItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ItemServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ItemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemServiceFileDescriptorSupplier())
              .addMethod(getGetItemInfoMethod())
              .addMethod(getCreateItemInfoMethod())
              .addMethod(getUpdateItemInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
