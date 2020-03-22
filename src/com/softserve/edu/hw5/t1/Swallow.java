package com.softserve.edu.hw5.t1;

public class Swallow extends FlyingBird {
    private String name;

    public Swallow(String name) {
        this.name = name;
    }


    @Override
    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Swallow{" + "name =' " + name + '\'' + '}';
    }
}
