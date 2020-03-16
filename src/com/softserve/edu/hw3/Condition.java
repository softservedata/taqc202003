package com.softserve.edu.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Condition {

	public static void selectionSort(double[] arr) {
		// http://study-java.ru/uroki-java/urok-11-sortirovka-massiva/

		for (int i = 0; i < arr.length; i++) {
			double min = arr[i];
			int min_i = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					min_i = j;
				}
			}
			if (i != min_i) {
				double tmp = arr[i];
				arr[i] = arr[min_i];
				arr[min_i] = tmp;
			}
		}
	}

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double aa = 1;
		double dd = 1;

		System.out.println("Homework #3:");
		System.out.println("=====3.1 (revers):=====");

		int[] arr1 = new int[2];

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("First number: ");
			arr1[0] = sc.nextInt();
			System.out.print("Second number: ");
			arr1[1] = sc.nextInt();
			System.out.println("reverse numbers:");
			for (int i = arr1.length - 1; i >= 0; i--) {
				System.out.println(arr1[i] + "  ");
			}

			System.out.println("=====3.2 (sort):======");
			double[] arr2 = new double[3];

			System.out.print("First number: ");
			arr2[0] = sc.nextDouble();
			System.out.print("Second number: ");
			arr2[1] = sc.nextDouble();
			System.out.print("Third number: ");
			arr2[2] = sc.nextDouble();

			System.out.print("\n");
			System.out.println("Sorting numbers:");
			selectionSort(arr2);
			for (int i = 0; i < arr2.length; i++) {

				System.out.print(arr2[i] + "  ");
			}

			System.out.println("=====3.3 (odd numbers):======");
			int[] arr3 = new int[4];

			System.out.print("First number: ");
			arr3[0] = sc.nextInt();
			System.out.print("Second number: ");
			arr3[1] = sc.nextInt();
			System.out.print("Third number: ");
			arr3[2] = sc.nextInt();
			System.out.print("Forth  number: ");
			arr3[3] = sc.nextInt();

			System.out.println("Checking numbers...ODD numbers are:");
			int odd = 0;
			for (int i = 0; i < arr3.length; i++) {
				if (((arr3[i] % 2) != 0) && (arr3[i] != 0)) {
					System.out.println(arr3[i]);
					odd++;
				}
			}
			if (odd == 0) {
				System.out.println("thre are no entered odd numbers");
			}

		} catch (Exception e) {
			System.out.println(" Error Found !!");
		}

		System.out.println("=====3.4 (Product!):======");

		List<Product> productList = new ArrayList<>();
		Product prod1 = new Product("Bread", 22.2);
		productList.add(prod1);
		Product prod2 = new Product("Rice", 54.4);
		productList.add(prod2);
		Product prod3 = new Product("Milk", 19.2);
		productList.add(prod3);
		Product prod4 = new Product("Eggs", 27.4);
		productList.add(prod4);

		double maxPrice = productList.get(0).getProdPrice();
		String textProduct = productList.get(0).getProdName();

		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getProdPrice() > maxPrice) {
				maxPrice = productList.get(i).getProdPrice();
				textProduct = productList.get(i).getProdName();
			}

		}
		System.out.printf("The  product with the highest price is: " + textProduct + " it costs: " + maxPrice);

	}

}
