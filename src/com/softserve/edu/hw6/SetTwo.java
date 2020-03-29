package com.softserve.edu.hw6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class SetTwo {

// case1
	
	public static void main(String[] args) {

		Set<String> a = new HashSet<>();
		a.add(new String("first"));
		a.add(new String("second"));
		a.add(new String("third"));
		a.add(new String("fourth"));
		a.add(new String("first"));
		a.add(new String("sixth"));
		a.add(new String("seventh"));
		a.add(new String("eighth"));
		a.add(new String("original"));
//		System.out.println("my new a.set = " + a);

		Set<String> b = new HashSet<>();
		b.add(new String("best"));
		b.add(new String("normal"));
		b.add(new String("original"));
		b.add(new String("first"));
		b.add(new String("bad"));
		b.add(new String("worse"));
		b.add(new String("seventh"));
		b.add(new String("funniest"));
		b.add(new String("non"));
//		System.out.println("me b.set = " + b);

		List<String> list = new ArrayList<>();
		list.addAll(a);
		list.retainAll(b);

		if (!list.isEmpty()) {
			System.out.println("My new list " + list);
		} else {
			System.out.println("No matching elements found ((");
		}

	}
}
