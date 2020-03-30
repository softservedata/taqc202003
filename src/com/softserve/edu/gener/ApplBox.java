package com.softserve.edu.gener;

public class ApplBox {
	public static void main(String[] args) {
		/*-
		Box box = new Box();
		box.set(new Integer(123));
		// ... code
		box.set("123");
		//
		// Runtime Error
		int i = (Integer) box.get(); // Code Smells
		System.out.println("i = " + i);
		*/
		//
		/*-
		BoxWrapper box = new BoxWrapper();
		//box.set(new Integer(123)); // Compile Error
		// ... code
		box.set("123");
		//
		// Compile Error
		//int i = (Integer) box.get(); // Compile Error
		String i = box.get();
		System.out.println("i = " + i);
		*/
		//
		// *
		BoxGen<String> box = new BoxGen<>();
		//box.set(new Integer(123)); // Compile Error
		// ... code
		box.set("123");
		//
		// Compile Error
		// int i = (Integer) box.get(); // Compile Error
		String i = box.get();
		System.out.println("i = " + i);
		// */	
	}
}
