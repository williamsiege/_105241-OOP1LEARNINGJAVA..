import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args){
// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print(" Enter the third number");
        double num3 = scanner.nextDouble();

        // performing equality check using nested if .
        if(num1==num2){
            System.out.println(" Numbers are Equal");
        } else if (num2==num3) {
            System.out.println("Numbers are Equal");
        }else {
            System.out.println("Numbers are not Equal");
        }
//closing Scanner to prevent resource leak.
        scanner.close();
    }
}
