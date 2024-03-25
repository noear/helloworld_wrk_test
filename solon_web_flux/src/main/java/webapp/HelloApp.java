package webapp;

import org.noear.socketd.SocketD;
import org.noear.socketd.transport.client.ClientSession;
import org.noear.socketd.transport.core.Entity;
import org.noear.socketd.transport.core.entity.StringEntity;
import org.noear.solon.Solon;
import org.noear.solon.Utils;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Get;
import org.noear.solon.annotation.Mapping;
import reactor.core.publisher.Mono;

import java.util.concurrent.locks.ReentrantLock;

@Get
@Controller
public class HelloApp {
    public static void main(String[] args) {
        Solon.start(HelloApp.class, args);
    }

    @Mapping("/")
    public Mono<String> hello(String name) {
        return Mono.just("hello world: " + name);
    }

    @Mapping("/hello2")
    public Mono<String> hello2(String name) throws Exception{
        Thread.sleep(10);
        return Mono.just("hello world: " + name);
    }

    @Mapping("/rx")
    public Mono<String> rx(String name) throws Exception {
        clientSessionInit();

        return Mono.create(sink -> {
            try {
                Entity entity = new StringEntity("hello")
                        .metaPut("name", name == null ? "noear" : name);

                clientSession.sendAndRequest("hello", entity).thenReply(reply -> {
                    sink.success(reply.dataAsString());
                }).thenError(e -> {
                    sink.error(e);
                });
            } catch (Throwable e) {
                sink.error(e);
            }
        });
    }

    private ClientSession clientSession;
    private ReentrantLock clientSessionInitLock = new ReentrantLock();

    private void clientSessionInit() throws Exception{
        if (clientSession == null) {
            clientSessionInitLock.lock();
            try {
                if (clientSession == null) {
                    clientSession = SocketD.createClient("sd:tcp://127.0.0.1:18602").open();
                }
            } finally {
                clientSessionInitLock.unlock();
            }
        }
    }
}
