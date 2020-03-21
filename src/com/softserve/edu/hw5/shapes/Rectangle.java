package com.softserve.edu.hw5.shapes;

public class Rectangle implements Figure {
   private int a;
   private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calcPerimeter() {
        return (a*a)+(b*b);
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
