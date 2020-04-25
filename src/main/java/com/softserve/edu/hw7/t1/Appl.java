package com.softserve.edu.hw7.t1;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleReader consoleReader = new ConsoleReader(scanner);
        consoleReader.enterText();
        consoleReader.enterSearch();
        consoleReader.displayResult();

        scanner.close();
    }
}
