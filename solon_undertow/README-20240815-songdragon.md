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
ps -p 9384 -o pid,args,rss,vsz                                             
PID ARGS                            RSS      VSZ
9384 java -jar solon_undertow.jar  41888 40165304
```

**第一次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    15.94ms   48.01ms   1.24s    93.19%
    Req/Sec     5.68k     2.79k   24.46k    73.32%
  Latency Distribution
     50%    2.38ms
     75%    7.32ms
     90%   38.60ms
     99%  221.84ms
  1324256 requests in 30.09s, 260.16MB read
  Socket errors: connect 0, read 347, write 0, timeout 2
Requests/sec:  44010.19
Transfer/sec:      8.65MB
```

**第二次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.39ms   22.40ms 906.77ms   96.27%
    Req/Sec     6.53k     1.99k   28.16k    80.53%
  Latency Distribution
     50%    2.43ms
     75%    3.32ms
     90%    9.74ms
     99%   88.31ms
  1568045 requests in 30.09s, 308.05MB read
  Socket errors: connect 0, read 290, write 0, timeout 2
Requests/sec:  52118.13
Transfer/sec:     10.24MB
```

**第三次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    11.11ms   53.48ms   1.66s    97.03%
    Req/Sec     6.37k     2.17k   25.06k    81.69%
  Latency Distribution
     50%    2.44ms
     75%    3.75ms
     90%   11.03ms
     99%  242.07ms
  1641788 requests in 30.09s, 322.54MB read
  Socket errors: connect 0, read 463, write 0, timeout 0
Requests/sec:  54561.18
Transfer/sec:     10.72MB
```

**第四次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    25.10ms  107.18ms   1.07s    95.75%
    Req/Sec     6.15k     2.31k   30.99k    79.80%
  Latency Distribution
     50%    2.45ms
     75%    4.25ms
     90%   19.12ms
     99%  697.77ms
  1358780 requests in 30.08s, 266.94MB read
  Socket errors: connect 0, read 294, write 0, timeout 2
Requests/sec:  45179.20
Transfer/sec:      8.88MB

```