**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    61.79ms   98.24ms 846.90ms   84.74%
    Req/Sec     4.64k     4.09k   40.03k    78.00%
  Latency Distribution
     50%    2.07ms
     75%   96.01ms
     90%  208.73ms
     99%  413.16ms
  1203421 requests in 30.10s, 180.18MB read
  Socket errors: connect 0, read 58, write 0, timeout 0
Requests/sec:  39976.88
Transfer/sec:      5.99MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    61.15ms   96.81ms 876.35ms   84.43%
    Req/Sec     4.82k     4.10k   29.50k    76.63%
  Latency Distribution
     50%    1.83ms
     75%   96.20ms
     90%  207.75ms
     99%  402.57ms
  1264696 requests in 30.06s, 189.36MB read
  Socket errors: connect 0, read 54, write 0, timeout 0
Requests/sec:  42070.07
Transfer/sec:      6.30MB
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    57.46ms   91.42ms 857.30ms   84.72%
    Req/Sec     4.84k     3.99k   32.86k    77.26%
  Latency Distribution
     50%    1.85ms
     75%   89.30ms
     90%  195.34ms
     99%  375.18ms
  1275154 requests in 30.08s, 190.92MB read
  Socket errors: connect 0, read 56, write 0, timeout 0
Requests/sec:  42389.81
Transfer/sec:      6.35MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    59.48ms   94.69ms 875.81ms   84.64%
    Req/Sec     4.82k     3.96k   29.64k    75.83%
  Latency Distribution
     50%    1.94ms
     75%   92.97ms
     90%  201.77ms
     99%  391.35ms
  1270644 requests in 30.05s, 190.25MB read
  Socket errors: connect 0, read 55, write 0, timeout 0
Requests/sec:  42280.14
Transfer/sec:      6.33MB
```

**第五次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    59.15ms   93.96ms 949.53ms   84.57%
    Req/Sec     4.85k     4.08k   33.40k    77.12%
  Latency Distribution
     50%    1.93ms
     75%   92.18ms
     90%  201.81ms
     99%  384.40ms
  1273939 requests in 30.09s, 190.74MB read
  Socket errors: connect 0, read 49, write 0, timeout 0
Requests/sec:  42330.71
Transfer/sec:      6.34MB
```