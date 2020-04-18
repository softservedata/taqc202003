package com.softserve.edu.hw5.t1;

public class Appl {
    public static void main(String[] args) {
        //Create an Array Bird type and add different birds to the array
        //Print the birds to the screen
        System.out.println("---Home work 5---Task 1---");

        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("BATELEUR");
        birds[1] = new Swallow("BAHAMA SWALLOW");
        birds[2] = new Penguin("AFRICAN");
        birds[3] = new Chicken("NAKED NECK");
        for (Bird bird : birds) {
            System.out.println("Birds type -- "+ bird.toString() + " and " + bird.fly());
        }
    }
}
