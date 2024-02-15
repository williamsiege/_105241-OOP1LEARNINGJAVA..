package com.william.Classwork;

public class Motorcycle {

    // attributes of the object motorcycle.
    private String motorName;
    private float price;

    //constructor.
    // instances of the class motorcycle.
    // create empty constructor.

    public Motorcycle(){
        //empty class construct.
    }

    //constructor overloading is adding more than one constructor.
    // creating more instances variables.
    // attribute name only.
    public Motorcycle(String motorName){
        this.motorName = motorName;
    }

    // Third constructor to initialize an instance of a class.
    // Includes both name and price.

    public Motorcycle(String motorName, float price){
        this.motorName = motorName;
        this.price = price;
    }

    //Setters - use keyword set followed the attribute to set.
    // setters always public and void by default.

    //first setter for Name.
    public void setMotorName(String motorName) {
        this.motorName = motorName;
    }
    //second Setter for price.
    public void setPrice(float price) {
        this.price = price;
    }

    //GETTERS
    // Getter for motorName.
    // by Default getters are public and have a return type.

    public String getMotorName(){
        return motorName;
    }

    //Getter for the price.
    // Getters used for private instance variables.
    public float getPrice() {
        return price;
    }

    //Method for showing the Details.
    public void showDetails(){
        System.out.println("Your Details requested are...");
        System.out.println("MotorCycle Name is :" +getMotorName());
        System.out.println("MotorCycle price is :" +getPrice());
    }



}
