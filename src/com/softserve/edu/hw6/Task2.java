package com.softserve.edu.hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		Random random = new Random();
		
		
		for (int i = 0; i < random.nextInt(55) ; i++) {
			list1.add(random.nextInt(10));
		}
		for (int j = 0; j < random.nextInt(55) ; j++) {
			list2.add(random.nextInt(10));
		}
		System.out.println("\nFirst list:");
		System.out.println(list1);
		System.out.println("\nSecond list:");
		System.out.println(list2);
		
		
		
		Set<Integer> sameNumbers = new TreeSet<>();
		for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    sameNumbers.add(list1.get(i));
                }
            }
        }
		System.out.println("\n The identical numbers from both lists:");
		if (sameNumbers.isEmpty()) {
			System.out.println("There are no identical numbers - generated lists are different");
		} else {
			System.out.println(sameNumbers);
		}
		
		
	}

}