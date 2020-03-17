package com.softserve.edu.hw3;
import java.util.ArrayList;
import java.util.List;

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
public static void main (String[]args){
	

Product pr1 = new Product ("Lenovo", 250);
Product pr2 = new Product ("HPProbook", 300);
Product pr3 = new Product ("LenovoThinkPad", 500);
Product pr4 = new Product ("ZenBook", 400);


List<Product> prodList = new ArrayList<>();
prodList.add(pr1);
prodList.add(pr2);
prodList.add(pr3);
prodList.add(pr4);
System.out.println("Products list:" + prodList);


}}











