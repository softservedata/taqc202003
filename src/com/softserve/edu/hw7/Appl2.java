package com.softserve.edu.hw7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Appl2 {
	public static void main(String[] args) {
		String[] lenNames = { "ab", "efg", "qwerty",
				"123456789012345", "1234567890123456" };
		String[] symNames = { "abcd", "abcd1234",
				"1234", "abc_", "___", "__1" };
		String[] errNames = { "a#cd", "abcd 1234",
				"12*34", "abc+", "!!!!", "~~~~" };
		//
		List<String[]> names = new ArrayList<>();
		names.add(symNames);
		names.add(lenNames);
		names.add(errNames);
		//
		String pattern = "\\w{3,15}";
		Pattern p = Pattern.compile(pattern);
		for (String[] arr : names) {
			for (String nickname : arr) {
				System.out.print("nickname: " + nickname + " is ");
				if (p.matcher(nickname).matches()) {
					System.out.println("valid");
				} else {
					System.out.println("INVALID");
				}
			}
		}
	}

}
