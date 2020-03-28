package com.softserve.edu.hw5;

public class ApplFigure {

	public static void main(String[] args) {

		Figure[] figur = {new Square(5.55), new Square(23), new Square(0.5), new Rectangle (7,21), new Rectangle (666, 2.51)};
		
		
		for (Figure current : figur) {
			System.out.print(current.toString() + " ");
			System.out.println(current.get_per());
		}

	}

}