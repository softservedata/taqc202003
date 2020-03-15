package com.softserve.edu.hw3;

import java.util.Objects;

public class Product {
    private String name;
    private double prise;

    public Product (String name, double prise) {
        this.name = name;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }
    Product pr1 = new Product("Cookie", 15.50);
    Product pr2 = new Product("Candys", 25.50);
    Product pr3 = new Product("Waffles", 65.50);
    Product pr4 = new Product("Flakes", 19.80);


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.prise, prise) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prise);
    }

    System.out.println ("pr1.hashCode() is " + pr1.hashCode());
}
