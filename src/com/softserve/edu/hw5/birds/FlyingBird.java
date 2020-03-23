package com.softserve.edu.hw5.birds;

public abstract class FlyingBird implements Bird {
    
	private String name;
	
	public FlyingBird(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
    public String fly() {
        return "Flying bird";
    }
}
