**第一次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     0.93ms    1.86ms  49.57ms   98.65%
    Req/Sec    12.25k     1.93k   42.49k    92.91%
  Latency Distribution
     50%  764.00us
     75%  830.00us
     90%    0.98ms
     99%    4.14ms
  1222119 requests in 10.10s, 233.10MB read
Requests/sec: 120993.95
Transfer/sec:     23.08MB
```

**第二次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.29ms   11.91ms 188.67ms   95.65%
    Req/Sec    11.40k     4.29k   39.44k    74.54%
  Latency Distribution
     50%  679.00us
     75%    1.08ms
     90%    4.18ms
     99%   70.82ms
  1127180 requests in 10.07s, 214.99MB read
Requests/sec: 111915.67
Transfer/sec:     21.35MB
```

**第三次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.05ms    3.26ms 125.92ms   98.27%
    Req/Sec    12.18k     2.35k   35.02k    84.18%
  Latency Distribution
     50%  710.00us
     75%  842.00us
     90%    1.27ms
     99%    6.88ms
  1214259 requests in 10.07s, 231.60MB read
Requests/sec: 120610.92
```

**第四次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   788.70us  694.28us  34.18ms   97.17%
    Req/Sec    12.85k     1.33k   26.00k    87.90%
  Latency Distribution
     50%  709.00us
     75%  785.00us
     90%    0.97ms
     99%    2.47ms
  1279305 requests in 10.01s, 244.01MB read
Requests/sec: 127833.72
Transfer/sec:     24.38MB
```

**第五次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   782.22us  540.44us  15.83ms   94.40%
    Req/Sec    12.71k     2.04k   34.75k    94.32%
  Latency Distribution
     50%  722.00us
     75%  803.00us
     90%    0.99ms
     99%    2.22ms
  1269882 requests in 10.10s, 242.21MB read
Requests/sec: 125725.55
Transfer/sec:     23.98MB
```