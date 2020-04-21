package com.softserve.edu.hw7.nickname;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NicknameValidation {

    private Pattern pattern;
    private Matcher matcher;

    public boolean isNicknameValid;
    public String nickname;

    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9_-]{3,15}$";

    public final String VALID_NICKNAME = "You may use this nickname";
    public final String INVALID_NICKNAME = "Please, choose another nickname";

    public NicknameValidation(){
        pattern = Pattern.compile(USERNAME_PATTERN);
    }

    public void scanner() {

        System.out.println("Please enter a nickname: ");
        Scanner scanner = new Scanner(System.in);
        nickname = scanner.nextLine();
    }

    public void validateNickname(){

        scanner();
        matcher = pattern.matcher(nickname);
        isNicknameValid = matcher.matches();

        if (isNicknameValid){
            System.out.println(VALID_NICKNAME);
        }else {
            System.out.println(INVALID_NICKNAME);
        }
    }

    public static void main(String[] args) {

        NicknameValidation nicknameValidation = new NicknameValidation();
        nicknameValidation.validateNickname();

    }

}
