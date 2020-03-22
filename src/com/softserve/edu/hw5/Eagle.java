package com.softserve.edu.hw5;

public class Eagle extends FlyingBirdImpl {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is a flying bird");
    }

    //@Override
    public String toString() {
        return "Eagle";
    }
}
