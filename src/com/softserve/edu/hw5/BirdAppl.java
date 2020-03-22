package com.softserve.edu.hw5;

public class BirdAppl {
	public static void main(String[] args) {
		Bird[] birds = { new Eagle("Orlan"), new Swallow("Red-chested"), new Eagle("Fish-Eagle"),
				new Swallow("Pacific"), new Penguin("Royal"), new Chicken ("Orpinton") };

		for (Bird current : birds) {
			System.out.println("This is " + current + " with name :" + current.getName());
			current.fly();
		}
	}
}
