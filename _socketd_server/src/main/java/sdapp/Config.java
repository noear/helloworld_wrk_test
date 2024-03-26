package sdapp;

import org.noear.socketd.SocketD;
import org.noear.socketd.transport.core.entity.StringEntity;
import org.noear.socketd.transport.core.listener.EventListener;
import org.noear.socketd.transport.server.Server;
import org.noear.solon.annotation.Component;
import org.noear.solon.core.bean.LifecycleBean;

@Component
public class Config implements LifecycleBean {
    Server server;

    @Override
    public void start() throws Throwable {
        //启动服务端
        server = SocketD.createServer("sd:tcp")
                .config(c -> c.port(18602).exchangeThreads(1).ioThreads(1).codecThreads(1).nolockSend(true))
                .listen(new EventListener()
                        .doOn("hello", (s, m) -> { //收到"/demo"事件的消息时
                            if (m.isRequest() || m.isSubscribe()) {
                                //答复
                                s.replyEnd(m, new StringEntity("And me too."));
                            }
                        }))
                .start();
    }

    @Override
    public void stop() throws Throwable {
        if (server != null) {
            server.stop();
        }
    }
}
