package com.softserve.edu.hm2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
    public static void main(String[] args) throws IOException {
        int k = 16;
        System.out.print("k++: ");
        System.out.println(k++);

        k = 16;
        System.out.print("++k: ");
        System.out.println(++k);

        k = 16;
        System.out.print("k+++k: ");
        System.out.println(k+ ++k);

        k = 16;
        System.out.print("0---k: ");
        System.out.println(50 - --k);

        k = 16;
        System.out.print("k*k: ");
        System.out.println(k*k);

        k = 16;
        System.out.print("k/3: ");
        System.out.println(k/3);

        k = 16;
        System.out.print("k%3: ");
        System.out.println(k%3);

        k = 16;
        System.out.print("k++<++k: ");
        System.out.println(k++ < ++k);


        System.out.println("What is your name?");
        java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name = in.readLine();
        System.out.println("Hello " + name);

        in.readLine();
    }
}
