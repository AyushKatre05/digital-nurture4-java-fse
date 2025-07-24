import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "controller")
public class ActuatorSecurityApp {
    public static void main(String[] args) {
        SpringApplication.run(ActuatorSecurityApp.class, args);
    }
}
