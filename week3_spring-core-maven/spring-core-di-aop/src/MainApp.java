import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.HelloService;

public class MainApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloService service = context.getBean(HelloService.class);
        System.out.println(service.sayHello("Spring Developer"));
        context.close();
    }
}
