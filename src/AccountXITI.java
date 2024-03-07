public class AccountXITI {
    protected double balance;

    // Constructor
    public AccountXITI(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method for withdrawing from the bank account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
            return true; // Withdrawal successful
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
            return false; // Withdrawal failed
        }
    }

    // Getter method for retrieving the balance
    public double getBalance() {
        return balance;
    }
}

// Subclass representing a savings account, inheriting from BankAccount
class SavingsAccount extends AccountXITI {
    private double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    //Setters....
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    //Getters...
    public double getInterestRate() {
        return interestRate;
    }

    // Method for calculating and applying interest to the account
    public boolean applyInterest() {
        double interestAmount = balance * interestRate;
        balance += interestAmount;
        System.out.println("Interest applied. New balance: " + balance);
        return true; // Interest applied successfully
    }
}
// Main class for testing
class SavingsAccountExample {
    public static void main(String[] args) {
        // Create a SavingsAccount instance with an initial balance and interest rate
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 0.05);

        // Apply interest to the savings account
        boolean interestResult = savingsAccount.applyInterest();

        // Display the balance after applying interest (if successful)
        if (interestResult) {
            System.out.println("Balance after interest: " + savingsAccount.getBalance());
        }

        // Withdraw from the savings account
        boolean withdrawalResult = savingsAccount.withdraw(200.0);

        // Display the balance after withdrawal (if successful)
        if (withdrawalResult) {
            System.out.println("Remaining balance after withdrawal: " + savingsAccount.getBalance());
        }
    }
}