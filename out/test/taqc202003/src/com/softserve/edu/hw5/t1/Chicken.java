package com.softserve.edu.hw5.t1;

public class Chicken extends NonFlyingBird {
    private String name;

    public Chicken(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Chicken{" + "name =' " + name + '\'' + '}';
    }
}
