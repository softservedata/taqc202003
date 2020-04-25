package com.softserve.edu.hw5.t2;

public class Appl {
    public static void main(String[] args) {
        //Create interface Figure and classes Rectangle and Square
        //Print the no the screen
        System.out.println("---Home work 5---Task 2---");
        Figure[] figures = {new Rectangle(3, 6.6),
                new Rectangle(5.5, 8.9), new Square(5.5),
                new Square(4.7), new Square(5)};
        for (Figure figure : figures) {
            System.out.println(figure.toString() + " Area= "+ figure.getPerimeter());
        }


    }
}
