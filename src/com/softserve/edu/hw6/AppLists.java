package com.softserve.edu.hw6;

import java.util.ArrayList;
import java.util.List;

public class AppLists {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(4);
        list1.add(25);
        list1.add(1);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(21);
        list2.add(6);
        list2.add(11);
        list2.add(4);
        list2.add(7);
        list2.add(5);
        System.out.println("list1 " + list1.toString());
        System.out.println("list2 " + list2.toString());

        list1.retainAll(list2);
        System.out.println("Common elements " + list1);


    }


}
