import java.util.Scanner;
public class assignment {
    // assignment on control flow.
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers (x and y)
        System.out.print("Enter the first number (x): ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number (y): ");
        int y = scanner.nextInt();

        // Compare and swap if necessary
        if (x > y) {
            // Swap x and y
            int temp = x;
            x = y;
            y = temp;
        }

        // Output the sorted numbers
        System.out.println("Sorted Numbers (in increasing order): " + x + ", " + y);

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
/*+---------------------+
|  Start              |
+---------------------+
        |
        v
+---------------------+
|  Input x, y         |
+---------------------+
        |
        v
+---------------------+
|  If x > y           |
|  Swap x and y       |
+---------------------+
        |
        v
+---------------------+
|  Output x, y        |
+---------------------+
|  End                |
+---------------------+
*/
}
