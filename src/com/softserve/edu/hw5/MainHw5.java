package com.softserve.edu.hw5;

public class MainHw5 {
        public static void main(String[] args) {
            System.out.println("Birds Task");
            Bird[] birds = {
                    new Eagle(),
                    new Swallow(),
                    new Penguin(),
                    new Chicken()
            };
            for (Bird bird : birds) {
                bird.fly();
                System.out.println(bird.toString());
            }

            System.out.println("Geometric Task");
            Figure[] figures = {
                    new Rectangle(7, 3),
                    new Rectangle(666, 999),
                    new Quadrate(0),
                    new Quadrate(99),
                    new Quadrate(1)

            };
            for (Figure figure: figures) {
                System.out.println(figure.toString() +" perimeter is " + figure.getPerimeter());
            }

    }
}
