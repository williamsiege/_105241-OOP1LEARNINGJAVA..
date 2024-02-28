package com.assignments;
public class Student  extends Person{
    // Subclass representing a student, inheriting from Person
        // Additional attribute specific to students
        private int studentId;
        private int classId;

        // Constructor for the Student class
        public Student(String name, int age, int studentId, int classId) {
            // Call the constructor of the superclass (Person)
            super(name, age);
            this.studentId = studentId;
            this.classId= classId;
        }
        public Student(){}

    //Student Setters.
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setClassId(int classId) {
        this.classId = classId;
    }
    //Student Getters...
    @Override
    public int getAge() {
        return super.getAge();
    }
    @Override
    public String getName() {
        return super.getName();
    }
    public int getStudentId() {
        return studentId;
    }
    public int getClassId() {
        return classId;
    }

    // Method to display information about the student
        public void displayStudentInfo() {
            // Call the displayInfo method of the superclass (Person)
            super.displayInfo();
            System.out.println("Student ID: " + getStudentId());
            System.out.println("Class Id is :" +getClassId());
        }

}
