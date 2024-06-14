package com.example.wechatmerchant.skurpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.bootstrap.encrypt.EncryptionBootstrapConfiguration;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RefreshScope
public class SkuRpcClient {

    @Value("${sku-rpc-service-name:wechant-merchant-go}")
    private String skuRpcServiceName;

    private final SkuServiceGrpc.SkuServiceBlockingStub blockingStub;

    private final SkuInventoryServiceGrpc.SkuInventoryServiceBlockingStub blockingStubInventory;

    @Autowired
    public SkuRpcClient(DiscoveryClient  discoveryClient) {
        List<ServiceInstance> instances = discoveryClient.getInstances(this.skuRpcServiceName);
        ManagedChannel channel = ManagedChannelBuilder.forAddress(
                instances.get(0).getHost(),
                instances.get(0).getPort()
        ).usePlaintext().build();

        this.blockingStub = SkuServiceGrpc.newBlockingStub(channel);
        this.blockingStubInventory = SkuInventoryServiceGrpc.newBlockingStub(channel);
    }

    SkuResp getSkuInfo(List<String> SkuIdList) throws Exception {

        SkuReq.Builder skuReq = SkuReq.newBuilder();
        // todo build sku id list
        SkuResp rsp = blockingStub.getSkuInfo(skuReq.build());
        if (rsp == null) {
            throw new Exception("sss");
        }
        if (rsp.getCommon().getCode() != 0) {
            throw new Exception("sss");
        }
        if (rsp.getDataList().isEmpty()) {
            throw new Exception("sss");
        }
        return rsp;
    }


    public SkuInventoryResp getSkuInventory(List<String> SkuIdList) throws Exception {
        SkuInventoryReq.Builder skuInventoryReq = SkuInventoryReq.newBuilder();
        skuInventoryReq.addAllSkuId(SkuIdList);
        SkuInventoryReq request = skuInventoryReq.build();
        try {
            SkuInventoryResp resp = blockingStubInventory.getSkuInventoryInfo(request);
            if (resp == null) {
                throw new Exception("sss");
            }
            return resp;
        } catch (Exception e) {
            throw new Exception("sss");
        }
    }
}
