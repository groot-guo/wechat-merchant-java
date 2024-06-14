package com.example.wechatmerchant.skurpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: src/main/proto/sku.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ShopServiceGrpc {

  private ShopServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sku.ShopService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.GetShopInfoReq,
      com.example.wechatmerchant.skurpc.GetShopInfoResp> getGetShopInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetShopInfo",
      requestType = com.example.wechatmerchant.skurpc.GetShopInfoReq.class,
      responseType = com.example.wechatmerchant.skurpc.GetShopInfoResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.GetShopInfoReq,
      com.example.wechatmerchant.skurpc.GetShopInfoResp> getGetShopInfoMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.GetShopInfoReq, com.example.wechatmerchant.skurpc.GetShopInfoResp> getGetShopInfoMethod;
    if ((getGetShopInfoMethod = ShopServiceGrpc.getGetShopInfoMethod) == null) {
      synchronized (ShopServiceGrpc.class) {
        if ((getGetShopInfoMethod = ShopServiceGrpc.getGetShopInfoMethod) == null) {
          ShopServiceGrpc.getGetShopInfoMethod = getGetShopInfoMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.GetShopInfoReq, com.example.wechatmerchant.skurpc.GetShopInfoResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetShopInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.GetShopInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.GetShopInfoResp.getDefaultInstance()))
              .setSchemaDescriptor(new ShopServiceMethodDescriptorSupplier("GetShopInfo"))
              .build();
        }
      }
    }
    return getGetShopInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.CreateShopReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getCreateShopInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShopInfo",
      requestType = com.example.wechatmerchant.skurpc.CreateShopReq.class,
      responseType = com.example.wechatmerchant.skurpc.CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.CreateShopReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getCreateShopInfoMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.CreateShopReq, com.example.wechatmerchant.skurpc.CommonRsp> getCreateShopInfoMethod;
    if ((getCreateShopInfoMethod = ShopServiceGrpc.getCreateShopInfoMethod) == null) {
      synchronized (ShopServiceGrpc.class) {
        if ((getCreateShopInfoMethod = ShopServiceGrpc.getCreateShopInfoMethod) == null) {
          ShopServiceGrpc.getCreateShopInfoMethod = getCreateShopInfoMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.CreateShopReq, com.example.wechatmerchant.skurpc.CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShopInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CreateShopReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new ShopServiceMethodDescriptorSupplier("CreateShopInfo"))
              .build();
        }
      }
    }
    return getCreateShopInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateShopReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getUpdateShopInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateShopInfo",
      requestType = com.example.wechatmerchant.skurpc.UpdateShopReq.class,
      responseType = com.example.wechatmerchant.skurpc.CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateShopReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getUpdateShopInfoMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateShopReq, com.example.wechatmerchant.skurpc.CommonRsp> getUpdateShopInfoMethod;
    if ((getUpdateShopInfoMethod = ShopServiceGrpc.getUpdateShopInfoMethod) == null) {
      synchronized (ShopServiceGrpc.class) {
        if ((getUpdateShopInfoMethod = ShopServiceGrpc.getUpdateShopInfoMethod) == null) {
          ShopServiceGrpc.getUpdateShopInfoMethod = getUpdateShopInfoMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.UpdateShopReq, com.example.wechatmerchant.skurpc.CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateShopInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.UpdateShopReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new ShopServiceMethodDescriptorSupplier("UpdateShopInfo"))
              .build();
        }
      }
    }
    return getUpdateShopInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShopServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShopServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShopServiceStub>() {
        @java.lang.Override
        public ShopServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShopServiceStub(channel, callOptions);
        }
      };
    return ShopServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShopServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShopServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShopServiceBlockingStub>() {
        @java.lang.Override
        public ShopServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShopServiceBlockingStub(channel, callOptions);
        }
      };
    return ShopServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShopServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShopServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShopServiceFutureStub>() {
        @java.lang.Override
        public ShopServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShopServiceFutureStub(channel, callOptions);
        }
      };
    return ShopServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getShopInfo(com.example.wechatmerchant.skurpc.GetShopInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.GetShopInfoResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetShopInfoMethod(), responseObserver);
    }

    /**
     */
    default void createShopInfo(com.example.wechatmerchant.skurpc.CreateShopReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShopInfoMethod(), responseObserver);
    }

    /**
     */
    default void updateShopInfo(com.example.wechatmerchant.skurpc.UpdateShopReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateShopInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ShopService.
   */
  public static abstract class ShopServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ShopServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ShopService.
   */
  public static final class ShopServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ShopServiceStub> {
    private ShopServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShopServiceStub(channel, callOptions);
    }

    /**
     */
    public void getShopInfo(com.example.wechatmerchant.skurpc.GetShopInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.GetShopInfoResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetShopInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShopInfo(com.example.wechatmerchant.skurpc.CreateShopReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShopInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateShopInfo(com.example.wechatmerchant.skurpc.UpdateShopReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateShopInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ShopService.
   */
  public static final class ShopServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ShopServiceBlockingStub> {
    private ShopServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShopServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.GetShopInfoResp getShopInfo(com.example.wechatmerchant.skurpc.GetShopInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetShopInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.CommonRsp createShopInfo(com.example.wechatmerchant.skurpc.CreateShopReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShopInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.CommonRsp updateShopInfo(com.example.wechatmerchant.skurpc.UpdateShopReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateShopInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ShopService.
   */
  public static final class ShopServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ShopServiceFutureStub> {
    private ShopServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShopServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.GetShopInfoResp> getShopInfo(
        com.example.wechatmerchant.skurpc.GetShopInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetShopInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.CommonRsp> createShopInfo(
        com.example.wechatmerchant.skurpc.CreateShopReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShopInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.CommonRsp> updateShopInfo(
        com.example.wechatmerchant.skurpc.UpdateShopReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateShopInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SHOP_INFO = 0;
  private static final int METHODID_CREATE_SHOP_INFO = 1;
  private static final int METHODID_UPDATE_SHOP_INFO = 2;

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
        case METHODID_GET_SHOP_INFO:
          serviceImpl.getShopInfo((com.example.wechatmerchant.skurpc.GetShopInfoReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.GetShopInfoResp>) responseObserver);
          break;
        case METHODID_CREATE_SHOP_INFO:
          serviceImpl.createShopInfo((com.example.wechatmerchant.skurpc.CreateShopReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp>) responseObserver);
          break;
        case METHODID_UPDATE_SHOP_INFO:
          serviceImpl.updateShopInfo((com.example.wechatmerchant.skurpc.UpdateShopReq) request,
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
          getGetShopInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.GetShopInfoReq,
              com.example.wechatmerchant.skurpc.GetShopInfoResp>(
                service, METHODID_GET_SHOP_INFO)))
        .addMethod(
          getCreateShopInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.CreateShopReq,
              com.example.wechatmerchant.skurpc.CommonRsp>(
                service, METHODID_CREATE_SHOP_INFO)))
        .addMethod(
          getUpdateShopInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.UpdateShopReq,
              com.example.wechatmerchant.skurpc.CommonRsp>(
                service, METHODID_UPDATE_SHOP_INFO)))
        .build();
  }

  private static abstract class ShopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShopServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.wechatmerchant.skurpc.Sku.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShopService");
    }
  }

  private static final class ShopServiceFileDescriptorSupplier
      extends ShopServiceBaseDescriptorSupplier {
    ShopServiceFileDescriptorSupplier() {}
  }

  private static final class ShopServiceMethodDescriptorSupplier
      extends ShopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ShopServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ShopServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShopServiceFileDescriptorSupplier())
              .addMethod(getGetShopInfoMethod())
              .addMethod(getCreateShopInfoMethod())
              .addMethod(getUpdateShopInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
