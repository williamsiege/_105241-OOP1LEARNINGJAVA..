package Objects;
// Creating a Class to handle account information.BBIT.
public class firstClass {
    //Creating attributes to describe the class/ Object to be created from different views.
    public int _accountNumber;
    private float balance;
    protected String _accountHolderName;

    // Constructor-  are special methods used to initialize instance variables of objects at creation.
   // Helps in Creating a new object which requires invoking a constructor
    public firstClass(int accountNumber, String accountHolderName, float balance) {
        this._accountNumber = accountNumber;
        this._accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // setters - to allow to set values to private instance variables.
    public  void setBalance(float balance){
        this.balance = balance;
    }

    // Getters - (obtain values of)to get  private instance variables.
   public float getBalance(){
        return balance;
    }


    // Creating Methods/Behaviour/functions within the class.
    // Method to check the balance
    public void checkBalance() {
        System.out.println("Account Number: " + _accountNumber);
        System.out.println("Account Holder: " + _accountHolderName);
        System.out.println("Current Balance: " + balance);
    }

    // Method to deposit money
    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    // Method to withdraw money
    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
// learning experience gained on creating classes and objects.
}
