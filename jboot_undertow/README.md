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
    Latency     2.56ms  663.70us  20.08ms   88.31%
    Req/Sec     7.85k   378.29     9.98k    74.14%
  Latency Distribution
     50%    2.43ms
     75%    2.65ms
     90%    2.96ms
     99%    5.10ms
  2349023 requests in 30.10s, 445.80MB read
  Socket errors: connect 0, read 34, write 0, timeout 0
Requests/sec:  78034.45
Transfer/sec:     14.81MB
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.60ms  665.08us  13.38ms   86.17%
    Req/Sec     7.73k   541.49    13.34k    81.60%
  Latency Distribution
     50%    2.46ms
     75%    2.74ms
     90%    3.16ms
     99%    5.25ms
  2309800 requests in 30.10s, 438.36MB read
  Socket errors: connect 0, read 55, write 0, timeout 0
Requests/sec:  76735.67
Transfer/sec:     14.56MB
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