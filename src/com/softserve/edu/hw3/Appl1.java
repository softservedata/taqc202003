package com.softserve.edu.hw3;

import java.util.Scanner;

public class Appl1 {
	public static void main(String[] args) {
	int	a=0;
	int b=0;
	
	Scanner sc = new Scanner(System.in);{
		System.out.print("a=");
		a = sc.nextInt();
		System.out.print("b=");
		b = sc.nextInt();
	}
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print ("Values a=" +a+ "b=" +b);
	
	}
}
