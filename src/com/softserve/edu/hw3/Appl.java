package com.softserve.edu.hw3;

import java.util.Scanner;

public class Appl {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print(("a="));
		int a = sc.nextInt();
		System.out.print(("b="));
		int b = sc.nextInt();
		System.out.print(("c="));
		int c = sc.nextInt();
		int min= Math.min(a,Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		int mid = Math.min(max,Math.min(a, Math.max(b, c)));
		System.out.print(+min );
		System.out.print(+mid );
		System.out.print(+max );
		sc.close();
	
}}
		