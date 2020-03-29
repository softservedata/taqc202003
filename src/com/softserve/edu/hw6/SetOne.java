package com.softserve.edu.hw6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetOne {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8, 12, 33, 44, 0, 1, 6);
		System.out.println("My new list1 = " + list1);

		List<Integer> list2 = new ArrayList<>();
		Collections.addAll(list2, 17, 5, 18, 11, 23, 15, 666, 8);
		System.out.println("My new list1 = " + list2);

		for (int a = 0; a < list1.size(); a++) {
			for (int b = 0; b < list2.size(); b++) {
				if (list1.get(a) == (list2.get(b))) {
					System.out.println("The matching elements are: " + list1.get(a));
				}
			}
		}
	}
}
