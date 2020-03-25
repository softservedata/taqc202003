package com.softserve.edu.hw6.t2;

import java.util.ArrayList;
import java.util.List;

public class Appl {

    public static void main(String[] args) {
        System.out.println("---Home work 6---Task 2---");
        List<Integer> firstList = new ArrayList<Integer>() {{
            add(2);
            add(5);
            add(-7);
            add(9);
            add(11);

        }};
        List<Integer> secondList = new ArrayList<Integer>() {{
            add(11);
            add(6);
            add(5);
            add(-7);
        }};
        Element el1 = new Element(firstList);
        Element el2 = new Element(secondList);

        List<Integer> sameListNumbers = el1.sameNumbers(el2.getList());
        System.out.println("List with numbers which are the same= " + sameListNumbers);

        //
        /*-
        List<Integer> firstList = new ArrayList<>();
        firstList.add(99);
        firstList.add(100);
        firstList.add(233);
        firstList.add(124);
        firstList.add(198);
        firstList.add(198);
        firstList.add(124);
        firstList.add(89);

        System.out.println("Elements from first list: " + firstList);

        List<Integer> secondList = new ArrayList<>();
        secondList.add(111);
        secondList.add(-100);
        secondList.add(99);
        secondList.add(124);
        secondList.add(89);
        secondList.add(67);
        secondList.add(100);
        secondList.add(33);
        secondList.add(233);
        System.out.println("Elements from second list: " + secondList);
        for (int i = 0; i < firstList.size(); i++) {
            for (int j = 0; j < secondList.size(); j++) {
                if (firstList.get(i).equals(secondList.get(j))) {
                    System.out.printf("\nElement from first list= %s located on position: %s, " +
                                    "has the same element from second list= %s located on position: %s",
                            firstList.get(i), (i + 1), secondList.get(j), (j + 1));
                }
            }

        }

         */


    }
}
