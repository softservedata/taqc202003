package com.softserve.edu.inherited;

public class B extends A {
	public int j = 123;

	// Java Compiler insert default constructor public B(){}
	public B() {
		//super();
		super();
		System.out.println("class B: Constructor");
		j = 121;
	}

	//@Override
	public void m12() {
		System.out.println("class B: m1()");
		//m1(); // Recursive 
		//super.m1();
		m2(); // From class B
	}
	
	public static void m2() {
		System.out.println("class B: m2()");
		//m4(); // error
	}

	//private void m3() { // Architecture Error
	public void m3() {
		System.out.println("class B: m3()");
	}

	public void m4() {
		System.out.println("class B: m4()");
	}

}
