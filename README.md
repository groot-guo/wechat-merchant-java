# `wechat-merchant-java`

>`wechat` merchant 项目，个人在微信小程序一个商城demo 上做基础开发练习，（暂定）基于 java 和 go 做 微服务框架，涉及 `rpc `调用过程，搭建微服务中心、配置中心，进行统一服务调度，利用Grafana 和 Prometheus做监控信息。
>
>虽然代码采用类似 DDD 的方案进程目录拆解，因为对于`java` 整体目录规划不太了解，但代码规划目录，本着解耦代码原则，暂时一种功能类型的都会单独划分，较为熟悉的会进行常用归类方法。

下面列出一些具体在本次java 项目中的具体功能实现：

基础组件学习使用：

- [x] 日志输出
- [x] `nacos` 服务注册、配置中心
- [x] `Mybatis` 相关配置、使用
- [x] Redis 配置
- [x] `Spring RestTemplate` 请求其他 http 服务示例
- [ ] 微服务调用方式
- [ ] Filter 使用
- [ ] Spring Security 使用
- [ ] `java-rpc`服务启用、服务间调用
- [x] `devcontainer` 开发
- [ ] `Spring AOP` 使用

具体功能实现：

- [x] 用户信息、注册
- [ ] 用户认证
- [ ] 用户地址信息
- [ ] 订单信息管理
- [ ] 购物车信息

功能信息图梳理：

- [ ] UML 流程图
- [ ] `db`数据图
- [ ] 领域图（学习领域驱动模型）

生成java grpc文件
```shell
protoc --java_out=.\src\main\java --grpc-java_out=.\src\main\java   .\src\main\proto\sku.proto 
protoc --java_out=.\src\main\java --grpc-java_out=.\src\main\java  .\src\main\proto\dtmgimp.proto

```
需要在maven 仓库中找到对应 grpc 地址，下载 protoc-gen-grpc-java 的执行文件

### Java 接入 dtm, 添加 dtm 依赖
```xml
<dependency>
    <groupId>io.github.dtm-labs</groupId>
    <artifactId>dtmcli-java</artifactId>
    <version>2.1.4</version>
</dependency>
```
