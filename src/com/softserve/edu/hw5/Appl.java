package com.softserve.edu.hw5;

public class Appl {

	public static void main(String[] args) {
		//Bird[] birds = { new Eagle("Eagle"), new Swallow("Swallow"), new Penguin("Penguin"), new Chicken("Chicken"), new Eagle("Owl") };

		Bird[] birds = new Bird[4];
		birds[0] = new Eagle("\"�������\"");
		birds[1] = new Swallow ("\"��������\"");
		birds[2] = new Penguin("\"��������\"");
		birds[3] = new Chicken("\"���������\"");
		
		for (Bird current : birds) {
//			System.out.println(current.toString() + " ia a " + current.fly());
			System.out.println(current.toString() + current.getName() + " is a " + current.fly());
		}
	}
}