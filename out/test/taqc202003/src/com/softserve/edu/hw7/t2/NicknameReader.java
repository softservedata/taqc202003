package com.softserve.edu.hw7.t2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NicknameReader {
    private String nickName;
    private Scanner scanner;
    private List<String> names = new ArrayList<>();
    private String pattern = "[\\w]+";

    public NicknameReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getNickName() {
        return nickName;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public List<String> getNames() {
        return names;
    }

    public List<String> enterNames() {
        System.out.print("Enter your nickname: ");
        nickName = scanner.nextLine();
        names.add(nickName);
        return names;
    }

    public void getNicknameResult() {
        for (String name : getNames()) {
            if (name.length() >= 3 && name.length() <= 15) {
                Pattern pat = Pattern.compile(pattern);
                Matcher matcher = pat.matcher(name);
                if (matcher.matches()) {
                    System.out.println("Nickname matches the pattern: " + name);
                } else {
                    System.out.println("Nickname does not match the pattern: " + name);
                }
            } else if (name.length() < 3) {
                System.out.println("You entered too short nickname: " + name);
            } else {
                System.out.println("You entered too long nickname: " + name);
            }
        }

    }

}
