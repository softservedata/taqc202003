package com.softserve.edu.hw5.figures;

public class Appl {

    public static void main(String[] args) {

        Figure[] figures = new Figure[]{new Square(14.7),new Square(11.68), new Square(0.24),
                new Rectangle(13, 7.04), new Rectangle(16, 5.5)};

        for (int i = 0; i<figures.length; i++){

            figures[i].countPerimeter();
        }
    }
}
