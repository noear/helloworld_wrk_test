wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
10 threads and 100 connections
Thread Stats   Avg      Stdev     Max   +/- Stdev
Latency     1.59ms    4.16ms 118.81ms   96.96%
Req/Sec    10.38k     2.10k   35.53k    76.87%
Latency Distribution
50%  787.00us
75%    1.35ms
90%    2.58ms
99%   19.91ms
1036105 requests in 10.10s, 132.41MB read
Requests/sec: 102570.61



---


wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
10 threads and 100 connections
Thread Stats   Avg      Stdev     Max   +/- Stdev
Latency     1.61ms    4.12ms 106.90ms   96.59%
Req/Sec    10.53k     2.51k   48.05k    81.54%
Latency Distribution
50%  766.00us
75%    1.36ms
90%    2.72ms
99%   19.62ms
1050502 requests in 10.10s, 134.25MB read
Requests/sec: 104001.79
Transfer/sec:     13.29MB


---

wrk -t10 -c100 -d10s --latency "http://localhost:8080/?name=noear"
Running 10s test @ http://localhost:8080/?name=noear
10 threads and 100 connections
Thread Stats   Avg      Stdev     Max   +/- Stdev
Latency     1.83ms    4.45ms 126.28ms   95.26%
Req/Sec    10.57k     2.81k   57.84k    77.02%
Latency Distribution
50%  736.00us
75%    1.47ms
90%    3.31ms
99%   24.06ms
1054259 requests in 10.10s, 134.73MB read
Requests/sec: 104372.43
Transfer/sec:     13.34MB
