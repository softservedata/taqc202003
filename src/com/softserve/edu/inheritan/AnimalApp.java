package com.softserve.edu.inheritan;

public class AnimalApp {

	public static void main(String[] args) {
		Animal[] animals = { new Cat("Murka"), new Dog("Bobik"),
				new Cat("Mur2"), new Dog("Tuzik"), new Cat("Leopold") };
		//
		for (Animal current : animals) {
			System.out.println("\nThis is " + current 
					+ " with name: " + current.getName());
			current.feed();
			current.voice();
		}
	}
}
