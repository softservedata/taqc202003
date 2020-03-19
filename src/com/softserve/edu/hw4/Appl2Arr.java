package com.softserve.edu.hw4;



public class Appl2Arr {
	
	
		
		public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5,6,7,8,9};
		int amount = 0;{
			int sum =0;
		for (int a = 0; a<arr.length; a++) {
			if (a %2==0 ) { sum= sum +arr[a] ; }
		}
		System.out.println("Sum = "  +sum  );

	}
		}}


