package com.softserve.edu.hw3;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
		/*
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		*/
        return getPrice() == other.getPrice();
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

}

public class AppProduct {

    public static void main(String[] args) {
        Product pr1 = new Product("waffles", 25.45);
        Product pr2 = new Product("flakes", 65.45);
        Product pr3 = new Product("cookies", 15.25);
        Product pr4 = new Product("candies", 65.45);
        //
        Product productMaxPrice = pr1;
        if (productMaxPrice.getPrice() < pr2.getPrice()) {
            productMaxPrice = pr2;
        }
        if (productMaxPrice.getPrice() < pr3.getPrice()) {
            productMaxPrice = pr3;
        }
        if (productMaxPrice.getPrice() < pr4.getPrice()) {
            productMaxPrice = pr4;
        }
        // System.out.println("productMaxPrice = " + productMaxPrice);
        //
        //if (productMaxPrice.getPrice() == pr1.getPrice()) {
        if (productMaxPrice.equals(pr1)) {
            System.out.println("product1 = " + pr1);
        }
        //if (productMaxPrice.getPrice() == pr2.getPrice()) {
        if (productMaxPrice.equals(pr2)) {
            System.out.println("product2 = " + pr2);
        }
        //if (productMaxPrice.getPrice() == pr3.getPrice()) {
        if (productMaxPrice.equals(pr3)) {
            System.out.println("product3 = " + pr3);
        }
        //if (productMaxPrice.getPrice() == pr4.getPrice()) {
        if (productMaxPrice.equals(pr4)) {
            System.out.println("product4 = " + pr4);
        }

    }
}