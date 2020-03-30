package com.softserve.edu.hw7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {

	private static String UsernameValidation(String username) {
		String pattern = "\\w{3,15}";
		String result = "";

		if (username.matches(pattern)) {
			result = "- username is valid! ";
		} else {
			result = "- incorect username";
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\t ==== HoveWork#7.1======");
		System.out.println("Please enter characters (space separated):");
		String char1 = sc.nextLine();

		// System.out.println("orig array: " + char1);
		System.out.println("Please enter characters for searching:");
		String char2 = sc.nextLine();
		System.out.println("Substrings that match the search:");

		String[] arr1 = char1.split(" ");
		int i = 0;
		for (String split1 : arr1) {

			if (split1.contains(char2)) {
				System.out.println(split1);
				i++;
			}

		}
		if (i == 0) {
			System.out.println("Sorry - thre're no characters that match the search");
		}

		//

		System.out.println("\n\t ==== HoveWork#7.2======");
		System.out.println("Please enter usernames for validation (SPACE separated):");
		String usernames = sc.nextLine();
		System.out.println("Checking usernames provided... See the details below:");
		sc.close();
		
		String[] arr2 = usernames.split(" ");
		for (String split2 : arr2) {
			System.out.println("[" + split2 + "] " + UsernameValidation(split2));
		}

	}

}
