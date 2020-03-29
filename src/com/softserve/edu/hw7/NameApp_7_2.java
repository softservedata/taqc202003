package com.softserve.edu.hw7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameApp_7_2 {
    private static Pattern NickNamePattern = Pattern.compile("^[a-z0-9_-]{3,15}$");

    public static boolean validateNickName(String userName) {

        Matcher mtch = NickNamePattern.matcher(userName);
        if (mtch.matches()) {
            return true;
        }
        return false;
    }

    public static void main(String a[]) {
        System.out.println("Is it valid nickname 'login_1' " + validateNickName("login_1"));
        System.out.println("Is it valid nickname 'loginnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn2' " + validateNickName("loginnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn2"));
        System.out.println("Is it valid nickname 'login_333333' " + validateNickName("login_333333"));
        System.out.println("Is it valid nickname 'l4' " + validateNickName("l4"));
        System.out.println("Is it valid nickname 'login_5_' " + validateNickName("login_5_"));
    }
}

