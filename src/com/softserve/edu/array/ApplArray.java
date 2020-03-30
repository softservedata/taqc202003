package com.softserve.edu.array;

import java.util.Scanner;

public class ApplArray {
	
	public static void main(String[] args) {
		/*-
		String[] arr = new String[5];
		arr[0] = "January";
		arr[1] = "February";
		arr[2] = "March";
		arr[3] = "April";
		arr[4] = new String("May");
		System.out.println("arr = " + Arrays.toString(arr));
		*/
		//
		/*-
		int[] numbers = { 5, 6, 8, 3, 5, 7, 9 };
		System.out.println("Origin Array:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		Arrays.sort(numbers);
		System.out.println("\nSorted Array:");
		//		for (int i = 0; i < numbers.length; i++) {
		//			System.out.print(numbers[i] + " ");
		//		}
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		*/
		//
		/*-
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Input number: ");
			n = Integer.parseInt(sc.nextLine());
			if (n < 0) {
				//break;
				continue;
			}
			sum = sum + n;
			// sum += n;
		}
		System.out.println("n=" + n + " sum=" + sum);
		sc.close();
		*/
		//
		int[] arr = {2, -5, 7, -4, 8, 1};
		int max = arr[0];
		int imax = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] > max) {
				max = arr[i];
				imax = i;
			}
			i++;
		}
		System.out.print("Maximum = " + max 
				+" is in " + imax + " place");
		//
	}
}
