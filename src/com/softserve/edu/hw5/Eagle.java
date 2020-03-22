package com.softserve.edu.hw5;

public class Eagle extends FlyingBird{

	public Eagle(String name) {
		super(name);
			}

	@Override
	public void fly() {
		System.out.println ("Eagle can fly");	
	}
	
	@ Override
	 public String toString() {
		 return "Eagle";
}
}