package com.example.wechatmerchant.skurpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: src/main/proto/sku.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SkuServiceGrpc {

  private SkuServiceGrpc() {}

  public static final String SERVICE_NAME = "sku.SkuService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SkuReq,
      SkuResp> getGetSkuInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSkuInfo",
      requestType = SkuReq.class,
      responseType = SkuResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SkuReq,
      SkuResp> getGetSkuInfoMethod() {
    io.grpc.MethodDescriptor<SkuReq, SkuResp> getGetSkuInfoMethod;
    if ((getGetSkuInfoMethod = SkuServiceGrpc.getGetSkuInfoMethod) == null) {
      synchronized (SkuServiceGrpc.class) {
        if ((getGetSkuInfoMethod = SkuServiceGrpc.getGetSkuInfoMethod) == null) {
          SkuServiceGrpc.getGetSkuInfoMethod = getGetSkuInfoMethod =
              io.grpc.MethodDescriptor.<SkuReq, SkuResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSkuInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SkuReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SkuResp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuServiceMethodDescriptorSupplier("GetSkuInfo"))
              .build();
        }
      }
    }
    return getGetSkuInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CreateOrUpdateSkuReq,
      CommonRsp> getCreateSkuInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSkuInfo",
      requestType = CreateOrUpdateSkuReq.class,
      responseType = CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CreateOrUpdateSkuReq,
      CommonRsp> getCreateSkuInfoMethod() {
    io.grpc.MethodDescriptor<CreateOrUpdateSkuReq, CommonRsp> getCreateSkuInfoMethod;
    if ((getCreateSkuInfoMethod = SkuServiceGrpc.getCreateSkuInfoMethod) == null) {
      synchronized (SkuServiceGrpc.class) {
        if ((getCreateSkuInfoMethod = SkuServiceGrpc.getCreateSkuInfoMethod) == null) {
          SkuServiceGrpc.getCreateSkuInfoMethod = getCreateSkuInfoMethod =
              io.grpc.MethodDescriptor.<CreateOrUpdateSkuReq, CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSkuInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CreateOrUpdateSkuReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuServiceMethodDescriptorSupplier("CreateSkuInfo"))
              .build();
        }
      }
    }
    return getCreateSkuInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CreateOrUpdateSkuReq,
      CommonRsp> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = CreateOrUpdateSkuReq.class,
      responseType = CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CreateOrUpdateSkuReq,
      CommonRsp> getUpdateMethod() {
    io.grpc.MethodDescriptor<CreateOrUpdateSkuReq, CommonRsp> getUpdateMethod;
    if ((getUpdateMethod = SkuServiceGrpc.getUpdateMethod) == null) {
      synchronized (SkuServiceGrpc.class) {
        if ((getUpdateMethod = SkuServiceGrpc.getUpdateMethod) == null) {
          SkuServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<CreateOrUpdateSkuReq, CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CreateOrUpdateSkuReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SkuInventoryReq,
      SkuInventoryResp> getGetSkuInventoryInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSkuInventoryInfo",
      requestType = SkuInventoryReq.class,
      responseType = SkuInventoryResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SkuInventoryReq,
      SkuInventoryResp> getGetSkuInventoryInfoMethod() {
    io.grpc.MethodDescriptor<SkuInventoryReq, SkuInventoryResp> getGetSkuInventoryInfoMethod;
    if ((getGetSkuInventoryInfoMethod = SkuServiceGrpc.getGetSkuInventoryInfoMethod) == null) {
      synchronized (SkuServiceGrpc.class) {
        if ((getGetSkuInventoryInfoMethod = SkuServiceGrpc.getGetSkuInventoryInfoMethod) == null) {
          SkuServiceGrpc.getGetSkuInventoryInfoMethod = getGetSkuInventoryInfoMethod =
              io.grpc.MethodDescriptor.<SkuInventoryReq, SkuInventoryResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSkuInventoryInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SkuInventoryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SkuInventoryResp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuServiceMethodDescriptorSupplier("GetSkuInventoryInfo"))
              .build();
        }
      }
    }
    return getGetSkuInventoryInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SkuServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkuServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkuServiceStub>() {
        @Override
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
        @Override
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
        @Override
        public SkuServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkuServiceFutureStub(channel, callOptions);
        }
      };
    return SkuServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getSkuInfo(SkuReq request,
                            io.grpc.stub.StreamObserver<SkuResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSkuInfoMethod(), responseObserver);
    }

    /**
     */
    default void createSkuInfo(CreateOrUpdateSkuReq request,
                               io.grpc.stub.StreamObserver<CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSkuInfoMethod(), responseObserver);
    }

    /**
     */
    default void update(CreateOrUpdateSkuReq request,
                        io.grpc.stub.StreamObserver<CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    default void getSkuInventoryInfo(SkuInventoryReq request,
                                     io.grpc.stub.StreamObserver<SkuInventoryResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSkuInventoryInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SkuService.
   */
  public static abstract class SkuServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return SkuServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SkuService.
   */
  public static final class SkuServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SkuServiceStub> {
    private SkuServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SkuServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkuServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSkuInfo(SkuReq request,
                           io.grpc.stub.StreamObserver<SkuResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSkuInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSkuInfo(CreateOrUpdateSkuReq request,
                              io.grpc.stub.StreamObserver<CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSkuInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(CreateOrUpdateSkuReq request,
                       io.grpc.stub.StreamObserver<CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSkuInventoryInfo(SkuInventoryReq request,
                                    io.grpc.stub.StreamObserver<SkuInventoryResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSkuInventoryInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SkuService.
   */
  public static final class SkuServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SkuServiceBlockingStub> {
    private SkuServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SkuServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkuServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public SkuResp getSkuInfo(SkuReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSkuInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public CommonRsp createSkuInfo(CreateOrUpdateSkuReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSkuInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public CommonRsp update(CreateOrUpdateSkuReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public SkuInventoryResp getSkuInventoryInfo(SkuInventoryReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSkuInventoryInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SkuService.
   */
  public static final class SkuServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SkuServiceFutureStub> {
    private SkuServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SkuServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkuServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SkuResp> getSkuInfo(
        SkuReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSkuInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CommonRsp> createSkuInfo(
        CreateOrUpdateSkuReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSkuInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CommonRsp> update(
        CreateOrUpdateSkuReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SkuInventoryResp> getSkuInventoryInfo(
        SkuInventoryReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSkuInventoryInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SKU_INFO = 0;
  private static final int METHODID_CREATE_SKU_INFO = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_GET_SKU_INVENTORY_INFO = 3;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SKU_INFO:
          serviceImpl.getSkuInfo((SkuReq) request,
              (io.grpc.stub.StreamObserver<SkuResp>) responseObserver);
          break;
        case METHODID_CREATE_SKU_INFO:
          serviceImpl.createSkuInfo((CreateOrUpdateSkuReq) request,
              (io.grpc.stub.StreamObserver<CommonRsp>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((CreateOrUpdateSkuReq) request,
              (io.grpc.stub.StreamObserver<CommonRsp>) responseObserver);
          break;
        case METHODID_GET_SKU_INVENTORY_INFO:
          serviceImpl.getSkuInventoryInfo((SkuInventoryReq) request,
              (io.grpc.stub.StreamObserver<SkuInventoryResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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
              SkuReq,
              SkuResp>(
                service, METHODID_GET_SKU_INFO)))
        .addMethod(
          getCreateSkuInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              CreateOrUpdateSkuReq,
              CommonRsp>(
                service, METHODID_CREATE_SKU_INFO)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              CreateOrUpdateSkuReq,
              CommonRsp>(
                service, METHODID_UPDATE)))
        .addMethod(
          getGetSkuInventoryInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              SkuInventoryReq,
              SkuInventoryResp>(
                service, METHODID_GET_SKU_INVENTORY_INFO)))
        .build();
  }

  private static abstract class SkuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SkuServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Sku.getDescriptor();
    }

    @Override
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
    private final String methodName;

    SkuServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
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
              .addMethod(getUpdateMethod())
              .addMethod(getGetSkuInventoryInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
