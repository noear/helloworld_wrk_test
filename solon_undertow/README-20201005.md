**第一次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    32.69ms   70.26ms 750.55ms   87.79%
    Req/Sec     9.68k     6.20k   52.19k    73.00%
  Latency Distribution
     50%    1.69ms
     75%   20.77ms
     90%  122.79ms
     99%  326.41ms
  2702827 requests in 30.09s, 420.15MB read
  Socket errors: connect 0, read 155, write 0, timeout 0
Requests/sec:  89832.69
Transfer/sec:     13.96MB
```

**第二次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.01ms    3.98ms 127.52ms   97.06%
    Req/Sec    11.46k     2.33k   32.70k    78.79%
  Latency Distribution
     50%    1.56ms
     75%    1.78ms
     90%    2.33ms
     99%   13.19ms
  3419907 requests in 30.10s, 531.62MB read
  Socket errors: connect 0, read 78, write 0, timeout 0
Requests/sec: 113630.10
Transfer/sec:     17.66MB
```

**第三次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.23ms    5.14ms 125.50ms   96.69%
    Req/Sec    11.53k     2.63k   23.75k    77.64%
  Latency Distribution
     50%    1.55ms
     75%    1.76ms
     90%    2.54ms
     99%   21.30ms
  3439022 requests in 30.10s, 534.59MB read
  Socket errors: connect 0, read 56, write 0, timeout 0
Requests/sec: 114243.34
Transfer/sec:     17.76MB
```

**第四次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.87ms    2.62ms  97.44ms   97.57%
    Req/Sec    11.44k     1.65k   24.74k    79.87%
  Latency Distribution
     50%    1.63ms
     75%    1.77ms
     90%    2.07ms
     99%    9.54ms
  3418134 requests in 30.10s, 531.35MB read
  Socket errors: connect 0, read 58, write 0, timeout 0
Requests/sec: 113564.62
Transfer/sec:     17.65MB

```