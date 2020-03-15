package com.softserve.edu.hw3;

import java.util.Scanner;

public class Appl {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print(("x="));
		int x = sc.nextInt();
		System.out.print(("y="));
		int y = sc.nextInt();
		System.out.println("x=" +y );
		System.out.println("y=" +x );
		sc.close();
		
	}
}