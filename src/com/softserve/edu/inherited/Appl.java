package com.softserve.edu.inherited;

public class Appl {
	
	public static void main(String[] args) {
		/*
		B b = new B();
		// 1. allocate memory
		// 2. create object
		// 3. fill fields
		// 4. setup virtual method table
		//
		//b.k; // Error, k is private.
		System.out.println("b.getK() = " + b.getK());
		//
		//int l = 2;
		//double d = -1.1;
		//
		//d = l; // ok
		//System.out.println("d = " + d);
		//l = d; // error
		//l = (int) d; // ok
		//System.out.println("l = " + l); // -1
		//
		//B b = new A(); // error
		A a1 = new A();
		//B b = a1; // error
		//B b0 = (B) a1; // No Compile Error, but Runtime Error
//		System.out.println("b0.j = " + b0.j); // runtime error
		//
		*/
		//
		// *
		A a = new B();
		a.m1(); // from class B 
		//((A) a).m1(); // from class B, not form A
		//a.m4(); // Compile Error
		//((B) a).m4();
		//
		//a.m2(); // from class A
//		A.m2();
//		B.m2();
		// */
		//
	}
}
