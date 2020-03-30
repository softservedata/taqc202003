package com.softserve.edu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppCollect {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add("Second22 element");
		list.add("Second23 element");
		System.out.println("Origin list = " + list.toString());
		list.add(0, "One more first element");
		System.out.println("Next list = " + list);
		System.out.println("before remove list.get(1) = " + list.get(1));
		//
		list.remove(0);
		System.out.println("after remove list.get(1) = " + list.get(1));
		/*-
		for (String current : list) {  // inner iterator
			if (current.contains("First")) {
				list.remove(current);
			}
			System.out.println("current = " + current);
		}
		*/
		//
		/*-
		//int n = list.size();
		//for (int i = 0; i < n; i++) {
		for (int i = 0; i < list.size(); i++) {
			//if (list.get(i).contains("First")) {
			if (list.get(i).contains("23")) {
				list.remove(i);
			}
			System.out.println("i = " + i + " list[i] = " + list.get(i));
		}
		*/
		//
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("element = " + element);
			if (element.contains("23")) {
				iterator.remove();
			}
		}
		System.out.println("list = " + list);
	}
}
