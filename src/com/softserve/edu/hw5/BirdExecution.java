package com.softserve.edu.hw5;

public class BirdExecution {

    public static void main(String[] args) {

        Bird[] birds = new Bird[]{new Eagle(), new Swallow(), new Penguin(), new Chicken()};

        for (int i = 0; i<birds.length; i++ ){

            birds[i].toString();
            birds[i].fly();
        }
    }
}
