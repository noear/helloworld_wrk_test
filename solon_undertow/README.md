**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    22.40ms   52.95ms 625.46ms   89.35%
    Req/Sec    10.32k     4.50k   38.00k    73.75%
  Latency Distribution
     50%    1.62ms
     75%    8.37ms
     90%   81.00ms
     99%  251.85ms
  3027372 requests in 30.08s, 383.99MB read
  Socket errors: connect 0, read 71, write 6, timeout 0
Requests/sec: 100643.75
Transfer/sec:     12.77MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.60ms  565.80us  32.34ms   93.73%
    Req/Sec    12.32k   662.45    25.77k    82.77%
  Latency Distribution
     50%    1.57ms
     75%    1.68ms
     90%    1.80ms
     99%    2.89ms
  3680051 requests in 30.03s, 466.77MB read
  Socket errors: connect 0, read 54, write 0, timeout 0
Requests/sec: 122532.15
Transfer/sec:     15.54MB
```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.63ms  415.29us  26.62ms   90.95%
    Req/Sec    12.09k   587.86    14.87k    76.37%
  Latency Distribution
     50%    1.61ms
     75%    1.72ms
     90%    1.84ms
     99%    2.79ms
  3609754 requests in 30.01s, 457.86MB read
  Socket errors: connect 0, read 55, write 0, timeout 0
Requests/sec: 120282.07
Transfer/sec:     15.26MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.62ms  329.37us  12.82ms   87.86%
    Req/Sec    12.13k   548.75    15.92k    76.03%
  Latency Distribution
     50%    1.60ms
     75%    1.71ms
     90%    1.83ms
     99%    2.73ms
  3621755 requests in 30.01s, 459.38MB read
  Socket errors: connect 0, read 55, write 0, timeout 0
Requests/sec: 120679.23
Transfer/sec:     15.31MB
```

**第五次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.60ms  346.40us  12.32ms   88.60%
    Req/Sec    12.21k   642.13    14.62k    76.97%
  Latency Distribution
     50%    1.59ms
     75%    1.70ms
     90%    1.83ms
     99%    2.75ms
  3644683 requests in 30.02s, 462.29MB read
  Socket errors: connect 0, read 57, write 0, timeout 0
Requests/sec: 121424.59
Transfer/sec:     15.40MB
```