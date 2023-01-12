package webapp;

import io.javalin.Javalin;

public class HelloApp {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8080);

        app.get("/", ctx -> {
            ctx.result("Hello World: " + ctx.queryParam("name"));
        });

        app.get("/hello2", ctx -> {
            ctx.result("Hello World: " + ctx.queryParam("name"));
        });
    }
}
