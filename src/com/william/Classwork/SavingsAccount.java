package com.william.Classwork;
public class SavingsAccount extends AccountTi {
    //class attributes...
    private double interest;

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


    //Methods of showing details ....
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Interest is : "+getInterest());

    }
}
