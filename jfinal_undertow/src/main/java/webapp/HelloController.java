package webapp;

import com.jfinal.core.Controller;

public class HelloController extends Controller {
    public void index(String name) {
        renderText("Hello World: " + name);
    }

    public void hello2(String name) throws Exception{
        Thread.sleep(10);
        renderText("Hello World: " + name);
    }
}
