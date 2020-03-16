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

Product pr1 = new Product ("Lenovo", 250);
Product pr2 = new Product ("HPProbook", 300);
Product pr3 = new Product ("LenovoThinkPad", 500);
Product pr4 = new Product ("ZenBook", 400);
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((pr1 == null) ? 0 : pr1.hashCode());
	result = prime * result + ((pr2 == null) ? 0 : pr2.hashCode());
	result = prime * result + ((pr3 == null) ? 0 : pr3.hashCode());
	result = prime * result + ((pr4 == null) ? 0 : pr4.hashCode());
	result = prime * result + price;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (this.getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (pr1 == null) {
		if (other.pr1 != null)
			return false;
	} else if (!pr1.equals(other.pr1))
		return false;
	if (pr2 == null) {
		if (other.pr2 != null)
			return false;
	} else if (!pr2.equals(other.pr2))
		return false;
	if (pr3 == null) {
		if (other.pr3 != null)
			return false;
	} else if (!pr3.equals(other.pr3))
		return false;
	if (pr4 == null) {
		if (other.pr4 != null)
			return false;
	} else if (!pr4.equals(other.pr4))
		return false;
	if (price != other.price)
		return false;
	return true;
}
System.out.println ("pr1.equals(pr2) is:"+pr1.equals (pr2));
System.out.println("pr1.hashCode() is:" + pr2.hashCode());


}


