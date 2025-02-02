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

import java.time.Duration;

@Controller
public class HelloApp {
    public static void main(String[] args) {
        Solon.start(HelloApp.class, args);
    }

    @Get
    @Mapping("/")
    public String hello(String name) {
        return "hello world: " + name;
    }

    @Get
    @Mapping("/hello2")
    public String hello2(String name) throws Exception {
        Thread.sleep(10);
        return "hello world: " + name;
    }

    @Get
    @Mapping("/rx")
    public Mono<String> rx(String name) {
        return Mono.just("hello world: " + name);
    }

    @Get
    @Mapping("/rx2")
    public Mono<String> rx2(String name) {
        return Mono.delay(Duration.ofSeconds(10))
                .then(Mono.just("hello world: " + name));
    }

    @Mapping("/sd/ax")
    public String sd_ax(String name) throws Exception {
        Entity entity = new StringEntity("hello")
                .metaPut("name", name == null ? "noear" : name);

        return clientSession().sendAndRequest("hello", entity).await().dataAsString();

    }

    @Mapping("/sd/rx")
    public Mono<String> sd_rx(String name) throws Exception {
        return Mono.create(sink -> {
            try {
                Entity entity = new StringEntity("hello")
                        .metaPut("name", name == null ? "noear" : name);

                clientSession().sendAndRequest("hello", entity).thenReply(reply -> {
                    sink.success(reply.dataAsString());
                }).thenError(e -> {
                    sink.error(e);
                });
            } catch (Throwable e) {
                sink.error(e);
            }
        });
    }

    private ClientSession _clientSession;

    private ClientSession clientSession() {
        if (_clientSession == null) {
            Utils.locker().tryLock();
            try {
                if (_clientSession == null) {
                    _clientSession = SocketD.createClient("sd:tcp://127.0.0.1:18602")
                            .config(c -> c.ioThreads(1).codecThreads(1).exchangeThreads(1))
                            .open();
                }
            } finally {
                Utils.locker().unlock();
            }
        }

        return _clientSession;
    }
}