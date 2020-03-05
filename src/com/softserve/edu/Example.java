package com.softserve.edu;

public class Example {

    public static void main(String[] args)   {
        System.out.println("My first program");
        //
        for (int i=0; i<args.length; i++) {
            System.out.println("Argument i = " + i + "  Value = " + args[i]);  
        }
    }

}
