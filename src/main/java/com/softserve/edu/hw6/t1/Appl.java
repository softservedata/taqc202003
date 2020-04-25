package com.softserve.edu.hw6.t1;

import java.util.*;

public class Appl {
    public static void main(String[] args) {
        System.out.println("---Home Work 6---Task 1---");
        Set<Product> firstProductsSet = new TreeSet<Product>(new Product.NameComparator()){
            {
                add(new Product("Bread"));
                add(new Product("Apple"));
                add(new Product("Orange"));
                add(new Product("Banana"));
                add(new Product("Potato"));
                add(new Product("Milk"));
                add(new Product("Strawberry"));
                add(new Product("Chocolate"));
            }};
        System.out.println("First Products Set: " + firstProductsSet);
        Set<Product> secondProductsSet = new TreeSet<Product>(new Product.NameComparator()){
            {
                add(new Product("Batter"));
                add(new Product("Orange"));
                add(new Product("Water"));
                add(new Product("Chocolate"));
                add(new Product("Meat"));
                add(new Product("Milk"));
                add(new Product("Lemon"));
                add(new Product("Coffee"));
                add(new Product("Potato"));
            }};
        System.out.println("Second Products Set: " + secondProductsSet);

        List<Product> theSameProducts = new LinkedList<>();
        for(Product fProduct : firstProductsSet){
            for(Product sProduct : secondProductsSet){
                if(fProduct.equals(sProduct)){
                    theSameProducts.add(fProduct);
                    theSameProducts.add(sProduct);
                }
            }
        }
        System.out.println("List with the same products: " + theSameProducts);
        Iterator<Product> iterator = theSameProducts.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            if(product.equals(iterator.next())){
                iterator.remove();
            }
        }
        System.out.println("List without duplicated products: " + theSameProducts);



    }
}
