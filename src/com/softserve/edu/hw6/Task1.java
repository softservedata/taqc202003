package com.softserve.edu.hw6;

import java.util.*;

public class Task1 {

    public static String generateString(int number) {
        String string = "";
        switch (number) {
            case 0 : string = "zero"; break;
            case 1 : string = "one"; break;
            case 2 : string = "two"; break;
            case 3 : string = "three"; break;
            case 4 : string = "four"; break;
            case 5 : string = "five"; break;
            case 6 : string = "six"; break;
            case 7 : string = "seven"; break;
            case 8 : string = "eight"; break;
            case 9 : string = "nine"; break;
        }
        return string;
    }

    public static void main(String[] args) {

        Random random = new Random();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set1.add(generateString(random.nextInt(10)));
        }

        for (int i = 0; i < 10; i++) {
            set2.add(generateString(random.nextInt(10)));
        }

        System.out.println("Set1 = " + set1);
        System.out.println("Set2 = " + set2);

        List<String> commonElements = new ArrayList<>(set1);
        commonElements.retainAll(set2);

        if (!commonElements.isEmpty()) {
            System.out.println("List of common elements = " + commonElements);
        } else {
            System.out.println("There are no common elements.");
        }
        /*
        Output:

        Set1 = [zero, six, seven, five, three, eight]
        Set2 = [zero, nine, four, one, seven, two]
        List of common elements = [zero, seven]

        Set1 = [six, eight]
        Set2 = [five, three]
        There are no common elements.
         */
    }
}
