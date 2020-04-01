package com.softserve.edu.hw3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Product shampoo = new Product("Shampoo", 76);
        productList.add(shampoo);
        Product showerGel = new Product("showerGel", 34);
        productList.add(showerGel);
        Product soap = new Product("soap", 12);
        productList.add(soap);
        Product cream = new Product("cream", 92);
        productList.add(cream);


        double maxPrice = productList.get(0).getPrice();
        String productName = productList.get(0).getName();

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getPrice() > maxPrice) {
                maxPrice = productList.get(i).getPrice();
                productName = productList.get(i).getName();
            }

        }
        System.out.println("The most expensive product is " + productName + " with price: " + maxPrice);


    }

}
