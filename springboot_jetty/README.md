**第一次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    29.35ms   55.77ms 787.98ms   89.03%
    Req/Sec     3.27k     1.48k   10.29k    67.50%
  Latency Distribution
     50%    4.21ms
     75%   32.73ms
     90%   91.38ms
     99%  266.79ms
  974237 requests in 30.10s, 123.57MB read
  Socket errors: connect 0, read 244, write 0, timeout 0
Requests/sec:  32371.28
Transfer/sec:      4.11MB
```

**第二次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    18.65ms   32.62ms 516.48ms   87.90%
    Req/Sec     3.87k     1.22k   13.18k    73.19%
  Latency Distribution
     50%    3.67ms
     75%   21.75ms
     90%   59.32ms
     99%  152.13ms
  1153387 requests in 30.09s, 146.29MB read
  Socket errors: connect 0, read 246, write 2, timeout 0
Requests/sec:  38330.43
Transfer/sec:      4.86MB

```

**第三次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    18.69ms   32.95ms 389.53ms   88.17%
    Req/Sec     3.87k     1.19k   12.06k    73.21%
  Latency Distribution
     50%    3.62ms
     75%   21.91ms
     90%   58.55ms
     99%  157.79ms
  1155005 requests in 30.09s, 146.50MB read
  Socket errors: connect 0, read 241, write 5, timeout 0
Requests/sec:  38385.84
Transfer/sec:      4.87MB
```

**第四次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    21.30ms   37.34ms 382.88ms   87.75%
    Req/Sec     3.61k     1.18k    9.41k    69.87%
  Latency Distribution
     50%    3.99ms
     75%   24.86ms
     90%   68.70ms
     99%  180.09ms
  1079106 requests in 30.09s, 136.87MB read
  Socket errors: connect 0, read 220, write 0, timeout 0
Requests/sec:  35859.95
Transfer/sec:      4.55MB
```

**第五次**

```
wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    19.60ms   35.24ms 405.40ms   88.45%
    Req/Sec     3.83k     1.21k   12.69k    71.22%
  Latency Distribution
     50%    3.69ms
     75%   22.23ms
     90%   61.39ms
     99%  172.81ms
  1144296 requests in 30.08s, 145.14MB read
  Socket errors: connect 0, read 239, write 0, timeout 0
Requests/sec:  38038.35
Transfer/sec:      4.82MB
noear@Noears-MBP ~ % wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/?name=test"
Running 30s test @ http://127.0.0.1:8080/?name=test
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    19.11ms   33.83ms 500.44ms   88.13%
    Req/Sec     3.89k     1.22k   13.18k    72.82%
  Latency Distribution
     50%    3.63ms
     75%   21.83ms
     90%   60.62ms
     99%  161.05ms
  1160203 requests in 30.09s, 147.16MB read
  Socket errors: connect 0, read 230, write 0, timeout 0
Requests/sec:  38551.42
Transfer/sec:      4.89MB
```