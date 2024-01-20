import java.util.Scanner;

public class Calculator {
    //Building a simple calculator to allow two input
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform calculations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double modulus = num1 % num2;
        double squareRootNum1 = Math.sqrt(num1);
        double squareRootNum2 = Math.sqrt(num2);
        // Output the results
        System.out.println("Sum is : " + sum);
        System.out.println("Difference is : " + difference);
        System.out.println("Product is : " + product);

        // Check for division by zero before outputting quotient
        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Check for square root of negative number before outputting square root
        if (num1 >= 0 && num2>=0)
        {System.out.println("Square Root of " + num1 + " : " + squareRootNum1);
         System.out.println("Square root of " + num2 + " : "  +squareRootNum2);

        } else {
            System.out.println("Cannot calculate square root of a negative number.");
        }

        // Check for modulus with zero before outputting modulus
        if (num2 != 0) {
            System.out.println("Modulus is : " + modulus);
        } else {
            System.out.println("Cannot calculate modulus with zero as divisor.");
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
