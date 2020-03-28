package com.softserve.edu.hw5;

public class Penguin extends NonFlyingBird {
	private String name;

	public Penguin(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Penguin ";
	}

	@Override
	public String fly() {
		return super.fly();
	}

}
