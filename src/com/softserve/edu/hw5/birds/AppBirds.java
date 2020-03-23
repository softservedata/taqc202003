package com.softserve.edu.hw5.birds;

public class AppBirds {

	public static void main(String[] args) {

		System.out.println("===Home work 5.1===");

		Bird[] birds = { new Eagle("BALD"), new Swallow("Cave "), new Penguin("Fiordland "), new Chicken("Ancona") };

		for (Bird bird : birds) {
			System.out.println("Birds type: " + bird.toString() + " and this is" + bird.fly());
			
		}

	}
}
