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
ps -p 15689 -o pid,args,rss,vsz                                           
  PID ARGS                                 RSS      VSZ
15689 java -jar springboot_undertow.jar 151308 40167376
```

**第一次**

``` shell
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    35.79ms   64.65ms   1.01s    86.57%
    Req/Sec     4.16k     3.75k   22.72k    72.94%
  Latency Distribution
     50%    0.96ms
     75%   47.22ms
     90%  124.20ms
     99%  273.18ms
  958066 requests in 30.10s, 143.45MB read
  Socket errors: connect 0, read 301, write 0, timeout 2
Requests/sec:  31827.68
Transfer/sec:      4.77MB
```

**第二次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.71ms   32.12ms   1.46s    98.13%
    Req/Sec     6.26k     2.17k   20.15k    78.55%
  Latency Distribution
     50%    2.41ms
     75%    3.20ms
     90%    8.83ms
     99%  104.16ms
  1089621 requests in 30.09s, 163.15MB read
  Socket errors: connect 0, read 677, write 0, timeout 12
Requests/sec:  36213.53
Transfer/sec:      5.42MB
```

**第三次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.03ms   22.65ms   1.08s    98.65%
    Req/Sec     6.57k     1.48k   17.88k    84.77%
  Latency Distribution
     50%    2.34ms
     75%    3.06ms
     90%    7.45ms
     99%   32.43ms
  1602715 requests in 30.06s, 239.97MB read
  Socket errors: connect 0, read 293, write 0, timeout 2
Requests/sec:  53309.87
Transfer/sec:      7.98MB
```

**第四次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.64ms   24.97ms 921.84ms   98.25%
    Req/Sec     6.41k     1.84k   24.40k    80.59%
  Latency Distribution
     50%    2.38ms
     75%    3.33ms
     90%    8.57ms
     99%   41.99ms
  1514888 requests in 30.08s, 226.82MB read
  Socket errors: connect 0, read 305, write 0, timeout 2
Requests/sec:  50363.95
Transfer/sec:      7.54MB
```