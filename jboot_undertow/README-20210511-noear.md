**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.53ms   27.21ms 374.96ms   93.27%
    Req/Sec     7.88k     4.01k   45.08k    80.84%
  Latency Distribution
     50%    2.37ms
     75%    2.89ms
     90%   15.05ms
     99%  150.22ms
  2284755 requests in 30.09s, 433.60MB read
  Socket errors: connect 0, read 87, write 0, timeout 0
Requests/sec:  75923.68
Transfer/sec:     14.41MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.47ms  607.73us  37.72ms   90.40%
    Req/Sec     8.10k   538.16    16.35k    81.66%
  Latency Distribution
     50%    2.37ms
     75%    2.57ms
     90%    2.81ms
     99%    4.84ms
  2423683 requests in 30.10s, 459.97MB read
  Socket errors: connect 0, read 58, write 0, timeout 0
Requests/sec:  80517.70
Transfer/sec:     15.28MB
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.53ms    0.91ms  28.92ms   88.62%
    Req/Sec     7.96k   807.51    18.09k    72.83%
  Latency Distribution
     50%    2.32ms
     75%    2.57ms
     90%    3.33ms
     99%    5.93ms
  2379485 requests in 30.05s, 451.58MB read
  Socket errors: connect 0, read 59, write 0, timeout 0
Requests/sec:  79173.04
Transfer/sec:     15.03MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.43ms  545.49us  11.50ms   87.52%
    Req/Sec     8.24k   538.39    17.99k    91.08%
  Latency Distribution
     50%    2.37ms
     75%    2.55ms
     90%    2.78ms
     99%    4.66ms
  2464074 requests in 30.10s, 467.64MB read
  Socket errors: connect 0, read 54, write 0, timeout 0
Requests/sec:  81861.16
Transfer/sec:     15.54MB
```

**第五次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.46ms  503.04us  10.80ms   86.76%
    Req/Sec     8.15k   377.23     9.68k    73.82%
  Latency Distribution
     50%    2.41ms
     75%    2.57ms
     90%    2.79ms
     99%    4.59ms
  2442054 requests in 30.10s, 463.46MB read
  Socket errors: connect 0, read 44, write 0, timeout 0
Requests/sec:  81126.02
Transfer/sec:     15.40MB
```