package com.softserve.edu.hw3;

public class Product {
	private String name;
	private int price;
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
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
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		*/
		return getPrice() == other.getPrice();
	}
	
@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}


public static void main (String[] args) { 
	Product st1 = new Product ("Sony", 999);
	Product st2 = new Product ("Phillips", 999);
	Product st3 = new Product ("LG", 125);
	Product st4 = new Product ("Panasonic", 1000);

	Product productMaxPrice = st1;
	if (productMaxPrice.getPrice() < st2.getPrice()) {
		productMaxPrice = st2;
	}
	if (productMaxPrice.getPrice() < st3.getPrice()) {
		productMaxPrice = st3;
	}
	if (productMaxPrice.getPrice() < st4.getPrice()) {
		productMaxPrice = st4;
	}
	if (productMaxPrice.equals(st2)) {
		productMaxPrice = st1;
		System.out.println("Max Price " + st1);
	}
	if (productMaxPrice.equals(st2)) {
		productMaxPrice = st2;
		System.out.println("Max Price " + st2);
	}
	if (productMaxPrice.equals(st3)) {
		productMaxPrice = st3;
		System.out.println("Max Price " + st3);
	}
	if (productMaxPrice.equals(st4)) {
		productMaxPrice = st4;
		System.out.println("Max Price " + st4);
	}		
	
}
}
