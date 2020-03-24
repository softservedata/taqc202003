package com.softserve.edu.hw6;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        int size1 = random.nextInt(10);
        int size2 = random.nextInt(10);

        for (int i = 0; i < size1; i++) {
            list1.add(random.nextInt(10));
        }

        for (int i = 0; i < size2; i++) {
            list2.add(random.nextInt(10));
        }

        System.out.println("List 1 = " + list1);
        System.out.println("List 2 = " + list2);

        int counter = 0;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (list1.get(i).compareTo(list2.get(j)) == 0) {
                    counter++;
                    //return matching elements and their positions (human readable)
                    System.out.println("Element '" + list1.get(i) + "' on position " + (i + 1) + " in List1 equals to Element '" + list2.get(j) + "' on position " + (j + 1) + " in List2");
                }
            }
        }

        if (counter == 0) {
            System.out.println("No matches found.");
        }

        /*
        Output:

        List 1 = [3, 5, 8, 5, 2, 2, 7, 7, 6]
        List 2 = [4, 5]
        Element '5' on position 2 in List1 equals to Element '5' on position 2 in List2
        Element '5' on position 4 in List1 equals to Element '5' on position 2 in List2

        List 1 = [4, 3]
        List 2 = [7, 1, 9]
        No matches found.
         */
    }
}
