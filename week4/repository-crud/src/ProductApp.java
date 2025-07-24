import model.Product;
import repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"model", "repository"})
public class ProductApp implements CommandLineRunner {

    @Autowired
    private ProductRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(ProductApp.class, args);
    }

    @Override
    public void run(String... args) {
        // CREATE
        Product p1 = new Product("Keyboard", 799.0);
        Product p2 = new Product("Mouse", 499.0);
        repo.save(p1);
        repo.save(p2);

        // READ
        Product found = repo.findByName("Keyboard");
        System.out.println("Product: " + found.getName() + ", ₹" + found.getPrice());

        // UPDATE
        found.setPrice(899.0);
        repo.save(found);
        System.out.println("Updated Price: ₹" + repo.findById(found.getId()).get().getPrice());

        // DELETE
        repo.deleteById(p2.getId());
        System.out.println("Mouse deleted: " + !repo.findById(p2.getId()).isPresent());
    }
}
