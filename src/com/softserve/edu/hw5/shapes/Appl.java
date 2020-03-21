package com.softserve.edu.hw5.shapes;

public class Appl {
    public static void main(String[] args) {
        //   В методі main класу Appl створити масив,
        //   який складається із двох прямокутників та трьох квадратів.
        //   В циклі вивести периметри фігур.
        Figure figures[] = new Figure[5];
        figures[0] = new Rectangle(2,8);
        figures[1] = new Rectangle(5, 4);
        figures[2] = new Square(9);
        figures[3] = new Square(8);
        figures[4] = new Square(5);

        for (Figure f: figures) {
            System.out.println("Perimeter: " +f.calcPerimeter());
        }
    }
}
