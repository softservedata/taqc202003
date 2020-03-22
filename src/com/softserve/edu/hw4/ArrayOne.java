package com.softserve.edu.hw4;

public class ArrayOne {

	public static void main(String[] args) {
		int [] array = new int [] {1,2,3,-4,5,6,7,8,9,-10};
		
		int sum = 0;
	
		for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
            }
		}
		System.out.println(sum + "  is the sum of even numbers");
			
		int [] array1 = new int [] {-2,3,4,5,6,7,-9,-11,88, 9876};
		int maxValue = array[0];
		int i;
		
		for (i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                maxValue = array1[i];
                break;
            }
        }
	        for (i = 0; i < array1.length; i++) {
	            if (array1[i] < 0 && array1[i] > maxValue)
	                maxValue = array1[i];
	        }
	        if (maxValue == 0)
	            System.out.println("There are no negative elements");
	        else
	            System.out.println(maxValue + " is the max. of negative");
	    }
}

