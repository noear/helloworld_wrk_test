**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     4.98ms   13.57ms 250.29ms   95.44%
    Req/Sec     8.37k     2.32k   22.33k    82.36%
  Latency Distribution
     50%    2.36ms
     75%    2.51ms
     90%    4.85ms
     99%   81.34ms
  2500705 requests in 30.10s, 462.66MB read
  Socket errors: connect 0, read 131, write 0, timeout 0
Requests/sec:  83075.89
Transfer/sec:     15.37MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.45ms  216.34us  11.93ms   86.52%
    Req/Sec     8.17k   613.28    21.66k    91.94%
  Latency Distribution
     50%    2.46ms
     75%    2.52ms
     90%    2.61ms
     99%    2.91ms
  2440711 requests in 30.10s, 451.56MB read
  Socket errors: connect 0, read 55, write 0, timeout 0
Requests/sec:  81086.79
Transfer/sec:     15.00MB
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.42ms  171.67us  15.11ms   81.50%
    Req/Sec     8.29k   332.07     9.65k    81.75%
  Latency Distribution
     50%    2.41ms
     75%    2.47ms
     90%    2.57ms
     99%    2.84ms
  2482148 requests in 30.10s, 459.23MB read
  Socket errors: connect 0, read 54, write 0, timeout 0
Requests/sec:  82459.58
Transfer/sec:     15.26MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.37ms  246.79us  31.65ms   89.18%
    Req/Sec     8.45k   436.59    13.67k    81.20%
  Latency Distribution
     50%    2.36ms
     75%    2.43ms
     90%    2.55ms
     99%    2.92ms
  2526180 requests in 30.10s, 467.38MB read
  Socket errors: connect 0, read 56, write 0, timeout 0
Requests/sec:  83923.46
Transfer/sec:     15.53MB
```