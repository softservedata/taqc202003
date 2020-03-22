package com.softserve.edu.hw5;

public abstract class FlyingBirdImpl implements Bird {
    private String name;

    public FlyingBirdImpl(String name) {
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

