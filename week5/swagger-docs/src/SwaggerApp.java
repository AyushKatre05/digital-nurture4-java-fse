import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller", "model", "repository"})
public class SwaggerApp {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerApp.class, args);
    }
}
