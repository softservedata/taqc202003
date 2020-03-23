package com.softserve.edu.hw5.birds;

public class Penguin extends NonFlyingBird {
	
	public Penguin(String name) {
		super(name);
	}
	
    @Override
    public String toString() {
        return "Penguin";
    }
}