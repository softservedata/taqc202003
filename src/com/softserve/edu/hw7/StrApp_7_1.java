package com.softserve.edu.hw7;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class StrApp_7_1 {

    public static void main(String[] args) {


        Pattern p = Pattern.compile(" ");
        String tmp = "My Java Program some string gramm 58481 test spam";
        String[] tokens = p.split(tmp);


        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].contains("am")) {
                System.out.println(tokens[i]);
            }

        }


    }


}
