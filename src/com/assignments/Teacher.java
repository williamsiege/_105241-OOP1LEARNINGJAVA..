package com.assignments;
//Subclass representing a teacher inheriting from Person class...
public class Teacher extends Person{
    // Additional attribute specific to teachers
    private String subject;
    private int teacherId;

    // Constructor for the Teacher class
    public Teacher(String name, int age, String subject,int teacherId) {
        // Call the constructor of the superclass (Person)
        super(name, age);
        this.subject = subject;
        this.teacherId=teacherId;
    }
    public Teacher(){}

    //Setters and getters.
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId=teacherId;
    }
    @Override
    public int getAge() {
        return super.getAge();
    }
    @Override
    public String getName() {
        return super.getName();
    }
    public int getTeacherId() {
        return teacherId;
    }
    public String getSubject() {
        return subject;
    }

    // Method to display information about the teacher
    public void displayTeacherInfo() {
        // Call the displayInfo method of the superclass (Person)
        super.displayInfo();
        System.out.println("Subject: " + getSubject());
        System.out.println("Teacher Id is :"+ getTeacherId());
    }

}
