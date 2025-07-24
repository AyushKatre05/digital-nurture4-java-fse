import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repository.CustomerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication(scanBasePackages = {"model", "repository"})
public class CustomerApp implements CommandLineRunner {

    @Autowired
    private CustomerRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(CustomerApp.class, args);
    }

    @Override
    public void run(String... args) {
        repo.save(new Customer("Anuj", "anuj@example.com"));
        repo.save(new Customer("Bhavya", "bhavya@example.com"));
        repo.save(new Customer("Chirag", "chirag@example.com"));
        repo.save(new Customer("Disha", "disha@example.com"));

        System.out.println("📄 Paginated Result (Page 0, Size 2):");
        Page<Customer> page = repo.findAll(PageRequest.of(0, 2));
        page.forEach(c -> System.out.println(c.getName() + " - " + c.getEmail()));
    }
}
