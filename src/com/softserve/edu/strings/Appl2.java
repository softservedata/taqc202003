package com.softserve.edu.strings;

public class Appl2 {
	public static void main(String[] args) {
		String s = "abba abc";
		int i = 0;
		while ((i = s.indexOf('a', i)) >= 0) {
			System.out.println("i= " + i);
			i++;
		}
	}
}
