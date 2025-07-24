import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"model", "repository", "controller"})
public class HateoasApp {
    public static void main(String[] args) {
        SpringApplication.run(HateoasApp.class, args);
    }
}
