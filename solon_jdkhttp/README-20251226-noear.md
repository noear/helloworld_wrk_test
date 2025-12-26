

wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
10 threads and 100 connections
Thread Stats   Avg      Stdev     Max   +/- Stdev
Latency     1.34ms    2.32ms  67.62ms   98.80%
Req/Sec     8.31k     1.03k   10.35k    81.49%
Latency Distribution
50%    1.10ms
75%    1.40ms
90%    1.76ms
99%    4.01ms
835291 requests in 10.10s, 121.88MB read
Requests/sec:  82684.64
Transfer/sec:     12.06MB


---

wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
10 threads and 100 connections
Thread Stats   Avg      Stdev     Max   +/- Stdev
Latency     1.15ms  544.45us  13.16ms   85.37%
Req/Sec     8.64k   660.20    13.03k    83.91%
Latency Distribution
50%    1.07ms
75%    1.35ms
90%    1.65ms
99%    3.09ms
865410 requests in 10.10s, 126.27MB read
Requests/sec:  85673.22
Transfer/sec:     12.50MB


---


wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
10 threads and 100 connections
Thread Stats   Avg      Stdev     Max   +/- Stdev
Latency     1.33ms    1.11ms  37.99ms   95.70%
Req/Sec     7.88k     1.05k   10.48k    80.30%
Latency Distribution
50%    1.15ms
75%    1.50ms
90%    1.92ms
99%    4.40ms
791603 requests in 10.10s, 115.50MB read
Requests/sec:  78355.15