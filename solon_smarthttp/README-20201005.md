**第一次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.99ms    6.98ms 285.66ms   99.61%
    Req/Sec    12.00k     1.62k   16.84k    89.16%
  Latency Distribution
     50%    1.64ms
     75%    1.78ms
     90%    1.89ms
     99%    3.29ms
  3593282 requests in 30.10s, 493.46MB read
  Socket errors: connect 0, read 161, write 0, timeout 0
Requests/sec: 119375.43
Transfer/sec:     16.39MB
```

**第二次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.60ms  273.37us  27.38ms   87.93%
    Req/Sec    12.49k     1.03k   15.93k    62.86%
  Latency Distribution
     50%    1.59ms
     75%    1.74ms
     90%    1.83ms
     99%    2.04ms
  3740370 requests in 30.10s, 513.66MB read
  Socket errors: connect 0, read 110, write 0, timeout 0
Requests/sec: 124261.05
Transfer/sec:     17.06MB
```

**第三次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.62ms  231.76us  15.22ms   78.50%
    Req/Sec    12.35k     1.09k   16.17k    69.47%
  Latency Distribution
     50%    1.61ms
     75%    1.76ms
     90%    1.86ms
     99%    2.06ms
  3699238 requests in 30.10s, 508.01MB read
  Socket errors: connect 0, read 83, write 0, timeout 0
Requests/sec: 122895.14
Transfer/sec:     16.88MB
```

**第四次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.55ms  223.66us  10.09ms   73.28%
    Req/Sec    12.89k     1.26k   16.64k    63.09%
  Latency Distribution
     50%    1.55ms
     75%    1.71ms
     90%    1.79ms
     99%    1.99ms
  3861585 requests in 30.10s, 530.31MB read
  Socket errors: connect 0, read 80, write 0, timeout 0
Requests/sec: 128285.19
Transfer/sec:     17.62MB
```