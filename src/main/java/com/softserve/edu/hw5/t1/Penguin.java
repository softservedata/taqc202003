package com.softserve.edu.hw5.t1;

public class Penguin extends NonFlyingBird {
    private String name;

    public Penguin(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Penguin{" + "name =' " + name + '\'' + '}';
    }
}
