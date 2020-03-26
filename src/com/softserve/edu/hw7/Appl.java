package com.softserve.edu.hw7;

import java.util.Set;
import java.util.TreeSet;

public class Appl {
	public static void main(String[] args) {
		Set<Numbers>firstNumbers= new TreeSet<Numbers>(new Numbers.NameComparator()) ;
		{	
			add(new Numbers("One"));
			add(new Numbers("Two"));
			add(new Numbers("Three"));
			add(new Numbers("Four"));
			add(new Numbers("Five"));
			add(new Numbers("Six"));
			add(new Numbers("Seven"));
			add(new Numbers("Eight"));
		}
		
	}

	private static void add(Numbers numbers) {
		// TODO Auto-generated method stub
		System.out.println(numbers);
	}
	
		 
	}
