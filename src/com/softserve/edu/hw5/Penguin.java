package com.softserve.edu.hw5;

public class Penguin extends  NonFlyingBirdImpl {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Penguin is not flying");
    }

    //@Override
    public String toString() {
        return "Penguin";
    }
}
