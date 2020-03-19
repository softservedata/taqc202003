package com.softserve.edu.inheritan;

public abstract class ABeast implements Animal {

	private String name;

	public ABeast(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
