package com.softserve.edu.hw7.stringverification;

import java.util.Scanner;

public class SubstringVerification {

    private String inputtedString;
    private String inputtedSubString;

    public void scanner() {

        System.out.println("Please enter a string: ");
        Scanner scanner1 = new Scanner(System.in);
        inputtedString = scanner1.nextLine().toLowerCase();

        System.out.println("Please enter a char sequence splitted by spaces: ");
        Scanner scanner2 = new Scanner(System.in);
        inputtedSubString = scanner2.nextLine().toLowerCase();

    }

    public void isSubstringPartOfString(){

        scanner();

        String substring = inputtedSubString.replaceAll(" ", "");
        String[] dividedString = inputtedString.split(" ");

        for (String element:dividedString
             ) {
            if (element.equals(substring)){
                System.out.println("Your char sequence "+ element+ " is present");
            }
        }

    }

    public static void main(String[] args) {

        SubstringVerification substringVerification = new SubstringVerification();
        substringVerification.isSubstringPartOfString();
    }
}

