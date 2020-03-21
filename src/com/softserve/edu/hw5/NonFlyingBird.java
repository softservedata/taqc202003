package com.softserve.edu.hw5;

public abstract class NonFlyingBird implements Bird {
    @Override
    public void fly() {
        System.out.print("Non-flying bird");
    }
}
