package com.softserve.edu.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConditionsArray {

    public static void main(String[] args) {
        System.out.println("*** Home Work 3 ***");
        System.out.println("Task ---1---Reverse Order---");
        int[] arrayInt = new int[2];
        Scanner scanner = new Scanner(System.in);
        try {
            int a;
            System.out.print("Enter first number: ");
            a = scanner.nextInt();
            arrayInt[0] = a;
            int b;
            System.out.print("Enter second number: ");
            b = scanner.nextInt();
            arrayInt[1] = b;
            int iterator = 2;
            for (int i = 1; i >= 0; i--) {
                System.out.println("The " + iterator-- + " number was: " + arrayInt[i]);
            }
            double[] arrayDouble = new double[3];
            System.out.println("Task ---2---Sorting array ascending order-----");
            double c;
            System.out.print("Enter first number: ");
            c = scanner.nextDouble();
            arrayDouble[0] = c;
            double d;
            System.out.print("Enter second number: ");
            d = scanner.nextDouble();
            arrayDouble[1] = d;
            double e;
            System.out.print("Enter third number: ");
            e = scanner.nextDouble();
            arrayDouble[2] = e;
            for (int i = 0; i < arrayDouble.length; i++) {
                for (int j = 0; j < arrayDouble.length - 1; j++) {
                    if (arrayDouble[j] > arrayDouble[j + 1]) {
                        double temp = arrayDouble[j];
                        arrayDouble[j] = arrayDouble[j + 1];
                        arrayDouble[j + 1] = temp;
                    }
                }
                System.out.println(arrayDouble[i]);

                //            Arrays.sort(arrayDouble);
                //            System.out.println(arrayDouble[i]);
            }

            System.out.println("Task ---3---Display only ood numbers -----");
            int[] intArrayTwo = new int[4];
            int f;
            System.out.print("Enter first number: ");
            f = scanner.nextInt();
            intArrayTwo[0] = f;
            int g;
            System.out.print("Enter second number: ");
            g = scanner.nextInt();
            intArrayTwo[1] = g;
            int k;
            System.out.print("Enter third number: ");
            k = scanner.nextInt();
            intArrayTwo[2] = k;
            int l;
            System.out.print("Enter forth number: ");
            l = scanner.nextInt();
            intArrayTwo[3] = l;

            int count = 0;
            for (int i = 0; i < intArrayTwo.length; i++) {
                if (intArrayTwo[i] % 2 != 0 && intArrayTwo[i] != 0) {
                    System.out.printf("Odd number is: %d\n", intArrayTwo[i]);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("All numbers are even");
            }
        } catch (Exception ex) {
            System.out.println("Something wrong! Maybe you entered wrong data type!");
        }

        System.out.println("---Task 4 ---Create new class Product and display the product with max price----");
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product("Milka", 10.5);
        productList.add(product1);
        Product product2 = new Product("Bounty", 6.2);
        productList.add(product2);
        Product product3 = new Product("Twix", 3.8);
        productList.add(product3);
        Product product4 = new Product("Nuts", 8.0);
        productList.add(product4);
        double maxPrice = productList.get(0).getProductPrice();
        String textProduct = productList.get(0).getProductName();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductPrice() > maxPrice) {
                maxPrice = productList.get(i).getProductPrice();
                textProduct = productList.get(i).getProductName();
            }

        }
        System.out.printf("The most expensive product is: %s and it costs: %s $", textProduct, maxPrice);

        scanner.close();

    }
}
