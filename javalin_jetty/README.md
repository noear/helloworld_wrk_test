**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.97ms   24.26ms 251.17ms   89.89%
    Req/Sec     8.79k     5.82k   29.98k    71.87%
  Latency Distribution
     50%  812.00us
     75%    2.72ms
     90%   34.71ms
     99%  115.65ms
  2498810 requests in 30.08s, 324.09MB read
  Socket errors: connect 0, read 258, write 0, timeout 0
Requests/sec:  83082.41
Transfer/sec:     10.78MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.06ms   22.28ms 239.39ms   90.25%
    Req/Sec     9.47k     5.92k   31.37k    71.21%
  Latency Distribution
     50%  797.00us
     75%    2.54ms
     90%   30.28ms
     99%  110.76ms
  2724348 requests in 30.10s, 353.35MB read
  Socket errors: connect 0, read 242, write 0, timeout 0
Requests/sec:  90518.74
Transfer/sec:     11.74MB
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     8.55ms   21.15ms 163.04ms   90.47%
    Req/Sec     9.72k     5.92k   30.82k    69.14%
  Latency Distribution
     50%  784.00us
     75%    2.45ms
     90%   27.76ms
     99%  108.07ms
  2799236 requests in 30.09s, 363.06MB read
  Socket errors: connect 0, read 250, write 0, timeout 0
Requests/sec:  93025.23
Transfer/sec:     12.07MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     8.95ms   21.93ms 250.44ms   90.28%
    Req/Sec     9.59k     6.11k   31.34k    71.46%
  Latency Distribution
     50%  795.00us
     75%    2.55ms
     90%   29.63ms
     99%  109.65ms
  2753507 requests in 30.09s, 357.13MB read
  Socket errors: connect 0, read 240, write 0, timeout 0
Requests/sec:  91509.78
Transfer/sec:     11.87MB
```


**第五次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.21ms   22.59ms 250.72ms   90.18%
    Req/Sec     9.65k     6.14k   31.41k    71.53%
  Latency Distribution
     50%  813.00us
     75%    2.53ms
     90%   30.86ms
     99%  111.25ms
  2767452 requests in 30.10s, 358.94MB read
  Socket errors: connect 0, read 187, write 0, timeout 0
Requests/sec:  91955.21
Transfer/sec:     11.93MB

```