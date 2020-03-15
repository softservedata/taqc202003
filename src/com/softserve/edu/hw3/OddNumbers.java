package com.softserve.edu.hw3;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        System.out.println("Enter four integer numbers, press enter after each");
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        n4 = in.nextInt();

        if (n1 % 2 == 1)
            System.out.println("Odd number is " + n1);

        if (n2 % 2 == 1)
            System.out.println("Odd number is " + n2);

        if (n3 % 2 == 1)
            System.out.println("Odd number is " + n3);

        if (n4 % 2 == 1)
            System.out.println("Odd number is " + n4);

    }

    }


