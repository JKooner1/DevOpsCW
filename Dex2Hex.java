import java.util.Scanner;
class Dec2Hex {
    public static void main(String args[]) {
        // Check if there is an input argument
        if (args.length == 0) {
            System.out.println("Error: No input provided. Please enter an integer.");
            return;  // Exit the program if no input is provided
        }
        
        int Arg1;
        try {
            // Try parsing the input as an integer
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            // Handle the case where input is not a valid integer
            System.out.println("Error: Non-integer input provided. Please enter a valid integer.");
            return;  // Exit the program if input is not an integer
        }

        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num = Arg1;
        String hexadecimal = "";

        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}

