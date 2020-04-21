package com.softserve.edu.hw3;

public class Execution {

    public static void main (String[] args){


        NumberReader reader = new NumberReader();
        reader.changeOrder();
        reader.printAsc();
        reader.printOdd();

        Product water = new Product("Water", 10);
        Product bread = new Product("Bread", 5);
        Product meet = new Product("Meet", 25);
        Product ice = new Product("Ice", 2);

        ProductsComparison productsComparison = new ProductsComparison();
        productsComparison.compareProducts(water,bread,meet,ice);
    }

}
