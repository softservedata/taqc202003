package com.softserve.edu.inherit2;

public class OOPSamples {
	public static void main(String... args) {
		Child child = new Child();
		System.out.println("child.useF(): " + child.useF());
		System.out.println("child.f(): " + child.f()); // Architecture Error
	}
}
