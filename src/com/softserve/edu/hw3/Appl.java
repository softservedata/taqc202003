package com.softserve.edu.hw3;

public class Appl {
    private final int number = 66;

    public  int m1() {
        int localNum = number;
        //number++;
        localNum++;
        return  localNum;
    }

    public static void main(String[] args) {
        int m = 0;
        m++;
        //final int i = 13;
        int i = 13;
        int j = i-- + m;
        //
        Appl app = new Appl();
        System.out.println("initial number = " + app.number);
        app.m1();
        System.out.println("next number = " + app.number);
    }
}
