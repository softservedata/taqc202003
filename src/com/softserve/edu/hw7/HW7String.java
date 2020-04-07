package com.softserve.edu.hw7;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class HW7String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full address:");
        String initial = sc.nextLine();

        System.out.println("Enter delivery address:");
        String toCompare = sc.nextLine();

        Pattern p = Pattern.compile(" ");

        String[] getString = p.split(initial);

        for (int i = 0; i < getString.length; i++) {

            if (getString[i].contains(toCompare)) {
                System.out.println("Bingo! " + getString[i]);
            }

        }


    }
}


