package com.softserve.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		System.out.println("My first program!");
		//
		for (int i = 0; i < args.length; i++) {
			System.out.println("argument i = " + i + "  value = " + args[i]);
		}
		//
		byte b = 49;
		System.out.println("b = " + b + "  b as Char = " + (char) b);
		//
		int x = 0;
		int y = 10;
		double a = 1;
		double d = 1;
		/*-
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("x=");
			String text = br.readLine();
			//x = Integer.parseInt(text);
			x = Integer.valueOf(text);
			System.out.print("y=");
			y = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Error Found.");
			// e.printStackTrace();
		}
		System.out.println("x / y = " + (double)( x / y));
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//
		/*-
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		x = sc.nextInt();
		System.out.print("y=");
		y = sc.nextInt();
		sc.close();
		System.out.println("x / y = " + ( x % y));
		*/
		//
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("a=");
			a = sc.nextDouble();
			System.out.print("d=");
			d = sc.nextDouble();
		} catch (Exception e) {
			System.out.println("Scanner Error Found!");
			// e.printStackTrace();
		}
		System.out.println("a / d = " + (a / d));
	}

}
