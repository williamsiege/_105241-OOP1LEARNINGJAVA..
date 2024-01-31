import java.util.Scanner;
// calculator 2 offering choices on which operations to perform.
public class simpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Display menu and get user's choice
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Divide");
        System.out.println("4. Square Root (of the First number)");
        System.out.println("5. Square Root (of the Second number)");
        System.out.println("6. Modulus");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        // Perform the selected operation and output the result
        switch (choice) {
            case 1:
                System.out.println("Result (Addition): " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result (Subtraction): " + (num1 - num2));
                break;
            case 3:
                // Check for division by zero
                if (num2 != 0) {
                    System.out.println("Result (Division): " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 4:
                // Check for square root of negative number
                if (num1 >= 0) {
                    System.out.println("Result (Square Root): " + Math.sqrt(num1));
                } else {
                    System.out.println("Cannot calculate square root of a negative number.");
                }
                break;
            case 5:
                // Check for square root of negative number
                if (num2 >= 0) {
                    System.out.println("Result (Square Root): " + Math.sqrt(num2));
                } else {
                    System.out.println("Cannot calculate square root of a negative number.");
                }
                break;
            case 6:
                // Check for modulus with zero
                if (num2 != 0) {
                    System.out.println("Result (Modulus): " + (num1 % num2));
                } else {
                    System.out.println("Cannot calculate modulus with zero as divisor.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
