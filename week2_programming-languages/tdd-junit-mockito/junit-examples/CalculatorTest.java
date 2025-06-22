package junit.examples;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test void add()       { assertEquals(5, new Calculator().add(2,3)); }
    @Test void subtract()  { assertEquals(1, new Calculator().subtract(3,2)); }
}
