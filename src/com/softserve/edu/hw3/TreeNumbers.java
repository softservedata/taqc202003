package com.softserve.edu.hw3;

import java.util.Scanner;

public class TreeNumbers {
	private int key; // =0;
	
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("a=");
			a = sc.nextInt();
			System.out.print("b=");
			b = sc.nextInt();
			System.out.print("c=");
			c = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Scanner Error Found.");
			// e.printStackTrace();
		}
		//
		System.out.println("Original a=" + a + "  b=" + b + "  c=" + c);
		//
		if (a < b) {
			if (b < c) {
				System.out.println("a=" + a + "  b=" + b + "  c=" + c);
			} else {
				if (a < c) {
					System.out.println("a=" + a + "  c=" + c + "  b=" + b);
				} else {
					System.out.println("c=" + c + "  a=" + a + "  b=" + b);
				}
			}
		} else {
			if (c < b) {
				System.out.println("c=" + c + "  b=" + b + "  a=" + a);
			} else {
				if (a < c) {
					System.out.println("b=" + b + "  a=" + a + "  c=" + c);
				} else {
					System.out.println("b=" + b + "  c=" + c + "  a=" + a);
				}
			}
		}
		//
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
