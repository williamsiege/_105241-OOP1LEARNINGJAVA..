package com.william.Classwork;

public class RightAngleTriangle extends Triangle{

    public RightAngleTriangle(int a, int b, int c){
        super(a, b, c);
    }

    @Override
    public int getPerimeter() {
        return (a+b+c);
    }

    @Override
    public void showDetails() {
        System.out.println("Perimeter is " +getPerimeter());
    }
}
