package com.softserve.edu.hw5;

public class Square implements Figure {

	private double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	@Override
	public double get_per() {
		return (side*4);
	}

}
