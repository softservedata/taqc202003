package com.softserve.edu.hw5;

public class Rectangle  implements Figure{
    private float length;
    private float height;

    public Rectangle(float height,   float length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public float getPerimeter() {
        return (2*(height + length));
    }

    @Override
    public String toString() {
        return "Rectangle with " +
                "length = " + length +
                ", height = " + height +
                " ";
    }
}
