package com.softserve.edu.HW2;
import java.util.Scanner;
/* k++; ++k; k+++k; 50---k; k*k; k/3; k%3; k++<++k; */
public class Appl {


    public static void main(String[] args) {
         int k =16;
        System.out.println(" k++ = " + (k++));
        System.out.println(" ++k = " + (++k));
        System.out.println("k+++k = " + (k + ++k));
        System.out.println(" 50---k = " + (50 - --k));
        System.out.println(" k*k = " + (k*k));
        System.out.println("k/3 = " + (k/3));
        System.out.println("k%3 = " + (k%3));
        System.out.println("k++<++k = " + (k++ < ++k));



        Scanner user_name = new Scanner(System.in);
        System.out.println("What is your name?");
        String print_user_name = user_name.nextLine();
        System.out.println("Nice to meet you, " + print_user_name );

    }
}
