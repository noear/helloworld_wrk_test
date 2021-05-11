**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.50ms    8.03ms 194.71ms   96.82%
    Req/Sec     8.24k     2.09k   60.23k    85.10%
  Latency Distribution
     50%    2.36ms
     75%    2.58ms
     90%    3.01ms
     99%   38.39ms
  2461459 requests in 30.10s, 467.14MB read
  Socket errors: connect 0, read 83, write 0, timeout 0
Requests/sec:  81781.90
Transfer/sec:     15.52MB

```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.41ms  249.39us  12.73ms   79.33%
    Req/Sec     8.29k   490.62    14.43k    82.40%
  Latency Distribution
     50%    2.37ms
     75%    2.54ms
     90%    2.69ms
     99%    3.01ms
  2480297 requests in 30.10s, 470.71MB read
Requests/sec:  82397.29
Transfer/sec:     15.64MB
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.40ms  248.21us  16.26ms   77.76%
    Req/Sec     8.33k   465.96    11.70k    77.69%
  Latency Distribution
     50%    2.35ms
     75%    2.53ms
     90%    2.69ms
     99%    3.02ms
  2493335 requests in 30.10s, 473.19MB read
  Socket errors: connect 0, read 68, write 0, timeout 0
Requests/sec:  82834.18
Transfer/sec:     15.72MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.39ms  238.45us  10.38ms   77.56%
    Req/Sec     8.38k   413.71     9.46k    70.92%
  Latency Distribution
     50%    2.34ms
     75%    2.50ms
     90%    2.66ms
     99%    3.01ms
  2510008 requests in 30.10s, 476.35MB read
  Socket errors: connect 0, read 53, write 0, timeout 0
Requests/sec:  83388.56

```

**第五次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.37ms  245.90us   9.50ms   78.84%
    Req/Sec     8.43k   809.63    29.91k    92.81%
  Latency Distribution
     50%    2.33ms
     75%    2.50ms
     90%    2.64ms
     99%    3.00ms
  2519648 requests in 30.10s, 478.18MB read
  Socket errors: connect 0, read 56, write 0, timeout 0
Requests/sec:  83709.93
Transfer/sec:     15.89MB
```