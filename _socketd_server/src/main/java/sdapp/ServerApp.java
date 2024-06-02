package sdapp;


public class ServerApp {
    public static void main(String[] args) throws Exception {
        final ServerImpl server = new ServerImpl();

        //启动
        server.start();

        //停止
        Runtime.getRuntime().addShutdownHook(new Thread(server::stop));
    }
}
