package com.softserve.edu.inheritance;

public class ApplAB {
    public static void main(String[] args) {
        System.out.println("The Start.");
        //
//        System.out.println("Test ClassA.");
//        ClassA a;
//        a = new ClassA();
//        System.out.println("a.i = " + a.i);
//        a.m1();
//        a.m2();
//        a.m3();
//        a.m4();
        //
        System.out.println("Test ClassB.");
        ClassA b; // = null;
        //System.out.println("b.i = " + b.i); // error not init 
        b = new ClassB(); // 1. polimor.
        System.out.println("b.i = " + b.i); // from A, fields not virtual; Architecture Error; Fields must be private 
        b.m1(); // from B // 2. polimor.
        b.m2(); // from A
        b.m3(); // from A and m2 from B // 3. polimor.
        b.m4(); // from B
        //
//        System.out.println("Test_0 ClassB.");
//        ClassB b0;
//        b0 = new ClassB();
//        System.out.println("b0.i = " + b0.i); // from B 
//        b0.m1();
//        b0.m2();
//        b0.m3();
//        b0.m4();
        //
        System.out.println("The End.");
    }
}
