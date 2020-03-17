package com.softserve.edu.hw3;
class Product{
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
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name)) {
		return false;
	}
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
		return false;
	}
	return true;
}
@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + "]";
}

}
public class ApplProduct
{
public static void main (String[] args) {
	Product pr1 = new Product("Lenovo", 250.0);
	Product pr2 = new Product("HPProbook", 300.0);
	Product pr3 = new Product ("LenovoThinkPad", 500.0);
	Product pr4 = new Product ("ZenBook", 400.0);
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
if (productMaxPrice.equals(pr1)) {
	System.out.println("pr1="+pr1);
}

if (productMaxPrice.equals(pr2)) {
	System.out.println("pr2="+pr2);
}
if (productMaxPrice.equals(pr3)) {
	System.out.println("pr3="+pr3);
}
if (productMaxPrice.equals(pr4)) {
	System.out.println("pr4="+pr4);
	
}
}
}

			





