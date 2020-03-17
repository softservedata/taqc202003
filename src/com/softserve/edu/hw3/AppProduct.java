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
		Product product1 = new Product("milk", 20.0);
		Product product2 = new Product("bear", 30.0);
		Product product3 = new Product("water", 30.0);
		Product product4 = new Product("bred", 12.0);
		//
		Product productMaxPrice = product1;
		if (productMaxPrice.getPrice() < product2.getPrice()) {
			productMaxPrice = product2;
		}
		if (productMaxPrice.getPrice() < product3.getPrice()) {
			productMaxPrice = product3;
		}
		if (productMaxPrice.getPrice() < product4.getPrice()) {
			productMaxPrice = product4;
		}
		// System.out.println("productMaxPrice = " + productMaxPrice);
		//
		//if (productMaxPrice.getPrice() == product1.getPrice()) {
		if (productMaxPrice.equals(product1)) {
			System.out.println("product1 = " + product1);
		}
		//if (productMaxPrice.getPrice() == product2.getPrice()) {
		if (productMaxPrice.equals(product2)) {
			System.out.println("product2 = " + product2);
		}
		//if (productMaxPrice.getPrice() == product3.getPrice()) {
		if (productMaxPrice.equals(product3)) {
			System.out.println("product3 = " + product3);
		}
		//if (productMaxPrice.getPrice() == product4.getPrice()) {
		if (productMaxPrice.equals(product4)) {
			System.out.println("product4 = " + product4);
		}

	}
}
