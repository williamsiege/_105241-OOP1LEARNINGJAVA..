package com.homework;
public class Rectangle implements calculationInter {
    // Attributes of Rectangle...
    private  float length;
    private float width;

    //Constructors for Rectangle...
    public Rectangle(){}
    public Rectangle(float length, float width){
        this.length=length;
        this.width= width;
    }
    //setters and Getters...
    public void setWidth(float width) {
        this.width = width;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getLength() {
        return length;
    }
    public float getWidth() {
        return width;
    }
    //Methods .... from Interface .....
    @Override
    public float getPerimeter() {
        return (length+width)*2;
    }
    @Override
    public float getArea() {
        return length*width;
    }
    @Override
    public void showDetails() {
        System.out.println("Length is  " +getLength());
        System.out.println("Width is  "+getWidth());
        System.out.println("Perimeter is: " +getPerimeter());
        System.out.println("Area is : " +getArea());
    }
}
