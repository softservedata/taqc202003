package com.softserve.edu.hw5;

public abstract class NonFlyingBird implements Bird{
    @Override
    public void fly() {
        System.out.println("Oops...it wont fly ");
    }
}
