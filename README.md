# helloworld_wrk_test

此案仅使用wrk对各web框架进行qps测试，欢迎添加不同的web框架，或者不同机器的测试记录

## 测试方法

* IDEA环镜下，在模块的`HelloApp`右键菜单上，点击：`Run 'HelloApp.Main'`
* 运行后，用wrk测试：`wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"`
* 测四次，取后三次的平均值


## 测试记录

#### 2017款 macbook pro 13, i7, 16g, jdk11；2020-10-05

|  solon 1.0.40 | 大小 | QPS | 
| -------- | -------- | -------- | 
| solon.boot.jlhttp(bio)     | 0.1m     | 4.7万左右     |
| solon.boot.jetty(nio)     | 1.8m     | 10.7万左右     | 
| solon.boot.undertow(nio)     | 4.2m     | 11.3万左右     | 


| javalin 3.1.0  | 大小 |  QPS  | 
| -------- | -------- | -------- |
| javalin(jetty)   | 4.8m |  9.8万左右  | 


| spring boot 2.3.3  | 大小 |  QPS  | 
| -------- | -------- | -------- |
| spring-boot-starter-tomcat   | 16.1m |  3.2万左右  | 
| spring-boot-starter-jetty | 16m | 3.7万左右 |
| spring-boot-starter-undertow | 16.8m | 4.4万左右 |

| jboot 3.5.2  | 大小 |  QPS  | 
| -------- | -------- | -------- |
| jboot(undertow)   | 17.2m |  3.8万左右  | 


## 附:

> **Solon详解系列文章：**
> * [Solon详解（一）- 快速入门](https://www.cnblogs.com/noear/p/13520109.html)
> * [Solon详解（二）- Solon的核心](https://www.cnblogs.com/noear/p/13520125.html)
> * [Solon详解（三）- Solon的web开发](https://www.cnblogs.com/noear/p/13520142.html)
> * [Solon详解（四）- Solon的事务传播机制](https://www.cnblogs.com/noear/p/13545461.html)
> * [Solon详解（五）- Solon扩展机制之Solon Plugin](https://www.cnblogs.com/noear/p/13547433.html)
> * [Solon详解（六）- Solon的校验扩展框架使用与扩展  ](https://www.cnblogs.com/noear/p/13640075.html)
> * [Solon详解（七）- Solon Ioc 的注解对比Spring及JSR330](https://www.cnblogs.com/noear/p/13666001.html)
> * [Solon详解（八）- Solon的缓存框架使用和定制](https://www.cnblogs.com/noear/p/13737075.html)
> * [Solon详解（九）- 渲染控制之定制统一的接口输出](https://www.cnblogs.com/noear/p/13753930.html)
> * [Solon详解（十）- 怎么用 Solon 开发基于 undertow jsp tld 的项目？](https://www.cnblogs.com/noear/p/13772695.html)


