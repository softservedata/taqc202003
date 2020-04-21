package com.softserve.edu.hw2;

import java.util.Scanner;

public class Appl {

    public static int k = 16;

    public static void main (String[] args){

        /* add 1 after iteration
         */
        k = k++;
        System.out.println("k++ = "+k);

        /* add 1 before iteration
         */
        k = ++k;
        System.out.println("++k = "+k);

        /* add k value before iteration and add 1 after iteration
         */
        k = k+++k;
        System.out.println("k+++k = "+k);

        /* subtract k value from j value before iteration and subtract 1 after iteration
         */
        int j = 50;
        k = j---k;
        System.out.println("50---k = "+ k);

        /* multiple k by k
         */
        k = k*k;
        System.out.println("k*k = "+ k);

        /* divide k by 3
         */
        k = k / 3;
        System.out.println("k / 3 = "+k);

        /* returns reminder of division k by 3
         */
        k = k % 3;
        System.out.println("k % 3 = "+k);

        /* returns boolean value after comparison k value and k+1
         */
        boolean isSmaller = k++<++k;
        System.out.println("k++<++k = "+isSmaller);


        /*
        Print "What is your name?"
        Read the name
        Print "Hello <name>"
         */
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello "+name);





    }
}
