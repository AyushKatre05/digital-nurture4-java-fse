import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller", "model", "repository", "dto"})
public class BookDtoApp {
    public static void main(String[] args) {
        SpringApplication.run(BookDtoApp.class, args);
    }
}
