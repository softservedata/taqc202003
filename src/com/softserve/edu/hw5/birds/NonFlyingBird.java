package com.softserve.edu.hw5.birds;

public abstract class NonFlyingBird implements Bird {
	
	private String name;
	
	public NonFlyingBird(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
    @Override
    public String fly() {
        return "nonFlying bird";
    }
}