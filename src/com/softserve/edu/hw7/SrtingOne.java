package com.softserve.edu.hw7;

import java.util.Scanner;

public class SrtingOne {

	public static void main(String[] args) {

		System.out.println("Type a few words devided with a space bar... ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String[] arr = str1.split(" ");

		System.out.println("Type a symbols to performe a search: ");
		Scanner sc2 = new Scanner(System.in);
		String str2 = sc2.nextLine();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].toLowerCase();
			if (arr[i].contains(str2.toLowerCase())) {
				System.out.println(" matches: " + arr[i]);

			}
		}

	}
}
