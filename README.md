# helloworld_wrk_test

此案仅使用wrk对各web框架进行qps测试，欢迎添加不同的web框架，或者不同机器的测试记录

## 测试方法

* IDEA环镜下，在模块的`HelloApp`右键菜单上，点击：`Run 'HelloApp.Main'`
* 运行后，用wrk测试：`wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"`
* 测四次，取后三次的平均值


## 测试记录

#### 2017款 macbook pro i7 16g

|  solon 1.0.40 | 大小 | QPS | spring boot 2.3.3  |  QPS  | 
| -------- | -------- | -------- | -------- | -------- |
| solon.boot.jlhttp (可独立运行)     | 0.1m     | 4.5万左右     | /   |    | 
| /     |      |      | spring-boot-starter-tomcat   |  3.1万左右  | 
| solon.boot.jetty (可独立运行)     | 1.8m     | 10.5万左右     | spring-boot-starter-jetty | 3.5万左右 |
| solon.boot.undertow (可独立运行)     | 4.2m     | 10.5万左右     | spring-boot-starter-undertow | 3.9万左右 |
| solon.boot.smarthttp (可独立运行)     | 0.3m     | 12万左右     | /   |    | 
