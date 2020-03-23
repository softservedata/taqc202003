package com.softserve.edu.hw5.figures;

public class Square implements Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square(" + side + ")";
    }
}