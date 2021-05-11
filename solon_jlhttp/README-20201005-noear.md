**第一次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    24.20ms   56.21ms   1.40s    89.74%
    Req/Sec     4.76k     4.80k   40.50k    89.73%
  Latency Distribution
     50%    2.66ms
     75%   14.31ms
     90%   82.35ms
     99%  256.81ms
  1311698 requests in 30.15s, 236.43MB read
  Socket errors: connect 0, read 289, write 0, timeout 0
Requests/sec:  43505.01
Transfer/sec:      7.84MB
```

**第二次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    29.14ms   63.45ms 751.03ms   88.83%
    Req/Sec     5.51k     6.26k   62.09k    88.75%
  Latency Distribution
     50%    2.31ms
     75%   18.88ms
     90%  102.30ms
     99%  311.23ms
  1441277 requests in 30.09s, 259.78MB read
  Socket errors: connect 0, read 211, write 0, timeout 0
Requests/sec:  47904.51
Transfer/sec:      8.63MB
```

**第三次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    31.36ms   65.61ms 625.70ms   88.19%
    Req/Sec     5.61k     6.43k   64.12k    88.64%
  Latency Distribution
     50%    2.25ms
     75%   22.57ms
     90%  111.97ms
     99%  309.97ms
  1448831 requests in 30.06s, 261.14MB read
  Socket errors: connect 0, read 221, write 0, timeout 0
Requests/sec:  48201.61
Transfer/sec:      8.69MB

```

**第四次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    31.60ms   65.33ms 635.91ms   88.14%
    Req/Sec     5.47k     6.18k   55.04k    89.18%
  Latency Distribution
     50%    2.30ms
     75%   24.76ms
     90%  111.67ms
     99%  308.54ms
  1410597 requests in 30.10s, 254.25MB read
  Socket errors: connect 0, read 214, write 0, timeout 0
Requests/sec:  46867.66
Transfer/sec:      8.45MB
```