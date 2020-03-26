package com.softserve.edu.hw7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Appl {
	public static void main(String[] args) {
		Set<Numbers>firstNumbers= new TreeSet<Numbers>(new Numbers.NameComparator()) ;
		{	
			firstNumbers.add(new Numbers("One"));
			firstNumbers.add(new Numbers("Two"));
			firstNumbers.add(new Numbers("Three"));
			firstNumbers.add(new Numbers("Four"));
			firstNumbers.add(new Numbers("Five"));
			firstNumbers.add(new Numbers("Six"));
			firstNumbers.add(new Numbers("Seven"));
			firstNumbers.add(new Numbers("Eight"));
	
		System.out.println("firstNumbers" +firstNumbers);
	
	Set<Numbers>secondNumbers= new TreeSet<Numbers>(new Numbers.NameComparator()) ;
	{	
		secondNumbers.add(new Numbers("Eleven"));
		secondNumbers.add(new Numbers("Two"));
		secondNumbers.add(new Numbers("Three"));
		secondNumbers.add(new Numbers("Six"));
		secondNumbers.add(new Numbers("Five"));
		secondNumbers.add(new Numbers("Nine"));
		secondNumbers.add(new Numbers("Seven"));
		secondNumbers.add(new Numbers("Eight"));
	
	System.out.println(secondNumbers);
	System.out.println("\nThe list of the identical names:");
	List<Numbers> SameNumbers = new ArrayList<>(secondNumbers);
	SameNumbers.retainAll(firstNumbers);
	if (SameNumbers.isEmpty()) {
		System.out.println("No same numbers ");
	} else {
		System.out.println(SameNumbers);
	}
}
		
}
}
}