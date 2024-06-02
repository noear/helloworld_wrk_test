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

    private ClientSession clientSession = SocketD.createClient("sd:tcp://127.0.0.1:18602")
            .config(c -> c.ioThreads(1).codecThreads(1).exchangeThreads(1))
            .open();
}