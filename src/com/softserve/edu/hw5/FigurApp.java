package com.softserve.edu.hw5;

abstract class Figur {
    public Figur() {
        System.out.println("Constructor public Figure()");
    }
    /* because this is an abstract method the body will be blank */
    public abstract double getPer();
}

class Square extends Figur {
    private double side;

    public Square(double side) {
        this.side = side;
        System.out.println("Constructor Square()");
    }

    public double getPer() {
        return ( side * 4);
    }
}

class Rectangle extends Figur {
    private double length, width;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
        System.out.println("Constructor Rectangle()");
    }

    @Override
    public double getPer() {
        return ((length + width) * 2);
    }
}

public class FigurApp {
    public static void main(String[] args) {
        Figur[] fig = { new Square(2), new Square(1), new Square(4), new Rectangle(3,4), new Rectangle(1,2) };
        for (Figur currentFig : fig) {
            System.out.println("currentFig is: " + currentFig.getClass().getName() + " Perimeter =  " + currentFig.getPer());
        }
    }
}