package com.william.Classwork;
public class SavingsAccount extends AccountTi {
    //class attributes...
    private double interest ;

    //Empty Constructor...
    public SavingsAccount(){}
    //Full Constructor
    public SavingsAccount(String accountNumber, float balance , double interest){
        super(accountNumber, balance);
        this.interest =interest;
    }
    //Setters...
    public void setInterest(double interest) {
        this.interest = interest;
    }
    //Getters..
    public double getInterest() {
        return interest;
    }

    //Boolean for Interest...
public  boolean withdraw(float balance){
    if (balance > 0 ) {
        interest *= balance;
        System.out.println("Withdrawal successful. New balance: " + interest);
        return true; // Withdrawal successful
    } else {
        System.out.println("Withdrawal failed. Insufficient funds.");
        return false; // Withdrawal failed
    }
}

    //Methods of showing details ....
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Interest is : "+getInterest());

    }
}
