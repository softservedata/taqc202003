package com.softserve.edu.inherit;

public class Parent {
	
	int f() {
		System.out.println("class Parent int f()");
		return 1;
	}

	public int useF() {
		return f();
	}
}
