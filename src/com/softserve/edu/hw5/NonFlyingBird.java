package com.softserve.edu.hw5;

public abstract class NonFlyingBird implements Bird {
private String name;
	
	public NonFlyingBird (String name) {
		this.name=name;
	
	}
	 @Override
	 public String getName() {
		 return name;
	 }
		
	}