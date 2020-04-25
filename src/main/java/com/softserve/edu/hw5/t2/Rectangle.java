package com.softserve.edu.hw5.t2;

public class Rectangle implements Figure {
    private double heightSize, lengthSize;

    public Rectangle(double height, double length) {
        this.heightSize = height;
        this.lengthSize = length;
    }

    public double getHeightSize() {
        return heightSize;
    }

    public void setHeightSize(double heightSize) {
        this.heightSize = heightSize;
    }

    public double getLengthSize() {
        return lengthSize;
    }

    public void setLengthSize(double lengthSize) {
        this.lengthSize = lengthSize;
    }

    @Override
    public double getPerimeter() {
        return 2 * (heightSize + lengthSize);
    }

    @Override
    public String toString() {
        return "Figure: Rectangle{" + "height= " + heightSize +
                ", length= " + lengthSize + '}';
    }
}
