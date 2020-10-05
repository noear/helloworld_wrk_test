**第一次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    52.66ms   85.10ms 914.13ms   85.13%
    Req/Sec     4.42k     3.36k   28.26k    74.47%
  Latency Distribution
     50%    1.96ms
     75%   82.15ms
     90%  174.35ms
     99%  360.25ms
  1252193 requests in 30.07s, 181.52MB read
  Socket errors: connect 0, read 144, write 0, timeout 0
Requests/sec:  41649.47
Transfer/sec:      6.04MB
```

**第二次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    53.00ms   85.97ms 978.79ms   85.26%
    Req/Sec     4.70k     3.43k   28.47k    74.69%
  Latency Distribution
     50%    1.77ms
     75%   82.04ms
     90%  175.54ms
     99%  364.78ms
  1335652 requests in 30.09s, 193.61MB read
  Socket errors: connect 0, read 81, write 0, timeout 0
Requests/sec:  44387.99
Transfer/sec:      6.43MB
```

**第三次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    51.76ms   83.68ms 871.02ms   85.09%
    Req/Sec     4.70k     3.45k   32.63k    74.02%
  Latency Distribution
     50%    1.91ms
     75%   80.29ms
     90%  171.79ms
     99%  354.51ms
  1335409 requests in 30.07s, 193.58MB read
  Socket errors: connect 0, read 65, write 0, timeout 0
Requests/sec:  44406.18
Transfer/sec:      6.44MB
```

**第四次**

```
$ wrk -t10 -c200 -d30s --latency "http://127.0.0.1:8080/"
Running 30s test @ http://127.0.0.1:8080/
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    52.55ms   84.35ms 862.15ms   84.89%
    Req/Sec     4.74k     3.47k   28.84k    74.50%
  Latency Distribution
     50%    1.81ms
     75%   82.68ms
     90%  174.62ms
     99%  351.32ms
  1337797 requests in 30.10s, 193.93MB read
  Socket errors: connect 0, read 55, write 0, timeout 0
Requests/sec:  44447.64
Transfer/sec:      6.44MB
```