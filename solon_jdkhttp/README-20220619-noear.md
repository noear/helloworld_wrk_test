**第一次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.60ms  616.82us  18.38ms   70.89%
    Req/Sec     6.24k     0.85k    9.34k    73.24%
  Latency Distribution
     50%    1.53ms
     75%    1.95ms
     90%    2.38ms
     99%    3.32ms
  626679 requests in 10.10s, 91.44MB read
  Socket errors: connect 0, read 43, write 0, timeout 0
Requests/sec:  62045.21
Transfer/sec:      9.05MB
```

**第二次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.53ms  566.25us  14.19ms   69.97%
    Req/Sec     6.49k   678.45     8.55k    76.04%
  Latency Distribution
     50%    1.48ms
     75%    1.87ms
     90%    2.26ms
     99%    3.03ms
  651950 requests in 10.10s, 95.13MB read
Requests/sec:  64545.61
Transfer/sec:      9.42MB
```

**第三次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.58ms    1.11ms  45.26ms   96.71%
    Req/Sec     6.49k   659.65     8.32k    77.72%
  Latency Distribution
     50%    1.48ms
     75%    1.87ms
     90%    2.25ms
     99%    3.20ms
  651914 requests in 10.10s, 95.12MB read
  Socket errors: connect 0, read 41, write 0, timeout 0
Requests/sec:  64537.64
Transfer/sec:      9.42MB
```

**第四次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.53ms  817.05us  46.80ms   88.11%
    Req/Sec     6.55k   748.25     8.67k    71.68%
  Latency Distribution
     50%    1.46ms
     75%    1.86ms
     90%    2.26ms
     99%    3.02ms
  658194 requests in 10.10s, 96.04MB read
  Socket errors: connect 0, read 48, write 0, timeout 0
Requests/sec:  65153.40
Transfer/sec:      9.51MB
```

**第五次**

```
wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
  10 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.50ms  552.52us   8.93ms   68.81%
    Req/Sec     6.63k     0.89k   12.91k    69.45%
  Latency Distribution
     50%    1.43ms
     75%    1.84ms
     90%    2.24ms
     99%    2.97ms
  663452 requests in 10.10s, 96.81MB read
  Socket errors: connect 0, read 26, write 0, timeout 0
Requests/sec:  65688.38
Transfer/sec:      9.58MB
```