package webapp;

import com.jfinal.core.Controller;

public class HelloController extends Controller {
    public void index(String name) {
        renderText("Hello World: " + name);
    }
}
