**第一次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     7.61ms   16.84ms 524.68ms   98.08%
    Req/Sec     3.28k   529.50     6.17k    87.75%
  Latency Distribution
     50%    5.65ms
     75%    6.74ms
     90%    8.31ms
     99%   74.25ms
  976406 requests in 30.10s, 117.50MB read
  Socket errors: connect 0, read 187, write 0, timeout 0
Requests/sec:  32441.84
Transfer/sec:      3.90MB
```

**第二次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.83ms    1.70ms 117.23ms   74.55%
    Req/Sec     3.36k   273.38     7.10k    74.65%
  Latency Distribution
     50%    5.71ms
     75%    6.62ms
     90%    7.93ms
     99%   10.52ms
  1004852 requests in 30.10s, 120.93MB read
  Socket errors: connect 0, read 92, write 0, timeout 0
Requests/sec:  33382.60
Transfer/sec:      4.02MB
```

**第三次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     7.65ms   10.08ms  99.71ms   96.15%
    Req/Sec     3.22k   605.14    12.21k    87.48%
  Latency Distribution
     50%    5.68ms
     75%    6.89ms
     90%    8.66ms
     99%   68.91ms
  961306 requests in 30.09s, 115.69MB read
  Socket errors: connect 0, read 90, write 0, timeout 0
Requests/sec:  31950.80
Transfer/sec:      3.85MB
```

**第四次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.72ms    6.74ms 111.24ms   97.38%
    Req/Sec     3.30k   475.56     5.72k    85.01%
  Latency Distribution
     50%    5.64ms
     75%    6.69ms
     90%    8.22ms
     99%   48.67ms
  987556 requests in 30.09s, 118.84MB read
  Socket errors: connect 0, read 91, write 0, timeout 0
Requests/sec:  32822.96
Transfer/sec:      3.95MB
```