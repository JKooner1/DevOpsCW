import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        // Specify the test classes you want to run
        Result result = JUnitCore.runClasses(Dec2HexTest.class);

        // Display results
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        // Display if the tests were successful
        if (result.wasSuccessful()) {
            System.out.println("All tests passed successfully.");
        } else {
            System.out.println("Some tests failed.");
        }
    }
}
