**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    11.91ms   27.70ms 659.10ms   91.36%
    Req/Sec     4.97k     2.41k   22.71k    65.92%
  Latency Distribution
     50%    2.88ms
     75%    6.06ms
     90%   30.38ms
     99%  121.68ms
  1411630 requests in 30.09s, 262.52MB read
  Socket errors: connect 0, read 680, write 8, timeout 0
Requests/sec:  46908.05
Transfer/sec:      8.72MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    10.60ms   21.94ms 250.65ms   91.90%
    Req/Sec     4.40k     1.98k   23.32k    67.11%
  Latency Distribution
     50%    3.34ms
     75%    6.37ms
     90%   21.38ms
     99%  115.24ms
  1261385 requests in 30.10s, 234.58MB read
  Socket errors: connect 0, read 264, write 0, timeout 0
Requests/sec:  41909.72
Transfer/sec:      7.79MB
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.67ms   19.93ms 253.33ms   93.02%
    Req/Sec     4.22k     2.04k   27.09k    72.21%
  Latency Distribution
     50%    3.45ms
     75%    6.78ms
     90%   17.76ms
     99%  111.04ms
  1221894 requests in 30.06s, 227.23MB read
  Socket errors: connect 0, read 246, write 0, timeout 0
Requests/sec:  40645.68
Transfer/sec:      7.56MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.48ms   18.89ms 174.77ms   92.97%
    Req/Sec     4.16k     1.94k   21.18k    69.77%
  Latency Distribution
     50%    3.51ms
     75%    6.85ms
     90%   17.27ms
     99%  107.60ms
  1207071 requests in 30.09s, 224.47MB read
  Socket errors: connect 0, read 242, write 0, timeout 0
Requests/sec:  40110.49
Transfer/sec:      7.46MB
```

**第五次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.83ms   20.58ms 379.65ms   92.97%
    Req/Sec     4.20k     2.07k   39.44k    71.44%
  Latency Distribution
     50%    3.50ms
     75%    6.72ms
     90%   17.85ms
     99%  111.14ms
  1212805 requests in 30.10s, 225.54MB read
  Socket errors: connect 0, read 257, write 0, timeout 0
Requests/sec:  40297.78
Transfer/sec:      7.49MB
```