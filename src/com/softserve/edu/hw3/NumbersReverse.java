package com.softserve.edu.hw3;

import java.util.Scanner;

public class NumbersReverse {

    public static void main(String[] args) {
        int n1, n2;
        int reverse1 = 0, reverse2 = 0;
        System.out.println("Enter two integer numbers, press enter after each");
        Scanner in = new Scanner( System.in);

        n1 = in.nextInt();
        n2 = in.nextInt();

        while(n1 != 0)
        {
            reverse1 = reverse1 * 10;
            reverse1 = reverse1 + n1 % 10;
            n1 = n1 / 10;
        }

        while(n2 != 0)
        {
            reverse2 = reverse2 * 10;
            reverse2 = reverse2 + n2 % 10;
            n2 = n2 / 10;
        }

        String str1 = Integer.toString(reverse1);
        String str2 = Integer.toString(reverse2);

        System.out.println("Reverse of two integers = " + str2 + str1);


    }

}
