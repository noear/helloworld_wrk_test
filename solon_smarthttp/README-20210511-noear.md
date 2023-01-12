**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.74ms   15.50ms 475.33ms   99.37%
    Req/Sec    11.92k     2.42k   64.93k    90.87%
  Latency Distribution
     50%    1.65ms
     75%    1.76ms
     90%    2.03ms
     99%    6.09ms
  3559370 requests in 30.10s, 505.78MB read
  Socket errors: connect 0, read 192, write 1, timeout 0
Requests/sec: 118238.91
Transfer/sec:     16.80MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.56ms  322.82us  19.17ms   84.19%
    Req/Sec    12.75k     0.98k   15.14k    69.67%
  Latency Distribution
     50%    1.61ms
     75%    1.70ms
     90%    1.80ms
     99%    2.26ms
  3806625 requests in 30.00s, 540.91MB read
  Socket errors: connect 0, read 76, write 0, timeout 0
Requests/sec: 126875.75
Transfer/sec:     18.03MB

```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.58ms  318.09us  19.55ms   84.17%
    Req/Sec    12.60k     0.95k   15.05k    69.80%
  Latency Distribution
     50%    1.62ms
     75%    1.72ms
     90%    1.82ms
     99%    2.28ms
  3762266 requests in 30.00s, 534.61MB read
  Socket errors: connect 0, read 77, write 0, timeout 0
Requests/sec: 125390.29
Transfer/sec:     17.82MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.57ms  305.31us  15.86ms   82.65%
    Req/Sec    12.71k     0.96k   15.62k    68.58%
  Latency Distribution
     50%    1.62ms
     75%    1.71ms
     90%    1.81ms
     99%    2.28ms
  3805143 requests in 30.10s, 540.70MB read
  Socket errors: connect 0, read 71, write 0, timeout 0
Requests/sec: 126409.06
Transfer/sec:     17.96MB
```

**第五次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.57ms  291.92us  12.71ms   81.63%
    Req/Sec    12.67k     1.03k   22.14k    74.78%
  Latency Distribution
     50%    1.62ms
     75%    1.71ms
     90%    1.81ms
     99%    2.28ms
  3789160 requests in 30.10s, 538.43MB read
  Socket errors: connect 0, read 57, write 0, timeout 0
Requests/sec: 125877.08
Transfer/sec:     17.89MB

```