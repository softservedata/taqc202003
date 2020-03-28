package com.softserve.edu.hw5;

public class Chicken extends NonFlyingBird {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chicken(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Chicken ";
	}

	@Override
	public String fly() {
		return super.fly();
	}

} 