package sdapp;

import org.noear.socketd.SocketD;
import org.noear.socketd.transport.core.entity.StringEntity;
import org.noear.socketd.transport.core.listener.EventListener;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        //启动服务端
        SocketD.createServer("sd:tcp")
                .config(c -> c.port(18602))
                .listen(new EventListener()
                        .doOn("hello", (s, m) -> { //收到"/demo"事件的消息时
                            if (m.isRequest() || m.isSubscribe()) {
                                //答复
                                s.replyEnd(m, new StringEntity("And me too."));
                            }
                        }))
                .start();
    }
}
