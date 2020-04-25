package com.softserve.edu.hw5.t1;

public class Eagle extends FlyingBird {
    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Eagle{" + "name ='" + name + '\'' + '}';
    }
}
