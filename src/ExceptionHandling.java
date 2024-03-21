import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExceptionHandling {
// Try to catch the errors.
public static void main(String[] args) {
    // Try to read from the file and calculate square root
    try {
        File file = new File("numbers.txt");
        Scanner scanner = new Scanner(file);

        // Read the integer from the file
        while (scanner.hasNext()) {
            int number = scanner.nextInt();

            // Check if the number is negative
            if (number < 0) {
                throw new IllegalArgumentException("Negative number found: " + number);
            }
            // Calculate square root and display the result
            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is: " + squareRoot);
        }
        // Close the scanner
        scanner.close();
    } catch (FileNotFoundException e) {
        // Handle file not found exception
        System.err.println("Error: File not found.");
    } catch (IllegalArgumentException e) {
        // Handle negative number exception
        System.err.println("Error:" + e.getMessage());
    } catch (ArithmeticException e) {
        // Handle arithmetic exception (e.g., square root of negative number)
        System.err.println("Error: ArithmeticException - " + e.getMessage());
    } catch (Exception e) {
        // Handle any other exceptions
        System.err.println("Error: More Numbers in the file ...." + e.getMessage());
    }
}

}
