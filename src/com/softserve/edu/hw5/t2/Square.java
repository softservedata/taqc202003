package com.softserve.edu.hw5.t2;

public class Square implements Figure {
    private double sideSize;

    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideSize;
    }

    @Override
    public String toString() {
        return "Figure: Square{" + "sideSize= " + sideSize + '}';
    }
}
