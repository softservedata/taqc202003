package com.softserve.edu.inheritan;

//public class Dog implements Animal {
public class Dog extends ABeast {

	/*
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	*/
	
	public Dog(String name) {
		super(name);
	}


	@Override
	public void voice() {
		System.out.println("gav gav");
	}

	@Override
	public void feed() {
		System.out.println("like meat");
	}

	@Override
	public String toString() {
		return "Dog";
	}

}
