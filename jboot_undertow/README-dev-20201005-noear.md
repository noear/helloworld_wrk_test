**第一次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     8.72ms   18.94ms 282.25ms   97.69%
    Req/Sec     3.43k   793.02     8.75k    84.26%
  Latency Distribution
     50%    6.47ms
     75%   10.88ms
     90%   15.08ms
     99%  100.41ms
  1018705 requests in 30.07s, 187.50MB read
  Socket errors: connect 0, read 79, write 0, timeout 0
Requests/sec:  33882.93
Transfer/sec:      6.24MB
```

**第二次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     7.49ms   16.56ms 254.55ms   98.33%
    Req/Sec     3.86k   579.80     8.23k    86.60%
  Latency Distribution
     50%    5.77ms
     75%    9.65ms
     90%   13.48ms
     99%   76.44ms
  1145664 requests in 30.06s, 210.87MB read
  Socket errors: connect 0, read 60, write 0, timeout 0
Requests/sec:  38110.06
Transfer/sec:      7.01MB
```

**第三次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.91ms   13.09ms 249.39ms   97.76%
    Req/Sec     3.88k   539.38     7.40k    86.56%
  Latency Distribution
     50%    5.72ms
     75%    9.58ms
     90%   13.33ms
     99%   37.79ms
  1156157 requests in 30.05s, 212.80MB read
  Socket errors: connect 0, read 79, write 0, timeout 0
Requests/sec:  38474.14
Transfer/sec:      7.08MB
```

**第四次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.94ms   13.17ms 249.74ms   97.63%
    Req/Sec     3.89k   525.82     6.71k    84.56%
  Latency Distribution
     50%    5.74ms
     75%    9.62ms
     90%   13.43ms
     99%   36.66ms
  1157728 requests in 30.07s, 213.09MB read
  Socket errors: connect 0, read 60, write 0, timeout 0
Requests/sec:  38495.14
Transfer/sec:      7.09MB

```