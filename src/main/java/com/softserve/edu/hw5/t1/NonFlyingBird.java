package com.softserve.edu.hw5.t1;

public abstract class NonFlyingBird implements Bird {
    abstract String getName();

    @Override
    public String fly() {
        return "I can not fly!";
    }
}
