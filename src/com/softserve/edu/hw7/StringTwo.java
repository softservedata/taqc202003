package com.softserve.edu.hw7;

import java.util.Scanner;

public class StringTwo {

	public static void main(String[] args) {

		String pattern = "^[_A-Za-z0-9]{3,15}";
		System.out.println("Type a nickname in range 3-16: ");
		System.out.println("nickname1: ");
		Scanner sc = new Scanner(System.in);
		String name1 = sc.nextLine();
		System.out.println("nickname2: ");
		String name2 = sc.nextLine();
		System.out.println("nickname3: ");
		String name3 = sc.nextLine();
		System.out.println("nickname4: ");
		String name4 = sc.nextLine();
		System.out.println("nickname5: ");
		String name5 = sc.nextLine();
		String[] arr = new String[] { name1, name2, name3, name4, name5 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].matches(pattern)) {
				System.out.println("The nickname " + arr[i] + "  is correct ");
			} else {
				System.out.println("The nickname " + arr[i] + " is not valid ");
			}
		}
	}

}
