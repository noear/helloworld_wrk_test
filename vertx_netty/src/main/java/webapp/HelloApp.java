package webapp;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class HelloApp extends AbstractVerticle {
    public static void main(String[] args) {
        HelloApp verticle = new HelloApp();
        Vertx vertx = Vertx.vertx();

        vertx.deployVerticle(verticle);
    }

    @Override
    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello world: " + req.getParam("name"));
        }).listen(8080);
    }
}
