package com.softserve.edu.hw3;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Product orange = new Product("Orange", 10);
        Product banana = new Product("Banana", 7);
        Product apple = new Product("Apple", 9);
        Product eggs = new Product("Eggs", 3);

        List<Product> prodList = new ArrayList<>();
        prodList.add(orange);
        prodList.add(banana);
        prodList.add(apple);
        prodList.add(eggs);

        int max = 0;
        String name = "";
        for (Product p : prodList) {
            if (p.getPrice() > max) {
                max = p.getPrice();
                name = p.getName();
            }
        }
        System.out.println("Products list:" + prodList);
        System.out.println("The most expensive product is: " + name + " with price: " + max);

    }
}
