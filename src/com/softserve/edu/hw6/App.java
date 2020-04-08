package com.softserve.edu.hw6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("abc");
		list1.add("123");
		list1.add("qwerty");
		list1.add("abc");
		list1.add("asd");
		System.out.println("list1: " + list1);
		//
		List<String> list2 = new ArrayList<>();
		list2.add("abcd");
		list2.add("123");
		list2.add("erty");
		list2.add("abc");
		list2.add("werty");
		System.out.println("list2: " + list2);
		//
		Set<String> common = new HashSet<>(list1);
		common.addAll(list2);
		System.out.println("common: " + common);
		//
		Set<String> set1 = new HashSet<>(list1);
		set1.removeAll(list2);
		System.out.println("set1: " + set1);
		//
		Set<String> set2 = new HashSet<>(list2);
		set2.removeAll(list1);
		System.out.println("set2: " + set2);
		//
		common.removeAll(set1);
		common.removeAll(set2);
		System.out.println("Result: " + common);
	}
}
