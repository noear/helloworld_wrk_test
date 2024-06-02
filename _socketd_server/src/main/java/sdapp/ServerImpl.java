package sdapp;


import org.noear.socketd.SocketD;
import org.noear.socketd.transport.core.entity.StringEntity;
import org.noear.socketd.transport.core.listener.EventListener;
import org.noear.socketd.transport.server.Server;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServerImpl {
    private final List<Server> servers = new ArrayList<>();

    public void start() throws IOException {
        EventListener eventListener = new EventListener()
                .doOn("hello", (s, m) -> { //收到"/demo"事件的消息时
                    if (m.isRequest() || m.isSubscribe()) {
                        //答复
                        s.replyEnd(m, new StringEntity("And me too."));
                    }
                });

        //启动服务端
        servers.add(SocketD.createServer("sd:tcp")
                .config(c -> c.port(18602).exchangeThreads(1).ioThreads(1).codecThreads(1).nolockSend(true))
                .listen(eventListener)
                .start());

        servers.add(SocketD.createServer("sd:ws")
                .config(c -> c.port(18603).exchangeThreads(1).ioThreads(1).codecThreads(1).nolockSend(true))
                .listen(eventListener)
                .start());
    }

    public void stop() {
        for (Server server : servers) {
            server.stop();
        }
    }
}
