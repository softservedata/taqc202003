package com.softserve.edu.hw6;

import java.util.*;

public class Arrays {

    public void determineSameAnimals() {

        Set<String> animals = new HashSet<>();
        Set<String> mammals = new HashSet<>();

        animals.add("Wolf");
        animals.add("Lion");
        animals.add("Bee");
        animals.add("Penguin");
        animals.add("Fly");
        animals.add("Bat");
        animals.add("Peacock");

        mammals.add("Cat");
        mammals.add("Wolf");
        mammals.add("Man");
        mammals.add("Tiger");
        mammals.add("Dog");
        mammals.add("Bat");
        mammals.add("Lion");
        mammals.add("Rabbit");
        mammals.add("Cow");

        List<String> duplicatedAnimals = new ArrayList<>();

        for (String duplicatedAnimal:mammals
             ) {
            if (animals.contains(duplicatedAnimal)){
                duplicatedAnimals.add(duplicatedAnimal);
            }
        }
    }


    public boolean isArrayContentEquals(){

        boolean isArraysEquals;
        int num = 0;

        List<Integer> fullPrice = new ArrayList<>();
        List<Integer> priceWithSale = new ArrayList<>();
        Random rand = new Random();


        while (fullPrice.size()<=10){
            int random = rand.nextInt(25);
            fullPrice.add(random);

        }
        System.out.println(fullPrice.toString());

        while (priceWithSale.size()<=15){
            int random = rand.nextInt(25);
            priceWithSale.add(random);

        }
        System.out.println(priceWithSale.toString());

        //verification whether 1 array contains all elements of another one
        isArraysEquals = priceWithSale.contains(fullPrice);
        System.out.println(isArraysEquals);

        // verification of each array element
        for (int element:fullPrice
        ) {
            if (priceWithSale.contains(element)){
                num += 1;
            }
        }
        System.out.println("Array PriceWithSales contains "+ num + " elements of FullPrice array");

        return isArraysEquals;
    }

    public static void main(String[] args) {

        Arrays arrays = new Arrays();

        arrays.determineSameAnimals();
        arrays.isArrayContentEquals();
    }



}
