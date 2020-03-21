package com.softserve.edu.hw5;

public class Appl {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Chicken()
        };
        for (Bird bird : birds) {
            bird.fly();
            System.out.print(bird.toString());
        }

        System.out.println("\nTask 2");
        Figure[] figures = {
                new Rectangle(5, 2),
                new Rectangle(1.5, 3.5),
                new Square(1),
                new Square(2.5),
                new Square(9)

        };
        for (Figure figure: figures) {
            System.out.println("Perimeter of the figure = " + figure.getPerimeter());
        }
    }
}
