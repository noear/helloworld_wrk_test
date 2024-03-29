package webapp;

import io.jboot.app.JbootApplication;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

@RequestMapping("/")
public class HelloApp extends JbootController {

    public void index(String name){
        renderText("hello world: " +name);
    }

    public void hello2(String name) throws Exception{
        Thread.sleep(10);
        renderText("Hello World: " + name);
    }

    public static void main(String[] args){
        System.setProperty("jboot.app.mode", "pro");
        JbootApplication.run(args);
    }
}