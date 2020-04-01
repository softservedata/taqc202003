package com.softserve.edu.hw3;

public class Product {

    private String Name;
    private float Price;

    public Product (String Name, float Price) {

        this.Name = Name;
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }
    public void setName(String actualName) {
        Name = actualName;
    }
    public double getPrice() {
        return Price;
    }
    public void setPrice(float actualPrice) {
        Price = actualPrice;
    }




}
