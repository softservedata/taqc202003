package com.softserve.edu.hw5;

public abstract class FlyingBird implements Bird {
	private String name;
	
	public FlyingBird (String name) {
		this.name=name;
	
	}
	 @Override
	 public String getName() {
		 return name;
	 }
		
	}
