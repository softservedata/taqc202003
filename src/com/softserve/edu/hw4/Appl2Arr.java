package com.softserve.edu.hw4;

public class Appl2Arr {
	

	public static void main(String[] args) {
		int[] arr = {0, -1, 2, 3, -4, 5, -6, 7, 8};
		int max = arr[0];
		int imax = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] < max) {
				max = arr[i];
				imax = i;
			}
			i++;
		}
		System.out.print("Maximum = " + max);
		System.out.println(" is in " + (imax + 1) + " place");
	}
}
