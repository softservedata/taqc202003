package com.softserve.edu.hw4;

public class SumPositiveNumbers {
    public static void main(String args[]) {
        int[] MyArray = new int[]{5, -4, 15, -25, 4, -3, 21, 10, -15, 10};
        int i;
        int sum = 0;
        for (i = 0; i < MyArray.length; i++) {
            if (MyArray[i]>0 ) {
                sum += MyArray[i];
            }
        }
        System.out.println("Sum of positive elements is:" + sum);

    }
}
