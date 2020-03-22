package com.softserve.edu.hw5;

public class Chicken extends NonFlyingBird {
	
	public Chicken (String name) {
		super(name);
			}

	@Override
	public void fly() {
		System.out.println ("Chicken can not  fly");	
	}
	
	@ Override
	 public String toString() {
		 return "Chicken";
}
	
	}



