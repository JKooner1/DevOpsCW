import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.logging.Logger;
import java.util.logging.Level;

public class TestRunner {
    // Set up a logger for the TestRunner class
    private static final Logger logger = Logger.getLogger(TestRunner.class.getName());

    public static void main(String[] args) {
        // Run the tests in Dec2HexTest
        Result result = JUnitCore.runClasses(Dec2HexTest.class);

        // Display results for any failed tests
        for (Failure failure : result.getFailures()) {
            logger.log(Level.SEVERE, failure.toString());
        }

        // Display if the tests were successful
        if (result.wasSuccessful()) {
            logger.log(Level.INFO, "All tests passed successfully.");
        } else {
            logger.log(Level.WARNING, "Some tests failed.");
        }
    }
}
