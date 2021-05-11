**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    13.22ms   33.26ms 510.27ms   90.67%
    Req/Sec     8.81k     5.59k   36.80k    69.80%
  Latency Distribution
     50%    1.09ms
     75%    6.13ms
     90%   42.78ms
     99%  154.49ms
  2552664 requests in 30.10s, 316.47MB read
  Socket errors: connect 0, read 225, write 0, timeout 0
Requests/sec:  84808.72
Transfer/sec:     10.51MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.42ms   16.76ms 165.65ms   91.76%
    Req/Sec    10.27k     5.90k   37.48k    70.42%
  Latency Distribution
     50%    0.90ms
     75%    2.07ms
     90%   17.60ms
     99%   92.67ms
  2987518 requests in 30.09s, 370.39MB read
  Socket errors: connect 0, read 222, write 0, timeout 0
Requests/sec:  99287.86
Transfer/sec:     12.31MB
```

**第三次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     7.43ms   18.80ms 150.87ms   91.11%
    Req/Sec    10.18k     6.21k   42.27k    69.61%
  Latency Distribution
     50%  815.00us
     75%    2.22ms
     90%   22.50ms
     99%  100.96ms
  2947613 requests in 30.08s, 365.44MB read
  Socket errors: connect 0, read 212, write 0, timeout 0
Requests/sec:  98005.58
Transfer/sec:     12.15MB
```

**第四次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.98ms   17.99ms 160.36ms   91.38%
    Req/Sec    10.13k     6.16k   36.19k    68.72%
  Latency Distribution
     50%  785.00us
     75%    2.13ms
     90%   20.43ms
     99%   97.68ms
  2947100 requests in 30.10s, 365.37MB read
  Socket errors: connect 0, read 228, write 0, timeout 0
Requests/sec:  97912.83
Transfer/sec:     12.14MB
```