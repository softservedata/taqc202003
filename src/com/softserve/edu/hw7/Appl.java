package com.softserve.edu.hw7;

import java.util.ArrayList;
import java.util.List;

public class Appl {
	public static void main(String[] args) {
		String mainStr = "abc  efgh   wertyui  qwerty asdfg";
		String subStr = "wert";
		List<String> words = new ArrayList<>();
		for (String word : mainStr.split(" ")) {
			if ((word != null) && (word.length() > 0)) {
				words.add(word);
			}
		}
		System.out.println("words: " + words);
		System.out.println("Contains substring:");
		for (String word : words) {
			if (word.contains(subStr)) {
				System.out.println(word);
			}
		}
	}
}
