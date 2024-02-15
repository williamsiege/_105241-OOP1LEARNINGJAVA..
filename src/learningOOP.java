import com.objects.firstClass;
import java.util.Scanner;
public class learningOOP {
public static void main(String[] args){
    System.out.println("Hello Welcome to my First object Creation");

    //Creating first object using the class firstClass as the blueprint.
// Create a Scanner object for user input
    Scanner scanner = new Scanner(System.in);

    // Get user input for account details
    System.out.print("Enter Account Holder Name: ");
    String _accountHolderName = scanner.nextLine();

    System.out.print("Enter Account Number: ");
    int _accountNumber = scanner.nextInt();

    System.out.print("Enter Initial Balance: ");
    float Balance = scanner.nextFloat();

    // Create a BankAccount object with user-input values
    firstClass myAccount = new firstClass(_accountNumber,_accountHolderName, Balance);

    // Perform operations
    System.out.println("\nPerforming Operations:");
    myAccount.checkBalance();

    System.out.println("\nEnter Deposit Amount: ");
    float depositAmount = scanner.nextFloat();
    myAccount.deposit(depositAmount);

    System.out.print("\nEnter Withdrawal Amount: ");
    float withdrawalAmount = scanner.nextFloat();
    myAccount.withdraw(withdrawalAmount);

    // Display final account details
    System.out.println("\nFinal Account Details:");
    myAccount.checkBalance();

    // Close the Scanner to prevent resource leak
    scanner.close();

    }
}
