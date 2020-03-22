package com.softserve.edu.hw5;

public class BirdApp {

        public static void main(String[] args) {
            Bird[] birds = { new Eagle("Eagle"), new Swallow("Swallow"),
                    new Penguin("Penguin"), new Chicken("Chicken")};
            //
            for (Bird current : birds) {
                System.out.println("This is " + current
                        + " with name: " + current.getName());
                current.fly();
            }
        }
    }

