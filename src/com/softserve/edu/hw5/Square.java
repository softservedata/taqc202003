package com.softserve.edu.hw5;

public class Square implements Figure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
}
