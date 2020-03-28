package com.softserve.edu.hw6;

import java.util.ArrayList;
import java.util.List;

/**
 *  Задати два списки, які містять цілі значення. Кількість елементів у списках
 *  може бути різною, а самі елементи можуть дублюватися.
 *  Вияснити, чи контент елементів у списках співпадає.
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(0);
        myList.add(68);
        myList.add(168);
        

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(55);
        myList2.add(0);
        myList2.add(168);
        myList2.add(45);
        myList2.add(23);

        for (int element: myList) {
            if (myList2.contains(element)){
                System.out.println("Equal elements: " +element);
            }
        }
    }
}
