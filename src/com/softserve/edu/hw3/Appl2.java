package com.softserve.edu.hw3;

import java.util.Scanner;

public class Appl2 {
	public static void main(String[] args) {
		int	a=0;
		int b=0;
		int c=0;
		int d=0;
		Scanner sc = new Scanner(System.in);{
			System.out.print("a=");
			a = sc.nextInt();
			System.out.print("b=");
			b = sc.nextInt();
			System.out.print("c=");
			c = sc.nextInt();
		}
		if (b < a) {
			d = a;
			a = b;
			b = d;
		}
		if (c < b) {
			d = c;
			c = b;
			b = d;
		}
		if (b < a) {
			d = a;
			a = b;
			b = d;
		}
		System.out.println("Order = " + a + "  " + b + "  " + c);
	}
}
