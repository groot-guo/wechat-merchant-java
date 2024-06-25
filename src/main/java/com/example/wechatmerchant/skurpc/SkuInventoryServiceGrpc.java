package com.example.wechatmerchant.skurpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * sku inventory service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: src/main/proto/sku.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SkuInventoryServiceGrpc {

  private SkuInventoryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sku.SkuInventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.SkuInventoryReq,
      com.example.wechatmerchant.skurpc.SkuInventoryResp> getGetSkuInventoryInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSkuInventoryInfo",
      requestType = com.example.wechatmerchant.skurpc.SkuInventoryReq.class,
      responseType = com.example.wechatmerchant.skurpc.SkuInventoryResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.SkuInventoryReq,
      com.example.wechatmerchant.skurpc.SkuInventoryResp> getGetSkuInventoryInfoMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.SkuInventoryReq, com.example.wechatmerchant.skurpc.SkuInventoryResp> getGetSkuInventoryInfoMethod;
    if ((getGetSkuInventoryInfoMethod = SkuInventoryServiceGrpc.getGetSkuInventoryInfoMethod) == null) {
      synchronized (SkuInventoryServiceGrpc.class) {
        if ((getGetSkuInventoryInfoMethod = SkuInventoryServiceGrpc.getGetSkuInventoryInfoMethod) == null) {
          SkuInventoryServiceGrpc.getGetSkuInventoryInfoMethod = getGetSkuInventoryInfoMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.SkuInventoryReq, com.example.wechatmerchant.skurpc.SkuInventoryResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSkuInventoryInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.SkuInventoryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.SkuInventoryResp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuInventoryServiceMethodDescriptorSupplier("GetSkuInventoryInfo"))
              .build();
        }
      }
    }
    return getGetSkuInventoryInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getUpdateSkuInventoryInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSkuInventoryInfo",
      requestType = com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.class,
      responseType = com.example.wechatmerchant.skurpc.CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getUpdateSkuInventoryInfoMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp> getUpdateSkuInventoryInfoMethod;
    if ((getUpdateSkuInventoryInfoMethod = SkuInventoryServiceGrpc.getUpdateSkuInventoryInfoMethod) == null) {
      synchronized (SkuInventoryServiceGrpc.class) {
        if ((getUpdateSkuInventoryInfoMethod = SkuInventoryServiceGrpc.getUpdateSkuInventoryInfoMethod) == null) {
          SkuInventoryServiceGrpc.getUpdateSkuInventoryInfoMethod = getUpdateSkuInventoryInfoMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSkuInventoryInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuInventoryServiceMethodDescriptorSupplier("UpdateSkuInventoryInfo"))
              .build();
        }
      }
    }
    return getUpdateSkuInventoryInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventorySagaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeductSkuInventorySaga",
      requestType = com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.class,
      responseType = com.example.wechatmerchant.skurpc.CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventorySagaMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventorySagaMethod;
    if ((getDeductSkuInventorySagaMethod = SkuInventoryServiceGrpc.getDeductSkuInventorySagaMethod) == null) {
      synchronized (SkuInventoryServiceGrpc.class) {
        if ((getDeductSkuInventorySagaMethod = SkuInventoryServiceGrpc.getDeductSkuInventorySagaMethod) == null) {
          SkuInventoryServiceGrpc.getDeductSkuInventorySagaMethod = getDeductSkuInventorySagaMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeductSkuInventorySaga"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuInventoryServiceMethodDescriptorSupplier("DeductSkuInventorySaga"))
              .build();
        }
      }
    }
    return getDeductSkuInventorySagaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventorySagaRollbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeductSkuInventorySagaRollback",
      requestType = com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.class,
      responseType = com.example.wechatmerchant.skurpc.CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventorySagaRollbackMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventorySagaRollbackMethod;
    if ((getDeductSkuInventorySagaRollbackMethod = SkuInventoryServiceGrpc.getDeductSkuInventorySagaRollbackMethod) == null) {
      synchronized (SkuInventoryServiceGrpc.class) {
        if ((getDeductSkuInventorySagaRollbackMethod = SkuInventoryServiceGrpc.getDeductSkuInventorySagaRollbackMethod) == null) {
          SkuInventoryServiceGrpc.getDeductSkuInventorySagaRollbackMethod = getDeductSkuInventorySagaRollbackMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeductSkuInventorySagaRollback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuInventoryServiceMethodDescriptorSupplier("DeductSkuInventorySagaRollback"))
              .build();
        }
      }
    }
    return getDeductSkuInventorySagaRollbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventoryTccTryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeductSkuInventoryTccTry",
      requestType = com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.class,
      responseType = com.example.wechatmerchant.skurpc.CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventoryTccTryMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventoryTccTryMethod;
    if ((getDeductSkuInventoryTccTryMethod = SkuInventoryServiceGrpc.getDeductSkuInventoryTccTryMethod) == null) {
      synchronized (SkuInventoryServiceGrpc.class) {
        if ((getDeductSkuInventoryTccTryMethod = SkuInventoryServiceGrpc.getDeductSkuInventoryTccTryMethod) == null) {
          SkuInventoryServiceGrpc.getDeductSkuInventoryTccTryMethod = getDeductSkuInventoryTccTryMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeductSkuInventoryTccTry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuInventoryServiceMethodDescriptorSupplier("DeductSkuInventoryTccTry"))
              .build();
        }
      }
    }
    return getDeductSkuInventoryTccTryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventoryTccSubmitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeductSkuInventoryTccSubmit",
      requestType = com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.class,
      responseType = com.example.wechatmerchant.skurpc.CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventoryTccSubmitMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventoryTccSubmitMethod;
    if ((getDeductSkuInventoryTccSubmitMethod = SkuInventoryServiceGrpc.getDeductSkuInventoryTccSubmitMethod) == null) {
      synchronized (SkuInventoryServiceGrpc.class) {
        if ((getDeductSkuInventoryTccSubmitMethod = SkuInventoryServiceGrpc.getDeductSkuInventoryTccSubmitMethod) == null) {
          SkuInventoryServiceGrpc.getDeductSkuInventoryTccSubmitMethod = getDeductSkuInventoryTccSubmitMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeductSkuInventoryTccSubmit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuInventoryServiceMethodDescriptorSupplier("DeductSkuInventoryTccSubmit"))
              .build();
        }
      }
    }
    return getDeductSkuInventoryTccSubmitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventoryTccRollbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeductSkuInventoryTccRollback",
      requestType = com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.class,
      responseType = com.example.wechatmerchant.skurpc.CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventoryTccRollbackMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventoryTccRollbackMethod;
    if ((getDeductSkuInventoryTccRollbackMethod = SkuInventoryServiceGrpc.getDeductSkuInventoryTccRollbackMethod) == null) {
      synchronized (SkuInventoryServiceGrpc.class) {
        if ((getDeductSkuInventoryTccRollbackMethod = SkuInventoryServiceGrpc.getDeductSkuInventoryTccRollbackMethod) == null) {
          SkuInventoryServiceGrpc.getDeductSkuInventoryTccRollbackMethod = getDeductSkuInventoryTccRollbackMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeductSkuInventoryTccRollback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuInventoryServiceMethodDescriptorSupplier("DeductSkuInventoryTccRollback"))
              .build();
        }
      }
    }
    return getDeductSkuInventoryTccRollbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventoryXaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeductSkuInventoryXa",
      requestType = com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.class,
      responseType = com.example.wechatmerchant.skurpc.CommonRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
      com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventoryXaMethod() {
    io.grpc.MethodDescriptor<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp> getDeductSkuInventoryXaMethod;
    if ((getDeductSkuInventoryXaMethod = SkuInventoryServiceGrpc.getDeductSkuInventoryXaMethod) == null) {
      synchronized (SkuInventoryServiceGrpc.class) {
        if ((getDeductSkuInventoryXaMethod = SkuInventoryServiceGrpc.getDeductSkuInventoryXaMethod) == null) {
          SkuInventoryServiceGrpc.getDeductSkuInventoryXaMethod = getDeductSkuInventoryXaMethod =
              io.grpc.MethodDescriptor.<com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq, com.example.wechatmerchant.skurpc.CommonRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeductSkuInventoryXa"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.wechatmerchant.skurpc.CommonRsp.getDefaultInstance()))
              .setSchemaDescriptor(new SkuInventoryServiceMethodDescriptorSupplier("DeductSkuInventoryXa"))
              .build();
        }
      }
    }
    return getDeductSkuInventoryXaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SkuInventoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkuInventoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkuInventoryServiceStub>() {
        @java.lang.Override
        public SkuInventoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkuInventoryServiceStub(channel, callOptions);
        }
      };
    return SkuInventoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SkuInventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkuInventoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkuInventoryServiceBlockingStub>() {
        @java.lang.Override
        public SkuInventoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkuInventoryServiceBlockingStub(channel, callOptions);
        }
      };
    return SkuInventoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SkuInventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkuInventoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkuInventoryServiceFutureStub>() {
        @java.lang.Override
        public SkuInventoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkuInventoryServiceFutureStub(channel, callOptions);
        }
      };
    return SkuInventoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * sku inventory service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getSkuInventoryInfo(com.example.wechatmerchant.skurpc.SkuInventoryReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.SkuInventoryResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSkuInventoryInfoMethod(), responseObserver);
    }

    /**
     */
    default void updateSkuInventoryInfo(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSkuInventoryInfoMethod(), responseObserver);
    }

    /**
     */
    default void deductSkuInventorySaga(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeductSkuInventorySagaMethod(), responseObserver);
    }

    /**
     */
    default void deductSkuInventorySagaRollback(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeductSkuInventorySagaRollbackMethod(), responseObserver);
    }

    /**
     */
    default void deductSkuInventoryTccTry(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeductSkuInventoryTccTryMethod(), responseObserver);
    }

    /**
     */
    default void deductSkuInventoryTccSubmit(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeductSkuInventoryTccSubmitMethod(), responseObserver);
    }

    /**
     */
    default void deductSkuInventoryTccRollback(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeductSkuInventoryTccRollbackMethod(), responseObserver);
    }

    /**
     */
    default void deductSkuInventoryXa(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeductSkuInventoryXaMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SkuInventoryService.
   * <pre>
   * sku inventory service
   * </pre>
   */
  public static abstract class SkuInventoryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SkuInventoryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SkuInventoryService.
   * <pre>
   * sku inventory service
   * </pre>
   */
  public static final class SkuInventoryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SkuInventoryServiceStub> {
    private SkuInventoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkuInventoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkuInventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSkuInventoryInfo(com.example.wechatmerchant.skurpc.SkuInventoryReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.SkuInventoryResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSkuInventoryInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSkuInventoryInfo(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSkuInventoryInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deductSkuInventorySaga(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeductSkuInventorySagaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deductSkuInventorySagaRollback(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeductSkuInventorySagaRollbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deductSkuInventoryTccTry(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeductSkuInventoryTccTryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deductSkuInventoryTccSubmit(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeductSkuInventoryTccSubmitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deductSkuInventoryTccRollback(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeductSkuInventoryTccRollbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deductSkuInventoryXa(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request,
        io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeductSkuInventoryXaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SkuInventoryService.
   * <pre>
   * sku inventory service
   * </pre>
   */
  public static final class SkuInventoryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SkuInventoryServiceBlockingStub> {
    private SkuInventoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkuInventoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkuInventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.SkuInventoryResp getSkuInventoryInfo(com.example.wechatmerchant.skurpc.SkuInventoryReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSkuInventoryInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.CommonRsp updateSkuInventoryInfo(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSkuInventoryInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.CommonRsp deductSkuInventorySaga(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeductSkuInventorySagaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.CommonRsp deductSkuInventorySagaRollback(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeductSkuInventorySagaRollbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.CommonRsp deductSkuInventoryTccTry(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeductSkuInventoryTccTryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.CommonRsp deductSkuInventoryTccSubmit(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeductSkuInventoryTccSubmitMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.CommonRsp deductSkuInventoryTccRollback(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeductSkuInventoryTccRollbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.wechatmerchant.skurpc.CommonRsp deductSkuInventoryXa(com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeductSkuInventoryXaMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SkuInventoryService.
   * <pre>
   * sku inventory service
   * </pre>
   */
  public static final class SkuInventoryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SkuInventoryServiceFutureStub> {
    private SkuInventoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkuInventoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkuInventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.SkuInventoryResp> getSkuInventoryInfo(
        com.example.wechatmerchant.skurpc.SkuInventoryReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSkuInventoryInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.CommonRsp> updateSkuInventoryInfo(
        com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSkuInventoryInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.CommonRsp> deductSkuInventorySaga(
        com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeductSkuInventorySagaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.CommonRsp> deductSkuInventorySagaRollback(
        com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeductSkuInventorySagaRollbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.CommonRsp> deductSkuInventoryTccTry(
        com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeductSkuInventoryTccTryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.CommonRsp> deductSkuInventoryTccSubmit(
        com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeductSkuInventoryTccSubmitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.CommonRsp> deductSkuInventoryTccRollback(
        com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeductSkuInventoryTccRollbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.wechatmerchant.skurpc.CommonRsp> deductSkuInventoryXa(
        com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeductSkuInventoryXaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SKU_INVENTORY_INFO = 0;
  private static final int METHODID_UPDATE_SKU_INVENTORY_INFO = 1;
  private static final int METHODID_DEDUCT_SKU_INVENTORY_SAGA = 2;
  private static final int METHODID_DEDUCT_SKU_INVENTORY_SAGA_ROLLBACK = 3;
  private static final int METHODID_DEDUCT_SKU_INVENTORY_TCC_TRY = 4;
  private static final int METHODID_DEDUCT_SKU_INVENTORY_TCC_SUBMIT = 5;
  private static final int METHODID_DEDUCT_SKU_INVENTORY_TCC_ROLLBACK = 6;
  private static final int METHODID_DEDUCT_SKU_INVENTORY_XA = 7;

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
        case METHODID_GET_SKU_INVENTORY_INFO:
          serviceImpl.getSkuInventoryInfo((com.example.wechatmerchant.skurpc.SkuInventoryReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.SkuInventoryResp>) responseObserver);
          break;
        case METHODID_UPDATE_SKU_INVENTORY_INFO:
          serviceImpl.updateSkuInventoryInfo((com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp>) responseObserver);
          break;
        case METHODID_DEDUCT_SKU_INVENTORY_SAGA:
          serviceImpl.deductSkuInventorySaga((com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp>) responseObserver);
          break;
        case METHODID_DEDUCT_SKU_INVENTORY_SAGA_ROLLBACK:
          serviceImpl.deductSkuInventorySagaRollback((com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp>) responseObserver);
          break;
        case METHODID_DEDUCT_SKU_INVENTORY_TCC_TRY:
          serviceImpl.deductSkuInventoryTccTry((com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp>) responseObserver);
          break;
        case METHODID_DEDUCT_SKU_INVENTORY_TCC_SUBMIT:
          serviceImpl.deductSkuInventoryTccSubmit((com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp>) responseObserver);
          break;
        case METHODID_DEDUCT_SKU_INVENTORY_TCC_ROLLBACK:
          serviceImpl.deductSkuInventoryTccRollback((com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq) request,
              (io.grpc.stub.StreamObserver<com.example.wechatmerchant.skurpc.CommonRsp>) responseObserver);
          break;
        case METHODID_DEDUCT_SKU_INVENTORY_XA:
          serviceImpl.deductSkuInventoryXa((com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq) request,
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
          getGetSkuInventoryInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.SkuInventoryReq,
              com.example.wechatmerchant.skurpc.SkuInventoryResp>(
                service, METHODID_GET_SKU_INVENTORY_INFO)))
        .addMethod(
          getUpdateSkuInventoryInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
              com.example.wechatmerchant.skurpc.CommonRsp>(
                service, METHODID_UPDATE_SKU_INVENTORY_INFO)))
        .addMethod(
          getDeductSkuInventorySagaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
              com.example.wechatmerchant.skurpc.CommonRsp>(
                service, METHODID_DEDUCT_SKU_INVENTORY_SAGA)))
        .addMethod(
          getDeductSkuInventorySagaRollbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
              com.example.wechatmerchant.skurpc.CommonRsp>(
                service, METHODID_DEDUCT_SKU_INVENTORY_SAGA_ROLLBACK)))
        .addMethod(
          getDeductSkuInventoryTccTryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
              com.example.wechatmerchant.skurpc.CommonRsp>(
                service, METHODID_DEDUCT_SKU_INVENTORY_TCC_TRY)))
        .addMethod(
          getDeductSkuInventoryTccSubmitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
              com.example.wechatmerchant.skurpc.CommonRsp>(
                service, METHODID_DEDUCT_SKU_INVENTORY_TCC_SUBMIT)))
        .addMethod(
          getDeductSkuInventoryTccRollbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
              com.example.wechatmerchant.skurpc.CommonRsp>(
                service, METHODID_DEDUCT_SKU_INVENTORY_TCC_ROLLBACK)))
        .addMethod(
          getDeductSkuInventoryXaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.wechatmerchant.skurpc.UpdateSkuInventoryInfoReq,
              com.example.wechatmerchant.skurpc.CommonRsp>(
                service, METHODID_DEDUCT_SKU_INVENTORY_XA)))
        .build();
  }

  private static abstract class SkuInventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SkuInventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.wechatmerchant.skurpc.Sku.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SkuInventoryService");
    }
  }

  private static final class SkuInventoryServiceFileDescriptorSupplier
      extends SkuInventoryServiceBaseDescriptorSupplier {
    SkuInventoryServiceFileDescriptorSupplier() {}
  }

  private static final class SkuInventoryServiceMethodDescriptorSupplier
      extends SkuInventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SkuInventoryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SkuInventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SkuInventoryServiceFileDescriptorSupplier())
              .addMethod(getGetSkuInventoryInfoMethod())
              .addMethod(getUpdateSkuInventoryInfoMethod())
              .addMethod(getDeductSkuInventorySagaMethod())
              .addMethod(getDeductSkuInventorySagaRollbackMethod())
              .addMethod(getDeductSkuInventoryTccTryMethod())
              .addMethod(getDeductSkuInventoryTccSubmitMethod())
              .addMethod(getDeductSkuInventoryTccRollbackMethod())
              .addMethod(getDeductSkuInventoryXaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
