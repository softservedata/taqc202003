package com.softserve.edu.hw2;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args)   {
        int k = 16;

        System.out.println("Value of k++ = " + (k++)); //k = 16
        System.out.println("Value of ++k = " + (++k)); //k = 18
        System.out.println("Value of k+++k = " + (k + ++k)); //k = 18 + 19 = 37
        System.out.println("Value of 50---k = " + (50 - --k)); //k = 50 - 18 = 32
        System.out.println("Value of k*k = " + (k*k)); //k = 18 * 18 = 342
        System.out.println("Value of k/3 = " + (k/3)); //k = 18 / 3 = 6
        System.out.println("Value of k%3 = " + (k%3)); //k = 18 % 3 = 0
        System.out.println("Value of k++<++k = " + (k++ < ++k)); // 18 < 20

        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
