package webapp;

import org.noear.socketd.SocketD;
import org.noear.socketd.transport.client.ClientSession;
import org.noear.socketd.transport.core.Entity;
import org.noear.socketd.transport.core.entity.StringEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.concurrent.locks.ReentrantLock;

@RestController
@SpringBootApplication
public class HelloApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloApp.class, args);
    }

    @RequestMapping("/")
    public Mono<String> hello(String name) {
        return Mono.just("hello world: " + name);
    }

    @RequestMapping("/hello2")
    public Mono<String> hello2(String name) throws Exception{
        Thread.sleep(10);
        return Mono.just("hello world: " + name);
    }

    @RequestMapping("/rx")
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