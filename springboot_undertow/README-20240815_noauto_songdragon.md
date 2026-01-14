**硬件环境**
MacBook Pro 2019
CPU: Intel Core i7 六核 2.6GHz
内存: 16GB 2667 MHz DDR4
macOS: Sonoma 14.5

**软件环境**
openjdk version "20" 2023-03-21
OpenJDK Runtime Environment (build 20+36-2344)
OpenJDK 64-Bit Server VM (build 20+36-2344, mixed mode, sharing)

**测试方法**
1. 编译完成后，命令行启动
2. 使用wrk进行压测

** 启动后内存 **
``` shell
ps -p 26561  -o pid,args,rss,vsz                                      
  PID ARGS                                 RSS      VSZ
26561 java -jar springboot_undertow.jar 136788 40168988
```

**第一次**

``` shell
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    27.37ms   51.48ms 763.44ms   87.43%
    Req/Sec     4.43k     3.64k   28.51k    75.78%
  Latency Distribution
     50%    1.27ms
     75%   31.09ms
     90%   94.28ms
     99%  235.68ms
  1065387 requests in 30.12s, 164.60MB read
  Socket errors: connect 0, read 292, write 0, timeout 1
Requests/sec:  35377.05
Transfer/sec:      5.47MB
```

**第二次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.26ms   24.19ms 938.23ms   98.82%
    Req/Sec     6.40k     1.57k   22.19k    83.38%
  Latency Distribution
     50%    2.44ms
     75%    3.21ms
     90%    7.35ms
     99%   32.11ms
  1515803 requests in 30.10s, 234.18MB read
  Socket errors: connect 0, read 296, write 0, timeout 2
Requests/sec:  50361.88
Transfer/sec:      7.78MB
```

**第三次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     4.99ms   22.05ms 991.51ms   98.76%
    Req/Sec     6.62k     1.52k   25.75k    83.45%
  Latency Distribution
     50%    2.41ms
     75%    3.08ms
     90%    7.00ms
     99%   31.70ms
  1620797 requests in 30.09s, 250.41MB read
  Socket errors: connect 0, read 293, write 0, timeout 2
Requests/sec:  53862.74
Transfer/sec:      8.32MB
```

**第四次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.13ms   21.40ms 992.71ms   98.01%
    Req/Sec     6.78k     1.74k   23.43k    87.34%
  Latency Distribution
     50%    2.38ms
     75%    3.01ms
     90%    6.99ms
     99%   51.26ms
  1635456 requests in 30.10s, 252.67MB read
  Socket errors: connect 0, read 293, write 0, timeout 2
Requests/sec:  54335.43
Transfer/sec:      8.39MB
```