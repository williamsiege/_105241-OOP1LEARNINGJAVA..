package com.homework;
public class EmployeePay implements PayableInterface{
    private String fName;
    private String lName;
    private double salary;

    public EmployeePay(String fName,String lName,double salary){
        this.fName=fName;
        this.lName=lName;
        this.salary=salary;
    }
    @Override
    public double getPayableAmount() {
        return salary;
    }
    public String getFullName() {
        return fName;
    }
    @Override
    public void showDetails() {
       System.out.println("Employee Full Name: "+getFullName());
       System.out.println("Employee Salary:  "+getPayableAmount());
    }
}
