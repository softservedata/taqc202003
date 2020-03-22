package com.softserve.edu.hw5;

public class Penguin extends NonFlyingBird {
	
	public Penguin (String name) {
		super(name);
			}

	@Override
	public void fly() {
		System.out.println ("Penguin can not fly");	
	}
	
	@ Override
	 public String toString() {
		 return "Penguin";
}
	
	}


