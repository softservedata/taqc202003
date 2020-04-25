package com.softserve.edu.hw2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Appl {

	private static final int K = 16;

	static int printK() {
		return K;
	}

	static void getUserName(String name) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		name = scanner.nextLine();
		System.out.printf("Hello %s", name);
	}

	static int k;

	public static void main(String[] args) {
		System.out.println("Fa-fa Homework number 2");

		// Prefix increment
		k = printK();
		System.out.println(++k);

		// Postfix increment
		k = printK();
		System.out.println(k++);

		// Postfix increment plus k = 17
		k = printK();
		System.out.println(k++ + k);

		// 50-- = 50, then 50 - 16 = 34
		k = printK();
		int f = 50;
		System.out.println(f-- - k);

		// multiplication k^2
		k = printK();
		System.out.println(k * k);

		// division result will be rounded to an integer 16 / 3 =5.33 =5 integer
		k = printK();
		System.out.println(k / 3);

		// getting the remainder of the division of two numbers 16%3 = 5.33; 5*3=15+1=16, so answer = 1
		k = printK();
		System.out.println(k % 3);

		// boolean operation firstly we got postfix = 16 and then we got prefix = 18 and result: true
		k = printK();
		System.out.println(k++ < ++k);

		Scanner scanner = new Scanner(System.in);
		getUserName(scanner.nextLine());


	}

}
