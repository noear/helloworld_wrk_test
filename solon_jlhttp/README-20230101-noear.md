**第一次**

```
$ wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     4.20ms   14.82ms 125.82ms   94.51%
    Req/Sec    13.23k     5.40k   34.88k    63.44%
  Latency Distribution
     50%  431.00us
     75%    0.89ms
     90%    4.80ms
     99%   89.76ms
  1290369 requests in 10.10s, 216.58MB read
  Socket errors: connect 0, read 40, write 0, timeout 0
Requests/sec: 127822.19
Transfer/sec:     21.45MB
```

**第二次**

```
$ wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     4.69ms   15.51ms 125.89ms   93.18%
    Req/Sec    13.50k     5.10k   29.49k    61.74%
  Latency Distribution
     50%  427.00us
     75%    0.91ms
     90%    5.49ms
     99%   89.12ms
  1313562 requests in 10.07s, 220.48MB read
  Socket errors: connect 0, read 41, write 0, timeout 0
Requests/sec: 130382.40
Transfer/sec:     21.88MB
```

**第三次**

```
$ wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     4.95ms   15.29ms 125.84ms   92.17%
    Req/Sec    14.20k     5.72k   34.10k    64.61%
  Latency Distribution
     50%  415.00us
     75%    0.89ms
     90%   10.89ms
     99%   83.42ms
  1382475 requests in 10.10s, 232.04MB read
  Socket errors: connect 0, read 24, write 0, timeout 0
Requests/sec: 136846.55
Transfer/sec:     22.97MB
```

**第四次**

```
$ wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.42ms   16.59ms 125.75ms   92.14%
    Req/Sec    13.87k     5.55k   45.42k    61.55%
  Latency Distribution
     50%  418.00us
     75%    0.88ms
     90%   11.94ms
     99%   89.85ms
  1348108 requests in 10.10s, 226.28MB read
  Socket errors: connect 0, read 37, write 0, timeout 0
Requests/sec: 133425.46
Transfer/sec:     22.40MB
```