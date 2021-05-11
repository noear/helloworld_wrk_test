**第一次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    20.46ms   36.35ms 553.53ms   88.15%
    Req/Sec     3.69k     1.28k   10.34k    73.70%
  Latency Distribution
     50%    3.61ms
     75%   23.74ms
     90%   64.81ms
     99%  173.13ms
  1098292 requests in 30.09s, 134.07MB read
  Socket errors: connect 0, read 211, write 0, timeout 0
Requests/sec:  36495.70
Transfer/sec:      4.46MB
```

**第二次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    19.36ms   34.40ms 482.28ms   88.02%
    Req/Sec     3.82k     1.26k   11.21k    72.12%
  Latency Distribution
     50%    3.21ms
     75%   22.84ms
     90%   61.78ms
     99%  161.23ms
  1141835 requests in 30.08s, 139.38MB read
  Socket errors: connect 0, read 214, write 0, timeout 0
Requests/sec:  37953.75
Transfer/sec:      4.63MB
```

**第三次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    19.48ms   35.70ms 504.15ms   88.43%
    Req/Sec     3.86k     1.25k   10.38k    72.41%
  Latency Distribution
     50%    3.29ms
     75%   21.72ms
     90%   62.03ms
     99%  168.76ms
  1154058 requests in 30.08s, 140.88MB read
  Socket errors: connect 0, read 214, write 0, timeout 0
Requests/sec:  38361.68
Transfer/sec:      4.68MB
```

**第四次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    18.83ms   32.95ms 449.77ms   87.82%
    Req/Sec     3.82k     1.22k    9.90k    72.94%
  Latency Distribution
     50%    3.51ms
     75%   22.13ms
     90%   60.30ms
     99%  154.69ms
  1142661 requests in 30.10s, 139.48MB read
  Socket errors: connect 0, read 213, write 0, timeout 0
Requests/sec:  37962.79
Transfer/sec:      4.63MB
```