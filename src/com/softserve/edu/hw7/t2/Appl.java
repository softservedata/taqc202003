package com.softserve.edu.hw7.t2;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        int counter = 5;
        Scanner scanner = new Scanner(System.in);
        NicknameReader nicknameReader = new NicknameReader(scanner);
        for (int i = 0; i < counter; i++) {
            nicknameReader.enterNames();
        }
        nicknameReader.getNicknameResult();
        scanner.close();
    }
}
