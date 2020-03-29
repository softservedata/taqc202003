package com.softserve.edu.hw8;

public class Appl {
	public static void main(String[] args) {

		String str = "I study String Reqular expression";
		String substring = "Regular";

		int n = str.indexOf(str);
		System.out.println("Print origin " + str);
		System.out.println("Print substring " + substring);
		str = str.toLowerCase();
		substring = substring.toLowerCase();
		System.out.println (str);
		System.out.println (substring);
	}
}