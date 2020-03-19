package com.softserve.edu.inherit2;

import com.softserve.edu.inherit.Parent;

public class Child extends Parent {
	protected int f() {
		System.out.println("class Child int f()");
		return 2;
	}
}
