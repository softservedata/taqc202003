package com.softserve.edu.hw7;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String string = "pen pineapple APPLE Pen";
        String substring = "App";

        System.out.println("Original string: " + string);
        System.out.println("Search query: " + substring);

        string = string.toLowerCase();
        substring = substring.toLowerCase();

        List<String> substrings;
        List<String> result = new ArrayList<>();
        int count = 0;

        substrings = Arrays.asList(string.split(" "));

        for (String s: substrings) {
            if (!s.isEmpty() && !substring.isEmpty() && s.contains(substring)) {
                count++;
                result.add(s);
            }
        }

        if (count != 0) {
            System.out.println("Following words contain search query: ");
            for (String r: result) {
                System.out.println(r);
            }
        } else {
            System.out.println("No matches found.");
        }
        /*
        Output:
        Original string: pen pineapple APPLE Pen
        Search query: App
        Following words contain search query:
        pineapple
        apple

        Original string: pen pineapple APPLE Pen
        Search query: ppap
        No matches found.
         */
    }
}
