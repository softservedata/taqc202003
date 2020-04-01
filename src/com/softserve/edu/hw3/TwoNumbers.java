package com.softserve.edu.hw3;

import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("a=");
            a = scanner.nextInt();
            System.out.print("b=");
            b = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Scanner Error Occurred.");
            // e.printStackTrace();
        }
        //
        System.out.println("Original a=" + a + "  b=" + b);
        //
        // int c = a;
        // a = b;
        // b = c;
        //
        a = a + b;
        b = a - b;
        a = a - b;
        //
        System.out.println("New a=" + a + "  b=" + b);
    }
}