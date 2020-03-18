package com.softserve.edu.hw3;

import java.util.*;

public class HW3 {

    //change order of entered numbers
    public static void swapNumbers(int i, int j) {
        int n;
        n = i;
        i = j;
        j = n;
        System.out.println("Swapped numbers: " + i + " " + j);
    }

    //sort entered numbers in ascending order
    public static void sortNumbersAsc(double x, double y, double z) {
        System.out.print("Numbers in ascending order: ");
        if (x >= y) {
            if ((x >= z)&&(y >= z)) {
                System.out.println(z + " " + y + " " + x);
            }
            else if ((x <= z)&&(y <= z)) {
                System.out.println(y + " " + x + " " + z);
            } else {
                System.out.println(y + " " + z + " " + x);
            }
        } else if (x < y) {
            if ((x <= z)&&(y <= z)) {
                System.out.println(x + " " + y + " " + z);
            }
            else if ((x <= z)&&(y >= z)) {
                System.out.println(x + " " + z + " " + y);
            } else {
                System.out.println(z + " " + x + " " + y);
            }
        }
    }

    //find odd numbers among the entered
    public static void oddNumbers (int[] arr) {
        String res = "";
        String el;
        for (int i = 0; i < arr.length; i++) {
            el = (arr[i] != 0) && (arr[i]%2 != 0) ? arr[i] + " ": ""; //according to Wiki, zero is an even number
            res = res + el;
        }
        if (res.length() != 0) {
            System.out.println("Odd number(s): " + res);
        } else {
            System.out.println("All numbers are even.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Task 1");
            System.out.print("i = ");
            int i = sc.nextInt();
            System.out.print("j = ");
            int j = sc.nextInt();
            swapNumbers(i, j);

            System.out.println("Task 2");
            System.out.print("x = ");
            int x = sc.nextInt();
            System.out.print("y = ");
            int y = sc.nextInt();
            System.out.print("z = ");
            int z = sc.nextInt();
            sortNumbersAsc(x, y, z);

            System.out.println("Task 3");
            System.out.print("a = ");
            int a = sc.nextInt();
            System.out.print("b = ");
            int b = sc.nextInt();
            System.out.print("c = ");
            int c = sc.nextInt();
            System.out.print("d = ");
            int d = sc.nextInt();
            int[] arr = {a, b, c, d};
            oddNumbers(arr);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        System.out.println("Task 4");
        //create list of products
        Product[] products = {
                new Product("Milka whole hazelnut chocolate bar 270g", 5.49),
                new Product("Milka Oreo Sandwich 92g", 4.19),
                new Product("Milka Choco Cookies", 2.19),
                new Product("Milka Funny Easter egg ladybug 50 g", 1.69)
        };
        //find max price
        double max = 0;
        for (Product product : products) {
            if (product.getPrice() == max || product.getPrice() > max) {
                max = product.getPrice();
            }
        }
        //select products with max price
        System.out.println("Product(s) with max price:");

        for (Product product : products) {
            if (Objects.equals(product.getPrice(), max)) {
                System.out.println(product.toString());
            }
        }
    }
}
