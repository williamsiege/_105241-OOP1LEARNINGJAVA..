package com.homework;
// Creating a Class to handle account information.BBIT.
public class firstClass {
    //Creating attributes to describe the class/ Object to be created from different views.
    public int _accountNumber;
    private float balance;
    protected String _accountHolderName;

    // Constructor-  are special methods used to initialize instance variables of objects at creation.
   // Helps in Creating a new object which requires invoking a constructor

    //Constructor Overloading.
    //empty constructor.
    public firstClass(){
    }

    //constructor 1
    public firstClass(int _accountNumber){
        this._accountNumber = _accountNumber;
    }

    //constructor 2
    public  firstClass(int _accountNumber, String accountHolderName){
        this._accountNumber=_accountNumber;
        this._accountHolderName=accountHolderName;
    }
    // constructor 3
    public firstClass(int _accountNumber, String _accountHolderName, float balance) {
        this._accountNumber = _accountNumber;
        this._accountHolderName = _accountHolderName;
        this.balance = balance;
    }

    // finished constructors.
    // setters - to allow to set values to private instance variables.
    public  void setBalance(float balance){
        this.balance = balance;
    }
    public  void set_accountHolderName(String _accountHolderName){
        this._accountHolderName= _accountHolderName;
    }
    public void set_accountNumber(int _accountNumber) {
        this._accountNumber = _accountNumber;
    }

    // Getters - (obtain values of)to get  private instance variables.
   public float getBalance(){
        return balance;
    }
    public String get_accountHolderName(){
        return  _accountHolderName;
    }
    public int get_accountNumber() {
        return _accountNumber;
    }

    // Creating Methods/Behaviour/functions within the class.
    // Method to check the balance
    public void checkBalance() {
        System.out.println("Account Number: " + get_accountNumber());
        System.out.println("Account Holder: " + get_accountHolderName());
        System.out.println("Current Balance: " + getBalance());
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
