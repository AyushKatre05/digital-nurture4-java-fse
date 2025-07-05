import model.Department;
import model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repository.DepartmentRepository;
import repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class MainApp {
    @Autowired
    private EmployeeRepository employeeRepo;
    @Autowired
    private DepartmentRepository deptRepo;

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }
}
