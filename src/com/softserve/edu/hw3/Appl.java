package com.softserve.edu.hw3;
import java.util.Scanner;

public class Appl {
	
	static boolean dividesByTwo(Object a ){
		Scanner sc=new Scanner (System.in);
		System.out.print(("a="));
		long a1 = sc.nextInt();
		return (a1 %2==0);
	}	
 
	public static void main(String[] args){
		System.out.println(dividesByTwo( "a1"));
	}
}
	
