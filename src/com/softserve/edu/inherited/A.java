package com.softserve.edu.inherited;

public class A {
	public int i; // =0 by default
	private int k = 111; // =0 by default

	public A() {
		//System.out.println("class A: Constructor");
		System.out.println("class A: Constructor, k = " + k); // k is 111
		k = 123;
	}

	public A(int i) {
		this.i = i;
		System.out.println("class A: Constructor");
	}

	public int getK() {
		System.out.println("class A: getK()");
		return k;
	}

	public void m1() {
		int temp; // undefined
		i = i + 1;
		System.out.println("class A: m1()");
	}

	public static void m2() {
		System.out.println("class A: m2()");
	}

	//public void m3() {
	protected void m3() {
		System.out.println("class A: m3()");
	}

}
