package com.softserve.edu.hw5.figures;

public class Rectangle implements Figure {
	private double height, length;

	public Rectangle(double height, double length) {
		this.height = height;
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getPerimeter() {
		return 2 * (height + length);
	}

	@Override
	public String toString() {
		return "Rectangle(" + height + "; " + length + '}';
	}
}