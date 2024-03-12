package webapp;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import org.noear.socketd.SocketD;
import org.noear.socketd.transport.client.ClientSession;
import org.noear.socketd.transport.core.entity.StringEntity;

import java.util.concurrent.locks.ReentrantLock;

public class HelloApp extends AbstractVerticle {
    public static void main(String[] args) {
        HelloApp verticle = new HelloApp();
        Vertx vertx = Vertx.vertx();

        vertx.deployVerticle(verticle);
    }

    @Override
    public void start() {

        Router router = Router.router(vertx);

        router.get("/").handler(req -> {
            req.response().putHeader("content-type", "text/plain")
                    .end("Hello world: " + req.request().getParam("name"));
        });

        router.get("/hello2").handler(req -> {
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }

            req.response().putHeader("content-type", "text/plain")
                    .end("Hello world: " + req.request().getParam("name"));
        });

        router.get("/rx").handler(req -> {
            try {
                clientSessionInit();
                clientSession.sendAndRequest("hello", new StringEntity("hello").metaPut("name", "noear"))
                        .thenReply(r -> {
                            req.response().putHeader("content-type", "text/plain")
                                    .end(r.dataAsString());
                        }).thenError(err -> {
                            req.response().setStatusCode(500);
                            req.response().setStatusMessage(err.getLocalizedMessage());
                        });
            } catch (Exception e) {
                req.response().setStatusCode(500);
                req.response().setStatusMessage(e.getLocalizedMessage());
            }
        });

        vertx.createHttpServer().requestHandler(router::handle).listen(8080);
    }

    private ClientSession clientSession;
    private ReentrantLock clientSessionInitLock = new ReentrantLock();

    private void clientSessionInit() throws Exception {
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
