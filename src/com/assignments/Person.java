package com.assignments;
public class Person {
    // Superclass representing a generic person...
        // Common attributes for all persons
        private String name;
        private int age;
        // Constructors for the Person class
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Person(){}

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //getters
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    // Method to display information about the person
        public void displayInfo() {
            System.out.println("Name: " + getName());
            System.out.println("Age: " + getAge());
        }

}
