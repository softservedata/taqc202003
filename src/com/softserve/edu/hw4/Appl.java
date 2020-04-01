package com.softserve.edu.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Appl {
        public static void main(String[] args) {


            Integer numbers[] = new Integer[10];
            int j = 1;
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number #1" + j++ + " : ");
                numbers[i] = Integer.parseInt(sc.nextLine());
            }

            System.out.println("numbers= " + Arrays.toString(numbers));



            System.out.println("Task 1: calculate array elements sum");
            int sum = 0;
            for (int num : numbers) {
                if (num > 0) {
                    sum = sum + num;
                }
            }
            System.out.println("Sum is " + sum);

            System.out.println("Task 2: find negative");

            int countmin = 0;
            int min = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0 && numbers[i] < min) {
                    min = numbers[i];
                    countmin++;
                }
            }
            if (countmin == 0) {
                System.out.println("There are no negative numbers in the array");
            } else {
                System.out.println("Max negative number is: " + min);
            }


        }
}
