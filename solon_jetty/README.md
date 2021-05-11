**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    12.92ms   29.29ms 477.17ms   89.55%
    Req/Sec     9.01k     6.07k   36.21k    70.70%
  Latency Distribution
     50%    1.20ms
     75%    7.03ms
     90%   44.46ms
     99%  129.79ms
  2590157 requests in 30.10s, 410.05MB read
  Socket errors: connect 0, read 341, write 1, timeout 0
Requests/sec:  86061.03
Transfer/sec:     13.62MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.06ms   16.91ms 319.38ms   92.72%
    Req/Sec    11.24k     5.79k   31.02k    67.86%
  Latency Distribution
     50%    0.93ms
     75%    1.97ms
     90%   13.86ms
     99%   92.24ms
  3270724 requests in 30.10s, 517.79MB read
  Socket errors: connect 0, read 239, write 0, timeout 0
Requests/sec: 108675.27
Transfer/sec:     17.20MB
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.85ms   15.94ms 210.90ms   92.53%
    Req/Sec    11.24k     5.74k   31.28k    69.89%
  Latency Distribution
     50%    0.95ms
     75%    1.93ms
     90%   13.45ms
     99%   89.56ms
  3270914 requests in 30.09s, 517.82MB read
  Socket errors: connect 0, read 258, write 0, timeout 0
Requests/sec: 108721.71
Transfer/sec:     17.21MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.05ms   16.12ms 127.41ms   92.15%
    Req/Sec    11.01k     5.53k   32.15k    68.34%
  Latency Distribution
     50%    0.95ms
     75%    1.96ms
     90%   14.81ms
     99%   89.60ms
  3206742 requests in 30.10s, 507.66MB read
  Socket errors: connect 0, read 227, write 0, timeout 0
Requests/sec: 106549.84
Transfer/sec:     16.87MB
```

**第五次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.70ms   17.69ms 129.88ms   92.08%
    Req/Sec    10.45k     5.62k   30.19k    68.26%
  Latency Distribution
     50%    0.92ms
     75%    2.17ms
     90%   16.64ms
     99%   97.36ms
  3038543 requests in 30.10s, 481.03MB read
  Socket errors: connect 0, read 262, write 0, timeout 0
Requests/sec: 100950.96
Transfer/sec:     15.98MB
```