package webapp;

import org.noear.solon.Solon;
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
}
