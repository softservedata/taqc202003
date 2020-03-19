
package com.softserve.edu.hw4;

public class Appl3 {
    public static void main(String args[]) {
        int[] arr = new int[]{1, -3, 6, -11, 2, -7, 15, -10};
        int i;
        int max = arr[1];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < 0 ) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }

        System.out.println("Max=" + max);
    }
    }