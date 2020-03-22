package com.softserve.edu.hw5;

public  class Rectangle implements Figure{
private double length,width;
public Rectangle (double length, double width) {
	this.length= length;
	this.width = width;
	
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
@Override
public double getPerimeter() {
	return 2*(length+width);
}


}



