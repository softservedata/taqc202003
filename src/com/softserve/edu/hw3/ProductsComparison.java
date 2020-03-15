package com.softserve.edu.hw3;

public class ProductsComparison {

    public void compareProducts(Product x, Product y, Product z, Product l){

        if (x.getPrice() > y.getPrice() && x.getPrice() > z.getPrice() && x.getPrice() > l.getPrice()){
            String name =  x.getName();
            System.out.println(name);
        }else if (y.getPrice() > x.getPrice() && y.getPrice() > z.getPrice() && y.getPrice() > l.getPrice()) {
            String name = y.getName();
            System.out.println(name);
        }else if (z.getPrice() > x.getPrice() && z.getPrice() > y.getPrice() && z.getPrice() > l.getPrice()) {
            String name = z.getName();
            System.out.println(name);
        }else if (l.getPrice() > x.getPrice() && l.getPrice() > y.getPrice() && l.getPrice() > z.getPrice()){
            String name = l.getName();
            System.out.println(name);
        }

    }
}
