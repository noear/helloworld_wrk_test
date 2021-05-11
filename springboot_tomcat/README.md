**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.43ms   16.57ms 387.72ms   95.19%
    Req/Sec     2.97k   653.39     5.01k    84.43%
  Latency Distribution
     50%    5.94ms
     75%    7.75ms
     90%   11.09ms
     99%   92.22ms
  883814 requests in 30.10s, 110.57MB read
  Socket errors: connect 0, read 161, write 0, timeout 0
Requests/sec:  29366.67
Transfer/sec:      3.67MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.20ms   16.21ms 245.84ms   95.92%
    Req/Sec     2.95k   538.55    10.34k    88.93%
  Latency Distribution
     50%    6.17ms
     75%    7.51ms
     90%    9.62ms
     99%   82.90ms
  876829 requests in 30.09s, 109.70MB read
  Socket errors: connect 0, read 86, write 0, timeout 0
Requests/sec:  29135.47
Transfer/sec:      3.65MB
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    10.28ms   24.79ms 368.32ms   95.86%
    Req/Sec     3.04k   591.71    11.66k    88.24%
  Latency Distribution
     50%    5.96ms
     75%    7.32ms
     90%    9.45ms
     99%  103.99ms
  900419 requests in 30.09s, 112.65MB read
  Socket errors: connect 0, read 88, write 0, timeout 0
Requests/sec:  29922.38
Transfer/sec:      3.74MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    10.22ms   21.77ms 327.74ms   94.93%
    Req/Sec     3.03k   636.65     7.79k    85.48%
  Latency Distribution
     50%    5.89ms
     75%    7.32ms
     90%    9.78ms
     99%   91.13ms
  897318 requests in 30.09s, 112.26MB read
  Socket errors: connect 0, read 85, write 0, timeout 0
Requests/sec:  29817.90
Transfer/sec:      3.73MB
```

**第五次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    17.60ms   70.74ms 799.76ms   97.46%
    Req/Sec     3.08k   600.74     6.81k    88.32%
  Latency Distribution
     50%    5.86ms
     75%    7.25ms
     90%    9.70ms
     99%  464.20ms
  899182 requests in 30.09s, 112.50MB read
  Socket errors: connect 0, read 86, write 0, timeout 0
Requests/sec:  29886.02
Transfer/sec:      3.74MB

```