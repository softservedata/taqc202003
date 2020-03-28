package com.softserve.edu.hw7;
import java.util.*;

public class Task2 {
    private static String nicknameValidator(String s) {
        String pattern = "[A-Za-z0-9_]{3,15}";
        String result;

        if(!s.isEmpty() && s.matches(pattern)) {
            result = "Valid nickname";
        } else {
            result = "Invalid nickname";
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> nicknames = new ArrayList<>();

        nicknames.add("n1");
        nicknames.add("Neo");
        nicknames.add("_Nick_NAME_123_");
        nicknames.add("morethan_15check");
        nicknames.add("check spaces");
        nicknames.add("special@char1");

        for (String n: nicknames) {
            System.out.println(nicknameValidator(n) + " [" + n +"]");
        }

        /*
        Output:
        Invalid nickname [n1]
        Valid nickname [Neo]
        Valid nickname [_Nick_NAME_123_]
        Invalid nickname [morethan_15check]
        Invalid nickname [check spaces]
        Invalid nickname [special@char1]
         */
    }
}
