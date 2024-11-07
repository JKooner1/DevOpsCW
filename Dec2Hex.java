public class Dec2Hex {

    public static void main(String[] args) {
        String result = handleConversion(args);
        System.out.println(result);
    }

    // Handles input and converts to hex, returning a result string
    public static String handleConversion(String[] args) {
        if (args.length == 0) {
            return "Error: No input provided. Please enter an integer.";
        }
        
        int arg1;
        try {
            arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            return "Error: Non-integer input provided. Please enter a valid integer.";
        }

        return convertToHex(arg1);
    }

    // Converts an integer to hexadecimal
    public static String convertToHex(int num) {
        if (num == 0) return "Hexadecimal representation is: 0";
        
        boolean isNegative = num < 0;  // Check if the number is negative
        num = Math.abs(num);  // Convert to positive for processing
        
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimal = "";
        int rem;

        while (num != 0) {
            rem = num % 16;
            hexadecimal = hexChars[rem] + hexadecimal;
            num = num / 16;
        }

        // Add '-' sign for negative numbers
        if (isNegative) {
            hexadecimal = "-" + hexadecimal;
        }

        return "Hexadecimal representation is: " + hexadecimal;
    }
}
