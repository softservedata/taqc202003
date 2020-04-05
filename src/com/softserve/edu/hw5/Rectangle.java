package com.softserve.edu.hw5;

public class Rectangle implements Figure {
	private double a;
	private double b;
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public double perumetr() {
		// TODO Auto-generated method stub
		return 2*a+2*b;
	}

}
