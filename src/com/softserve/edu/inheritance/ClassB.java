package com.softserve.edu.inheritance;

public class ClassB extends ClassA {
    public double i = 1.1;

    @Override
    public void m1() {
        System.out.println("ClassB, metod m1, i=" + i);
        //super.m1();
    }

    @Override
    public void m4() {
        System.out.println("ClassB, metod m4");
    }
    
}
