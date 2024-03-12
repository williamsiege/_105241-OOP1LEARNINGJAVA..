package com.william.Classwork;

public abstract class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c){
        this.a= a;
        this.b= b;
        this.c= c;

    }
    public abstract int getPerimeter();

    public abstract void showDetails();

}
