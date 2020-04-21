package com.softserve.edu.hw5.figures;

public class Rectangle implements Figure{

    private double width;
    private double length;

    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double countPerimeter(){
        System.out.println((2*width) + (2*length));
        return (2*width) + (2*length);
    }
}
