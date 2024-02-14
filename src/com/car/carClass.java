package com.car;
public class carClass {
    // attributes to the car following exercise instructions.
    private String _make;
    private int _doors;


    // creating constructor for car make and doors.
    public carClass(String make, int doors){
        this._make = make;
        this._doors = doors;
    }

    //Creating Setter for car make.
    public  void setMake(String make){
        this._make = make;
    }
    public  void setDoors(int doors){
        this._doors = doors;
    }


    //Creating getter for car make.
    public String get_make(){
        return _make;
    }

    // creating car Method to show details.
    public void showDetails(){
        System.out.println("The Car make is " +_make);
        System.out.println("The car has this number of doors " +_doors);
    }

    // Finished creating the Class for car in the class Exercise...
}
