package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Appl {
    public static void main(String[] args) throws IOException {
        java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Введіть два цілих числа:");
        String line = in.readLine();
        String[] numbers = line.split(" ");
        System.out.println(numbers[1] + " " + numbers[0]);

        System.out.println("2. Введіть три дійсних числа:");
        line = in.readLine();
        numbers = line.split(" ");
        Double[] doubles = {Double.valueOf(numbers[0]), Double.valueOf(numbers[1]), Double.valueOf(numbers[2])};
        Arrays.sort(doubles);
        System.out.println(doubles[0] + " " + doubles[1] + " " + doubles[2]);

        System.out.println("3. Введіть 4 числа:");
        line = in.readLine();
        numbers = line.split(" ");

        for (String number : numbers) {
            Integer integer = Integer.valueOf(number);
            if (integer % 2 != 0) System.out.print(number+" ");
        }

        System.out.println("4. екземпляри типу Product:");
        Product product1 = new Product("Хліб", 1.1);
        Product product2 = new Product("Масло", 4.1);
        Product product3 = new Product("Ікра", 7.1);
        Product product4 = new Product("Петрушка", 0.2);

        Product[] products = {product1, product2, product3, product4};
        Double max = 0.0;
        for (Product product : products) {
            if (product.getPrice() >= max) {
                max = product.getPrice();
            }
        }

        for (Product product : products) {
            if (product.getPrice() == max) {
                System.out.println(product.getName() + " ");
            }
        }
    }
}
