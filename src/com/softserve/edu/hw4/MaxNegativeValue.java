package com.softserve.edu.hw4;

public class MaxNegativeValue {
    public static void main(String args[]) {
        int[] MyArray = new int[]{5, -4, 15, -25, 4, -3, 21, 10, -15, 10};
        int i;
        int max = MyArray[1];
        for (i = 0; i < MyArray.length; i++) {
            if (MyArray[i] < 0 ) {
                if (MyArray[i] > max) {
                    max = MyArray[i];
                }
            }
        }

        System.out.println("Max value of array is:" + max);
    }
    }

