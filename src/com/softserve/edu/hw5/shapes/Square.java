package com.softserve.edu.hw5.shapes;

public class Square implements Figure{
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int calcPerimeter() {
        return a+a+a+a;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
