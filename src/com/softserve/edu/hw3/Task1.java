package com.softserve.edu.hw3;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg) throws IOException {
        System.out.println("add some number:");
        Scanner scan1 = new Scanner(System.in);
        int numb1 = Integer.parseInt(scan1.nextLine());

        System.out.println("add some number:");
        Scanner scan2 = new Scanner(System.in);
        int numb2 = Integer.parseInt(scan2.nextLine());

        System.out.println("your input: " + numb1 +" "+ numb2);
        System.out.println("reverse order: " + numb2 +" "+ numb1);
    }
}