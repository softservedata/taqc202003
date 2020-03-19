package com.softserve.edu.inheritan;

//public class Cat implements Animal {
public class Cat extends ABeast {
	
	/*
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	*/
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void voice() {
		System.out.println("meo meo");
	}

	@Override
	public void feed() {
		System.out.println("like milk");
	}

	@Override
	public String toString() {
		return "Cat";
	}
	
}
