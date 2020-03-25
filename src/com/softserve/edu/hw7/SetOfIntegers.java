package com.softserve.edu.hw7;


import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfIntegers implements Comparator<SetOfIntegers>  {
		public static void main(String[] args) {
		
		 
		Set<Integer> set = new TreeSet<Integer>();
		Set<Integer> set1 = new TreeSet<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Integer k = random.nextInt(10);
			Integer l =random.nextInt(10);
			set.add(k);
			set1.add(l);
		}
		System.out.println(set);
		System.out.println(set1);
	}

		@Override
		public int compare(SetOfIntegers o1, SetOfIntegers o2) {
			// TODO Auto-generated method stub
			return 0;
		}
}