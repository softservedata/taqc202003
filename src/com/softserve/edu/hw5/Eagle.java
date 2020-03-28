package com.softserve.edu.hw5;

public class Eagle extends FlyingBird {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Eagle(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Eagle ";
	}

	@Override
	public String fly() {
		return super.fly();
	}

}