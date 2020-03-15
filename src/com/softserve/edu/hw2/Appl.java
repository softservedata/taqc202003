package com.softserve.edu.hw2;

import java.io.IOException;
import java.util.Scanner;

public class Appl {
    public static void main(String[] arg) throws IOException {
        int k = 16;
        System.out.println(" _____Task #1_____");
        System.out.println(k++);
        System.out.println(++k);
        System.out.println(k++ + k);
        System.out.println(50 - --k);
        System.out.println(k * k);
        System.out.println(k / 3);
        System.out.println(k % 3);
        System.out.println(k++ < ++k);

        System.out.println(" _____Task #2_____");
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello, " + name);
    }
}
