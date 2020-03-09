package com.softserve.edu;

public class Example {

    public static void main(String[] args)   {
        System.out.println("My First Program");
        //
        for (int i=0; i<args.length; i++) {
            System.out.println("argument i = " + i + "  value = " + args[i]);  
        }
    }

}
