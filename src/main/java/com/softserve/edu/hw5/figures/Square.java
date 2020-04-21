package com.softserve.edu.hw5.figures;

public class Square implements Figure {

    double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double countPerimeter(){
        System.out.println(2*side);
        return 2*side;
    }
}
