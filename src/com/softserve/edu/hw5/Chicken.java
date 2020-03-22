package com.softserve.edu.hw5;

public class Chicken extends FlyingBirdImpl {
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Chicken is a flying bird");
    }

    //@Override
    public String toString() {
        return "Chicken";
    }

}
