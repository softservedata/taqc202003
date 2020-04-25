package com.softserve.edu.hw6.t1;

import java.util.Comparator;
import java.util.Objects;

public class Product {

    public static class NameComparator implements Comparator<Product> {
        public int compare(Product p1, Product p2) {
            return p1.getProductName().compareTo(p2.getProductName());
        }
    }

    private String productName;


    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductName= " + productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }
}
