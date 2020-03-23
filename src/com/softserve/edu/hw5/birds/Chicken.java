package com.softserve.edu.hw5.birds;

public class Chicken extends NonFlyingBird {

	
	public Chicken(String name) {
		super(name);
	}
	
    @Override
    public String toString() {
        return "Chicken";
    }
}