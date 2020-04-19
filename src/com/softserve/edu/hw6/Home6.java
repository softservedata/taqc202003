package com.softserve.edu.hw6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Home6 {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>(10);
		s1.add("Item1");
		s1.add("Item2");
		s1.add("Pen");
		s1.add("Item4");
		s1.add("Item5");
		s1.add("Air");
		s1.add("Item7");
		s1.add("Item8");
		s1.add("Child");
		s1.add("Item10");
		
		Set<String> s2 = new HashSet<>(10);
		s2.add("Point1");
		s2.add("Point2");
		s2.add("Air");
		s2.add("Point4");
		s2.add("Point5");
		s2.add("Point6");
		s2.add("Pen");
		s2.add("Point8");
		s2.add("Child");
		s2.add("Point10");
		
		List<String> merge = new ArrayList<String>( );
		
		Iterator iterator = s1.iterator();
		  
		while(iterator.hasNext()){ 
			String element1 = (String) iterator.next(); 
			
			Iterator iterator2 = s2.iterator();
			  
			while(iterator2.hasNext()){ 
				String element2 = (String) iterator2.next(); 
				if (element1==element2 ) {
					merge.add(element1);
				}	
			}	
	        
		}
		for (int i = 0; i < merge.size(); i++) {
        	
       	 System.out.println(merge.get(i));
       }

		List<Integer> list1 = new ArrayList<Integer>( );
		list1.add(10);
		list1.add(2);
		list1.add(100);
		list1.add(0);
		list1.add(7);
		list1.add(5);
		List<Integer> list2 = new ArrayList<Integer>( );
		list2.add(0);
		list2.add(90);
		list2.add(100);
		list2.add(11);
		list2.add(7);
		if (list1.size() <= list2.size() ) {
			System.out.println(list2.containsAll(list1));
		}	
		if (list1.size() > list2.size() ) {
			System.out.println(list1.containsAll(list2));
		}	

	}

}
