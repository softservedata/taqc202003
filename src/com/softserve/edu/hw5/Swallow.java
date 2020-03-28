package com.softserve.edu.hw5;

public class Swallow extends FlyingBird {
	private String name;

	public Swallow(String name) {
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
		return "Swallow ";
	}

	@Override
	public String fly() {
		return super.fly();
	}

}
