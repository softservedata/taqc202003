package com.softserve.edu.hw5.figures;

public class Appl {
	public static void main(String[] args) {

		System.out.println("====Home work 5.2====");
		Figure[] figures = { new Rectangle(10.8, 6.6), new Rectangle(7.9, 10.2), new Square(1.2), new Square(5.9),
				new Square(100.2) };
		for (Figure figure : figures) {
			System.out.println(figure.toString() + " Perimeter= " + figure.getPerimeter());
		}

	}
}