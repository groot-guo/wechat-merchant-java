package com.example.wechatmerchant.skurpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * sku service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: src/main/proto/sku.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SkuServiceGrpc {

  private SkuServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sku.SkuService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.SkuReq,
      com.example.wechatmerchant.skurpc.SkuResp> getGetSkuInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSkuInfo",
      requestType = com.example.wechatmerchant.skurpc.SkuReq.class,
      responseType = com.example.wechatmerchant.skurpc.SkuResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.SkuReq,
      com.example.wechatmerchant.skurpc.SkuResp> getGetSkuInfoMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.SkuReq, com.example.wechatmerchant.skurpc.SkuResp> getGetSkuInfoMethod;
    if ((getGetSkuInfoMethod = SkuServiceGrpc.getGetSkuInfoMethod) == null) {
      synchronized (SkuServiceGrpc.class) {
        if ((getGetSkuInfoMethod = SkuServiceGrpc.getGetSkuInfoMethod) == null) {
          SkuServiceGrpc.getGetSkuInfoMethod = getGetSkuInfoMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.SkuReq, com.example.wechatmerchant.skurpc.SkuResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSkuInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.SkuReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.SkuResp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuServiceMethodDescriptorSupplier("GetSkuInfo"))
              .build();
        }
      }
    }
    return getGetSkuInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.CreateSkuReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getCreateSkuInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSkuInfo",
      requestType = com.example.wechatmerchant.skurpc.CreateSkuReq.class,
      responseType = com.example.wechatmerchant.skurpc.CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.CreateSkuReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getCreateSkuInfoMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.CreateSkuReq, com.example.wechatmerchant.skurpc.CommonRsp> getCreateSkuInfoMethod;
    if ((getCreateSkuInfoMethod = SkuServiceGrpc.getCreateSkuInfoMethod) == null) {
      synchronized (SkuServiceGrpc.class) {
        if ((getCreateSkuInfoMethod = SkuServiceGrpc.getCreateSkuInfoMethod) == null) {
          SkuServiceGrpc.getCreateSkuInfoMethod = getCreateSkuInfoMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.CreateSkuReq, com.example.wechatmerchant.skurpc.CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSkuInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CreateSkuReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuServiceMethodDescriptorSupplier("CreateSkuInfo"))
              .build();
        }
      }
    }
    return getCreateSkuInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SkuServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkuServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkuServiceStub>() {
        @java.lang.Override
        public SkuServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkuServiceStub(channel, callOptions);
        }
      };
    return SkuServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SkuServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkuServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkuServiceBlockingStub>() {
        @java.lang.Override
        public SkuServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkuServiceBlockingStub(channel, callOptions);
        }
      };
    return SkuServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SkuServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkuServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkuServiceFutureStub>() {
        @java.lang.Override
        public SkuServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkuServiceFutureStub(channel, callOptions);
        }
      };
    return SkuServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * sku service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getSkuInfo(com.example.wechatmerchant.skurpc.SkuReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.SkuResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSkuInfoMethod(), responseObserver);
    }

    /**
     */
    default void createSkuInfo(com.example.wechatmerchant.skurpc.CreateSkuReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSkuInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SkuService.
   * <pre>
   * sku service
   * </pre>
   */
  public static abstract class SkuServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SkuServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SkuService.
   * <pre>
   * sku service
   * </pre>
   */
  public static final class SkuServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SkuServiceStub> {
    private SkuServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkuServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkuServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSkuInfo(com.example.wechatmerchant.skurpc.SkuReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.SkuResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSkuInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSkuInfo(com.example.wechatmerchant.skurpc.CreateSkuReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSkuInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SkuService.
   * <pre>
   * sku service
   * </pre>
   */
  public static final class SkuServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SkuServiceBlockingStub> {
    private SkuServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkuServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkuServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.SkuResp getSkuInfo(com.example.wechatmerchant.skurpc.SkuReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSkuInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.CommonRsp createSkuInfo(com.example.wechatmerchant.skurpc.CreateSkuReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSkuInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SkuService.
   * <pre>
   * sku service
   * </pre>
   */
  public static final class SkuServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SkuServiceFutureStub> {
    private SkuServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkuServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkuServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.SkuResp> getSkuInfo(
        com.example.wechatmerchant.skurpc.SkuReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSkuInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.CommonRsp> createSkuInfo(
        com.example.wechatmerchant.skurpc.CreateSkuReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSkuInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SKU_INFO = 0;
  private static final int METHODID_CREATE_SKU_INFO = 1;

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
        case METHODID_GET_SKU_INFO:
          serviceImpl.getSkuInfo((com.example.wechatmerchant.skurpc.SkuReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.SkuResp>) responseObserver);
          break;
        case METHODID_CREATE_SKU_INFO:
          serviceImpl.createSkuInfo((com.example.wechatmerchant.skurpc.CreateSkuReq) request,
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
          getGetSkuInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.SkuReq,
              com.example.wechatmerchant.skurpc.SkuResp>(
                service, METHODID_GET_SKU_INFO)))
        .addMethod(
          getCreateSkuInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.CreateSkuReq,
              com.example.wechatmerchant.skurpc.CommonRsp>(
                service, METHODID_CREATE_SKU_INFO)))
        .build();
  }

  private static abstract class SkuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SkuServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.wechatmerchant.skurpc.Sku.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SkuService");
    }
  }

  private static final class SkuServiceFileDescriptorSupplier
      extends SkuServiceBaseDescriptorSupplier {
    SkuServiceFileDescriptorSupplier() {}
  }

  private static final class SkuServiceMethodDescriptorSupplier
      extends SkuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SkuServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SkuServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SkuServiceFileDescriptorSupplier())
              .addMethod(getGetSkuInfoMethod())
              .addMethod(getCreateSkuInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
