package logging.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo {

    // Create logger instance
    private static final Logger logger = LoggerFactory.getLogger(LogDemo.class);

    public static void main(String[] args) {
        logger.info("Application started");

        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            logger.debug("Result: {}", result); // Won't reach here
        } catch (ArithmeticException e) {
            logger.error("Error occurred while dividing by zero", e);
        }

        logger.warn("This is a warning message");
        logger.info("Application ended");
    }
}
