# helloworld_wrk_test-3

此案仅使用wrk对各web框架进行qps测试，欢迎添加不同的web框架，或者不同机器的测试记录

## 测试方法

* 测试前，先重启下电脑（清下环境，尽量没有别的软件启动）
* IDEA环镜下，在模块的`HelloApp`右键菜单上，点击：`Run 'HelloApp.Main'`
* 运行后，用wrk测试：`wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"` （本机跑，以避免网络因素干扰）
* 测5次，去掉最高值和最低值，取另三次的平均值（有时间的测个10次为佳） 


## 测试记录

测试记录仅供参考。组件版本变化、环境不同，都可能带来分值的不同。


----

#### 机器：2020 macbook pro 13, i7, 32g, MacOS 12.5, jdk11；时间：2023-01-01；测试人：@Noear

| solon 1.12.2                            | 大小   | QPS                | 
|-----------------------------------------|------|--------------------| 
| solon.boot.jlhttp(bio)                  | 0.3m | 13.2万左右（2023年，有变化） |
| solon.boot.jetty(nio, 支持servlet api)    | 2.2m | 12.3万左右（2023年，有变化）            | 
| solon.boot.undertow(nio, 支持servlet api) | 4.5m | 12.0万左右            | 
| solon.boot.smarthttp(aio)               | 0.7m | 16.6万左右（2023年，有变化） | 


| javalin 3.13.7  | 大小 |  QPS  | 
| -------- | -------- | -------- |
| javalin(jetty)   | 5.0m |  9.1万左右  | 


| spring boot 2.3.3  | 大小 |  QPS  | 
| -------- | -------- | -------- |
| spring-boot-starter-tomcat   | 16.1m |  2.9万左右  | 
| spring-boot-starter-jetty | 16m | 3.7万左右 |
| spring-boot-starter-undertow | 16.8m | 4.2万左右 |

| jboot 3.9.11  | 大小 | QPS                | 
| -------- | -------- |--------------------|
| jboot(undertow)   | 19.2m | 11.5万左右（2023年，有变化） | 


| jfinal 4.9.10  | 大小 | QPS     | 
| -------- | -------- |---------|
| jfinal(undertow)   | 4.4m | 12.3万左右（2023年，有变化） | 


----

#### 机器：PN50 NUC, AMD 4500, 16G, jdk11；时间：2020-10-14；测试人：@Muggle

|  solon 1.1.2 | 大小 | QPS | 
| -------- | -------- | -------- | 
| solon.boot.jlhttp(bio)     | 0.1m     | 120356     |
| solon.boot.jetty(nio, 支持servlet api)     | 1.8m     | 120816     | 
| solon.boot.undertow(nio, 支持servlet api)     | 4.2m     | 136558     | 
| solon.boot.smarthttp(aio)     | 0.3m     | 129714     | 


| javalin 3.1.0  | 大小 |  QPS  | 
| -------- | -------- | -------- |
| javalin(jetty)   | 4.8m |  127977  | 


| spring boot 2.3.3  | 大小 |  QPS  | 
| -------- | -------- | -------- |
| spring-boot-starter-tomcat   | 16.1m |  46846  | 
| spring-boot-starter-jetty | 16m | 52058 |
| spring-boot-starter-undertow | 16.8m | 63666 |



