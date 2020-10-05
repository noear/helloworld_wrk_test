**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    16.08ms   34.40ms 501.10ms   88.69%
    Req/Sec     8.74k     5.97k   43.64k    71.99%
  Latency Distribution
     50%    1.11ms
     75%   12.13ms
     90%   57.23ms
     99%  162.80ms
  2525852 requests in 30.08s, 387.82MB read
  Socket errors: connect 0, read 233, write 0, timeout 0
Requests/sec:  83974.71
Transfer/sec:     12.89MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.51ms   16.95ms 218.62ms   91.61%
    Req/Sec    11.12k     6.26k   36.01k    67.09%
  Latency Distribution
     50%  847.00us
     75%    2.06ms
     90%   17.88ms
     99%   91.51ms
  3231488 requests in 30.08s, 496.17MB read
  Socket errors: connect 0, read 208, write 0, timeout 0
Requests/sec: 107414.74
Transfer/sec:     16.49MB
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     4.68ms   12.91ms 128.97ms   93.24%
    Req/Sec    11.07k     5.56k   38.29k    66.97%
  Latency Distribution
     50%    0.91ms
     75%    1.89ms
     90%   10.23ms
     99%   73.42ms
  3258831 requests in 30.09s, 500.37MB read
  Socket errors: connect 0, read 216, write 0, timeout 0
Requests/sec: 108288.79
Transfer/sec:     16.63MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.69ms   15.22ms 134.98ms   92.29%
    Req/Sec    11.14k     5.94k   31.35k    66.65%
  Latency Distribution
     50%    0.87ms
     75%    1.95ms
     90%   14.09ms
     99%   85.51ms
  3262813 requests in 30.10s, 500.98MB read
  Socket errors: connect 0, read 229, write 0, timeout 0
Requests/sec: 108413.06
Transfer/sec:     16.65MB
```