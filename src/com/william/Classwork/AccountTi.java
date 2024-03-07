package com.william.Classwork;

public class AccountTi {
    private String accountNumber;
    private float balance;

    // Empty Constructor
    public AccountTi(){}

    //Full constructor
    public AccountTi(String accountNumber, float balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //Setters.
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    //Getters
    public String getAccountNumber() {
        return accountNumber;
    }
    public float getBalance() {
        return balance;
    }
    //Methods for showing details...
    public void showDetails(){
        System.out.println("The Account Number is :"+getAccountNumber());
        System.out.println("The Balance is : "+getBalance());
    }

}
