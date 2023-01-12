package webapp;

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
}