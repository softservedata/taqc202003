package com.softserve.edu.hw4;

public class ApplArr {
	public static void main(String[] args) {
	int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
	int amount = 0;{
		int sum =0;
	for (int a = 0; a<arr.length; a++) {
		if (a %2==0 ) { sum+= arr[a]; }
	}
	System.out.println("Sum of values = " + sum  );

}
}
}