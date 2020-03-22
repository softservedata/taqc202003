package com.softserve.edu.hw5;

public class Swallow extends FlyingBirdImpl {
    public Swallow(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Swallow is a flying bird");
    }

    //@Override
    public String toString() {
        return "Swallow";
    }
}
