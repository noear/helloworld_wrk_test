package sdapp;

import org.noear.solon.Solon;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Solon.start(ServerApp.class, args);
    }
}
