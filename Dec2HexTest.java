import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Dec2HexTest {

    @Test
    void testNoInputProvided() {
        String[] args = {};
        String result = Dec2Hex.handleConversion(args);
        assertEquals("Error: No input provided. Please enter an integer.", result);
    }

    @Test
    void testNonIntegerInput() {
        String[] args = {"abc"};
        String result = Dec2Hex.handleConversion(args);
        assertEquals("Error: Non-integer input provided. Please enter a valid integer.", result);
    }

    @Test
    void testZeroInput() {
        String[] args = {"0"};
        String result = Dec2Hex.handleConversion(args);
        assertEquals("Hexadecimal representation is: 0", result);
    }

    @Test
    void testValidIntegerInput() {
        String[] args = {"15"};
        String result = Dec2Hex.handleConversion(args);
        assertEquals("Hexadecimal representation is: F", result);
    }

    @Test
    void testNegativeIntegerInput() {
        String[] args = {"-10"};
        String result = Dec2Hex.handleConversion(args);
        assertEquals("Hexadecimal representation is: -A", result);
    }

    // Additional test directly on convertToHex
    @Test
    void testDirectHexConversion() {
        assertEquals("Hexadecimal representation is: 7B", Dec2Hex.convertToHex(123));
        assertEquals("Hexadecimal representation is: 1C8", Dec2Hex.convertToHex(456));
    }
}
import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    @Test
    public void testNoInputProvided() {
        String[] args = {};
        String result = Dec2Hex.handleConversion(args);
        assertEquals("Error: No input provided. Please enter an integer.", result);
    }

    @Test
    public void testNonIntegerInput() {
        String[] args = {"abc"};
        String result = Dec2Hex.handleConversion(args);
        assertEquals("Error: Non-integer input provided. Please enter a valid integer.", result);
    }

    @Test
    public void testZeroInput() {
        String[] args = {"0"};
        String result = Dec2Hex.handleConversion(args);
        assertEquals("Hexadecimal representation is: 0", result);
    }

    @Test
    public void testValidIntegerInput() {
        String[] args = {"15"};
        String result = Dec2Hex.handleConversion(args);
        assertEquals("Hexadecimal representation is: F", result);
    }

    @Test
    public void testNegativeIntegerInput() {
        String[] args = {"-10"};
        String result = Dec2Hex.handleConversion(args);
        assertEquals("Hexadecimal representation is: -A", result);
    }

    @Test
    public void testDirectHexConversion() {
        assertEquals("Hexadecimal representation is: 7B", Dec2Hex.convertToHex(123));
        assertEquals("Hexadecimal representation is: 1C8", Dec2Hex.convertToHex(456));
    }
}
