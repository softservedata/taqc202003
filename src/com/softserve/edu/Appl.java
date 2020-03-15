package com.softserve.edu;
import java.util.Scanner;
public class Appl {
    public static void main(String[] args) {

            int k = 16;
            /*   k++; ++k; k+++k; 50---k; k*k; k/3; k%3; k++<++k;    */

            System.out.println("k++= " + + (k++  ));

            System.out.println("++k= " + + (++k  ));

            System.out.println("k+++k=  " + (k+++k  ));

            int k1=50;
            System.out.println("50---k= " + (k1---k ));

            System.out.println("k*k= " + (k*k  ));

            System.out.println("k/3= " + (k/3  ));

            System.out.println("k%3= " + (k%3  ));

            System.out.println("k%3= " + (k++<++k  ));

            System.out.println("What is your name?");
            Scanner name = new Scanner( System. in);
            String userName = name.nextLine();
            System.out.println("Hello " + userName);
    }
}
