**第一次**

```
$ wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   625.18us  740.43us  42.47ms   97.45%
    Req/Sec    16.70k     0.87k   20.32k    77.43%
  Latency Distribution
     50%  550.00us
     75%  621.00us
     90%  804.00us
     99%    2.35ms
  1678214 requests in 10.10s, 270.48MB read
Requests/sec: 166147.43
Transfer/sec:     26.78MB
```

**第二次**

```
$ wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   603.87us  473.84us  25.73ms   97.90%
    Req/Sec    16.71k     1.04k   28.30k    94.93%
  Latency Distribution
     50%  567.00us
     75%  615.00us
     90%  715.00us
     99%    1.48ms
  1673059 requests in 10.10s, 269.65MB read
Requests/sec: 165658.87
Transfer/sec:     26.70MB
```

**第三次**

```
$ wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   729.13us    1.56ms  49.85ms   97.92%
    Req/Sec    16.76k     1.19k   21.19k    78.60%
  Latency Distribution
     50%  546.00us
     75%  618.00us
     90%  819.00us
     99%    5.74ms
  1668947 requests in 10.01s, 268.99MB read
Requests/sec: 166736.07
Transfer/sec:     26.87MB
```

**第四次**

```
$ wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   585.03us  474.12us  28.10ms   97.50%
    Req/Sec    17.24k   812.73    19.64k    79.21%
  Latency Distribution
     50%  545.00us
     75%  602.00us
     90%  720.00us
     99%    1.71ms
  1732613 requests in 10.10s, 279.25MB read
Requests/sec: 171537.47
Transfer/sec:     27.65MB

```