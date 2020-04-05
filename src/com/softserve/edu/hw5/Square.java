package com.softserve.edu.hw5;

public class Square implements Figure {
	private double a;
	public Square(double a) {
		super();
		this.a = a;
	}
	@Override
	public double perumetr() {
		// TODO Auto-generated method stub
		return 4*a;
	}

}
