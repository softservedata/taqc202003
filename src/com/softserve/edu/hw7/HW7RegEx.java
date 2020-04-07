package com.softserve.edu.hw7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


    public class HW7RegEx {

        public static String nickNameComparator(String n){
            String pattern = "\\w{3,15}";
            String result;

            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(n);

            if(m.matches()){
                result = "Your nickname " + n + " is valid!";
            }
            else{
                result = "Your nickname " + n + " is not valid";
            }

            return result;
        }
        public static void main (String[] args){
            String[] nickname = {"nickname", "admin", "SuperLongname34566tratata", "just a space", "extra!"};
            for (String n:nickname){
                System.out.println(nickNameComparator(n)  );
            }


        }

    }


