package webapp;

@RequestMapping("/")
public class HelloworldController extends JbootController {

    public void index(){
        renderText("hello world");
    }

    public static void main(String[] args){
        JbootApplication.run(args);
    }
}