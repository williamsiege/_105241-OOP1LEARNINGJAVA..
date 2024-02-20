package com.homework;

public class Patient {
// Creating Patient Attributes.
    private int patientId;
    public String patientName;
    private int patientAge;
    private char gender;

// Initializing a patient object using different constructs...

    public Patient(){}// Empty Constructor...

    public Patient(int patientId){ // Constructor 1...
        this.patientId=patientId;
    }
    public  Patient(int patientId, String patientName){ //Constructor2
        this.patientId=patientId;
        this.patientName=patientName;
    }
    public Patient(int patientId,String patientName, int patientAge){
        this.patientId=patientId;
        this.patientName=patientName;  //Constructor3...
        this.patientAge=patientAge;
    }
    public Patient(int patientId, String patientName, int patientAge, char gender){
        this.patientId=patientId;
        this.patientName=patientName;  //Constructor4...
        this.patientAge=patientAge;
        this.gender=gender;
    }

    //Setters.
    public void setPatientId(int patientId){
        this.patientId =patientId;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public void  setPatientAge(int patientAge){
        this.patientAge = patientAge;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    //Getters...
    public int getPatientId() {
        return patientId;
    }
    public String getPatientName() {
        return patientName;
    }
    public int getPatientAge() {
        return patientAge;
    }
    public char getGender() {
        return gender;
    }

    //Methods/ Behaviours...
    public void checkDetails(){
        System.out.println("Patient Identification is : " +getPatientId());
        System.out.println("Patient Name is :" +getPatientName());
        System.out.println("Patient Age is :" +getPatientAge());
        System.out.println("Patient Gender is :" +getGender());
    }
}
