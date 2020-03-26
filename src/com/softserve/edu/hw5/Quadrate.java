package com.softserve.edu.hw5;

public class Quadrate implements Figure {
    private float side;
    public Quadrate(float side){
        this.side = side;

    }

    @Override
    public float getPerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Quadrate with " +
                "side= " + side + " " ;
    }
}
