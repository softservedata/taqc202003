package com.softserve.edu.hw5;

public abstract class NonFlyingBirdImpl implements Bird {
    private String name;

    public NonFlyingBirdImpl(String name) {
        this.name = name;
    }

    //@Override
    public void fly() {
    }

    //@Override
    public String getName() {
        return name;
    }


}

