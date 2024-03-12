package com.william.Classwork;

public abstract class Class1 {
    protected float x;

    public Class1(int x){
        this.x =x ;
    }

    public abstract void Square();

    public final void printX(){
        System.out.println("X is ....: "+x );

    }
    public static void doubleNum(float a){
        a*=2;
        System.out.println("A by 2 is " +a);
    }

}
