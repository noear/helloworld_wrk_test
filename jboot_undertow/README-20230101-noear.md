**第一次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    22.15ms   45.47ms 381.14ms   86.78%
    Req/Sec     8.08k     6.62k   33.88k    74.65%
  Latency Distribution
     50%  653.00us
     75%   16.66ms
     90%   87.40ms
     99%  212.57ms
  718634 requests in 10.09s, 137.07MB read
Requests/sec:  71225.99
Transfer/sec:     13.59MB
```

**第二次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.37ms   24.15ms 239.85ms   90.32%
    Req/Sec    11.46k     7.28k   45.56k    70.53%
  Latency Distribution
     50%  377.00us
     75%    2.48ms
     90%   31.58ms
     99%  115.04ms
  1097159 requests in 10.09s, 209.27MB read
Requests/sec: 108753.67
Transfer/sec:     20.74MB
```

**第三次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.57ms   24.34ms 132.75ms   89.72%
    Req/Sec    12.40k     7.07k   38.22k    68.06%
  Latency Distribution
     50%  339.00us
     75%    2.29ms
     90%   35.85ms
     99%  114.22ms
  1186519 requests in 10.08s, 226.31MB read
Requests/sec: 117753.96
Transfer/sec:     22.46MB
```

**第四次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     7.95ms   22.95ms 261.23ms   91.57%
    Req/Sec    12.08k     6.94k   39.64k    73.23%
  Latency Distribution
     50%  415.00us
     75%    1.86ms
     90%   19.57ms
     99%  113.96ms
  1165333 requests in 10.06s, 222.27MB read
Requests/sec: 115811.59
Transfer/sec:     22.09MB
```

**第五次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     7.97ms   22.16ms 132.91ms   91.13%
    Req/Sec    12.19k     7.39k   43.69k    68.56%
  Latency Distribution
     50%  394.00us
     75%    1.95ms
     90%   22.06ms
     99%  111.47ms
  1165137 requests in 10.08s, 222.23MB read
Requests/sec: 115603.77
Transfer/sec:     22.05MB
```