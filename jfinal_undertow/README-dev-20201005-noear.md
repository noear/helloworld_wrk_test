**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     4.29ms    8.02ms 158.87ms   97.34%
    Req/Sec     5.94k     1.16k   12.00k    88.53%
  Latency Distribution
     50%    2.57ms
     75%    4.48ms
     90%    6.47ms
     99%   28.71ms
  1774195 requests in 30.04s, 328.25MB read
  Socket errors: connect 0, read 111, write 9, timeout 0
Requests/sec:  59055.87
Transfer/sec:     10.93MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.03ms   21.36ms 360.79ms   98.97%
    Req/Sec     6.67k   796.33     9.07k    78.66%
  Latency Distribution
     50%    2.35ms
     75%    3.88ms
     90%    5.56ms
     99%   34.67ms
  1979209 requests in 30.03s, 366.18MB read
  Socket errors: connect 0, read 61, write 0, timeout 0
Requests/sec:  65906.94
Transfer/sec:     12.19MB
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.58ms    6.59ms 165.38ms   98.53%
    Req/Sec     6.49k   713.24     9.45k    72.64%
  Latency Distribution
     50%    2.42ms
     75%    3.97ms
     90%    5.66ms
     99%   11.80ms
  1933670 requests in 30.03s, 357.75MB read
  Socket errors: connect 0, read 61, write 0, timeout 0
Requests/sec:  64385.93
Transfer/sec:     11.91MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.18ms   21.55ms 365.25ms   98.97%
    Req/Sec     6.43k   810.79     8.80k    74.81%
  Latency Distribution
     50%    2.45ms
     75%    4.06ms
     90%    5.80ms
     99%   35.74ms
  1906077 requests in 30.05s, 352.65MB read
  Socket errors: connect 0, read 65, write 0, timeout 0
Requests/sec:  63428.23
Transfer/sec:     11.74MB
```