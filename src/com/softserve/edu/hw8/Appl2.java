package com.softserve.edu.hw8;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl2 {
	private  static String message (String str) {
	     String pattern = "^[A-Za-z0-9]{3,15}";
	     Pattern p = Pattern.compile(pattern);
	     
	  String result;
	if ( str.matches(pattern)) {
		  result = "Valid nickname";
      } else {
    	  result = "Invalid nickname користувача може містити від 3 до 15 символів латинського алфавіту, цифри та підкреслення";
      }
      return result;
	  } 
	 public static void main(String[] args) {
		 System.out.println(" enter nickname ");
			Scanner scan = new Scanner(System.in);
			String nickname = scan.next();
			 
	            System.out.println(message(nickname) + " [" + nickname +"]");;
			scan.close();

	        
	        }
}