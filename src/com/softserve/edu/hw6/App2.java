package com.softserve.edu.hw6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App2 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(1);
		list1.add(3);
		list1.add(1);
		list1.add(4);
		list1.add(2);
		//
		List<Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(4);
		list2.add(3);
		list2.add(1);
		list2.add(4);
		list2.add(2);
		//
		Set<Integer> set1 = new HashSet<>(list1);
		System.out.println("set1: " + set1);
		Set<Integer> set2 = new HashSet<>(list2);
		System.out.println("set2: " + set2);
		//
		System.out.println("is equal: " + set1.equals(set2));
	}
}
