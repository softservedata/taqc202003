package com.softserve.edu.hw5.birds;

public abstract class NonFlyingBird implements Bird {

    @Override
    public void fly(){
        System.out.println("nonflying bird");
    }
}
