package webapp;

import org.noear.socketd.SocketD;
import org.noear.socketd.transport.client.ClientSession;
import org.noear.socketd.transport.core.Entity;
import org.noear.socketd.transport.core.entity.StringEntity;
import org.smartboot.http.server.HttpBootstrap;
import org.smartboot.http.server.HttpRequest;
import org.smartboot.http.server.HttpResponse;
import org.smartboot.http.server.HttpServerHandler;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;


public class HelloApp {
    public static void main(String[] args) {
        HttpBootstrap bootstrap = new HttpBootstrap();
        bootstrap.configuration()
                .threadNum(Runtime.getRuntime().availableProcessors())
                .debug(false);

        bootstrap.httpHandler(new HttpServerHandler() {
            @Override
            public void handle(HttpRequest request, HttpResponse response, CompletableFuture<Object> completableFuture) throws IOException {
                String name = request.getParameter("name");
                String path = request.getRequestURI();

                if ("/ax".equals(path)) {
                    ax(name, response, completableFuture);
                } else if ("/rx".equals(path)) {
                    rx(name, response, completableFuture);
                } else {
                    completableFuture.complete(null);
                }
            }
        }).setPort(8080).start();
    }


    public static void ax(String name, HttpResponse response, CompletableFuture<Object> completableFuture) throws IOException {
        try {
            Entity entity = new StringEntity("hello")
                    .metaPut("name", name == null ? "noear" : name);

            String rst = clientSession.sendAndRequest("hello", entity).await().dataAsString();
            response.write(rst.getBytes());
        } finally {
            completableFuture.complete(null);
        }
    }

    public static void rx(String name, HttpResponse response, CompletableFuture<Object> completableFuture) throws IOException {
        try {
            Entity entity = new StringEntity("hello")
                    .metaPut("name", name == null ? "noear" : name);

            clientSession.sendAndRequest("hello", entity).thenReply(reply -> {
                response.write(reply.dataAsBytes());
                completableFuture.complete(null);
            }).thenError(e -> {
                completableFuture.complete(null);
            });
        } catch (Throwable e) {
            completableFuture.complete(null);
        }
    }

    private static ClientSession clientSession = SocketD.createClient("sd:tcp://127.0.0.1:18602")
            .config(c -> c.ioThreads(1).codecThreads(1).exchangeThreads(1))
            .open();
}
