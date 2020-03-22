package com.softserve.edu.hw5;

public class Square implements Figure{
	private double length;
	public Square (double length){
	this.length=length;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getPerimeter() {
			return 4*length;
	}

}
