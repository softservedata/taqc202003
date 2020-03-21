package com.softserve.edu.hw5.birds;

public abstract class NonFlyingBird implements Bird {
    @Override
    public String fly() {
        return "nonFlying bird";
    }
}
