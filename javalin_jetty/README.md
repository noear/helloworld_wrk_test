**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    20.01ms   44.42ms 575.20ms   88.58%
    Req/Sec     7.24k     5.85k   36.19k    79.87%
  Latency Distribution
     50%    1.01ms
     75%   13.00ms
     90%   73.59ms
     99%  215.04ms
  2034482 requests in 30.09s, 263.87MB read
  Socket errors: connect 0, read 247, write 0, timeout 0
Requests/sec:  67607.91
Transfer/sec:      8.77MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.70ms   24.00ms 374.84ms   90.31%
    Req/Sec     8.63k     5.47k   28.40k    69.35%
  Latency Distribution
     50%    0.85ms
     75%    2.81ms
     90%   32.40ms
     99%  113.93ms
  2472032 requests in 30.10s, 320.62MB read
  Socket errors: connect 0, read 215, write 0, timeout 0
Requests/sec:  82137.05
Transfer/sec:     10.65MB
```

**第三次**

```
 wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.28ms   23.07ms 249.99ms   90.25%
    Req/Sec     8.58k     5.62k   58.66k    73.24%
  Latency Distribution
     50%  768.00us
     75%    2.20ms
     90%   31.15ms
     99%  113.30ms
  2454637 requests in 30.07s, 318.37MB read
  Socket errors: connect 0, read 247, write 0, timeout 0
Requests/sec:  81625.42
Transfer/sec:     10.59MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.10ms   22.83ms 177.55ms   90.37%
    Req/Sec     8.94k     5.75k   29.50k    71.77%
  Latency Distribution
     50%  738.00us
     75%    2.08ms
     90%   30.19ms
     99%  113.25ms
  2558621 requests in 30.09s, 331.85MB read
  Socket errors: connect 0, read 262, write 0, timeout 0
Requests/sec:  85026.91
Transfer/sec:     11.03MB
```


**第五次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     9.34ms   23.19ms 168.56ms   90.25%
    Req/Sec     8.35k     5.34k   30.09k    72.17%
  Latency Distribution
     50%  809.00us
     75%    2.20ms
     90%   31.42ms
     99%  113.73ms
  2386192 requests in 30.10s, 309.49MB read
  Socket errors: connect 0, read 252, write 0, timeout 0
Requests/sec:  79286.65
Transfer/sec:     10.28MB

```