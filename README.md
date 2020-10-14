# helloworld_wrk_test

此案仅使用wrk对各web框架进行qps测试，欢迎添加不同的web框架，或者不同机器的测试记录

## 测试方法

* IDEA环镜下，在模块的`HelloApp`右键菜单上，点击：`Run 'HelloApp.Main'`
* 运行后，用wrk测试：`wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"` （本机跑，以避免网络因素干扰）
* 测四次，取后三次的平均值


## 测试记录

#### 2017款 macbook pro 13, i7, 16g, jdk11；2020-10-05

|  solon 1.1.2 | 大小 | QPS | 
| -------- | -------- | -------- | 
| solon.boot.jlhttp(bio)     | 0.1m     | 4.7万左右     |
| solon.boot.jetty(nio)     | 1.8m     | 10.7万左右     | 
| solon.boot.undertow(nio)     | 4.2m     | 11.3万左右     | 
| solon.boot.smarthttp(aio)	|0.3m	|12.4万左右|

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


| jfinal 4.9.02  | 大小 |  QPS  | 
| -------- | -------- | -------- |
| jfinal(undertow)   | 4.4m |  6.4万左右  | 

#### PN50 NUC, AMD 4500U, 16G, jdk11; 2020-10-14
|  solon 1.1.2 | 大小 | QPS | 
| -------- | -------- | -------- | 
| solon.boot.jlhttp(bio)        | 0.1m  | 120356  |
| solon.boot.jetty(nio)         | 1.8m  | 120816  | 
| solon.boot.undertow(nio)      | 4.2m  | 136558  | 
| solon.boot.smarthttp(aio)	    | 0.3m	| 129714  |


| javalin 3.1.0  | 大小 |  QPS  | 
| -------- | -------- | -------- |
| javalin(jetty)                | 4.8m | 127977 | 


| spring boot 2.3.3  | 大小 |  QPS  | 
| -------- | -------- | -------- |
| spring-boot-starter-tomcat   | 16.1m |  46846  | 
| spring-boot-starter-jetty    | 16m   |  52058  |
| spring-boot-starter-undertow | 16.8m |  63666  |


| jboot 3.5.2  | 大小  |  QPS  | 
| -------- | -------- | -------- |
| jboot(undertow)     | 17.2m    | 47105 | 


| jfinal 4.9.02  | 大小 |  QPS  | 
| -------- | -------- | ------ |
| jfinal(undertow)    | 4.4m   | 59197 | 
