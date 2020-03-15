package com.softserve.edu.hw3;

public class Product {

    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
