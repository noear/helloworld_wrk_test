**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    19.23ms   40.16ms 495.02ms   88.20%
    Req/Sec     8.33k     6.79k   41.47k    79.51%
  Latency Distribution
     50%    1.20ms
     75%   15.43ms
     90%   69.95ms
     99%  193.67ms
  2378248 requests in 30.08s, 376.50MB read
  Socket errors: connect 0, read 434, write 0, timeout 0
Requests/sec:  79069.79
Transfer/sec:     12.52MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    11.20ms   27.28ms 353.99ms   89.79%
    Req/Sec    11.83k     7.24k   40.39k    72.92%
  Latency Distribution
     50%    0.94ms
     75%    3.89ms
     90%   39.71ms
     99%  120.76ms
  3381893 requests in 30.08s, 535.39MB read
  Socket errors: connect 0, read 233, write 0, timeout 0
Requests/sec: 112444.11
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.87ms   24.36ms 250.85ms   90.23%
    Req/Sec    13.22k     7.69k   48.39k    71.97%
  Latency Distribution
     50%    0.87ms
     75%    3.18ms
     90%   32.81ms
     99%  115.72ms
  3801944 requests in 30.08s, 601.89MB read
  Socket errors: connect 0, read 250, write 0, timeout 0
Requests/sec: 126412.75
Transfer/sec:     20.01MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.56ms   23.45ms 202.34ms   90.25%
    Req/Sec    13.05k     7.72k   40.83k    70.08%
  Latency Distribution
     50%    0.88ms
     75%    3.20ms
     90%   31.49ms
     99%  114.22ms
  3742602 requests in 30.08s, 592.49MB read
  Socket errors: connect 0, read 256, write 0, timeout 0
Requests/sec: 124432.55
Transfer/sec:     19.70MB
```

**第五次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    10.83ms   25.40ms 254.04ms   89.13%
    Req/Sec    12.98k     8.05k   42.91k    71.85%
  Latency Distribution
     50%  838.00us
     75%    3.47ms
     90%   41.29ms
     99%  116.43ms
  3703846 requests in 30.09s, 586.36MB read
  Socket errors: connect 0, read 256, write 0, timeout 0
Requests/sec: 123108.81
Transfer/sec:     19.49MB
```