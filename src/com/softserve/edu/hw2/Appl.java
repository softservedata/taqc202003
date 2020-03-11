package com.softserve.edu.hw2;

import java.util.Scanner; // import scanner tool

public class Appl {
 
	public static void main(String[] args)   {
                
        int k=16 ;
        		{
        			
        	// part 1
            System.out.println(k++);  
            System.out.println(++k);
            System.out.println(k++ +k);
            System.out.println(50- --k);
            System.out.println(k*k);
            System.out.println(k/3);
            System.out.println(k%3);
            System.out.println(k++<++k);
            
            // part2
            System.out.println("What is your name?");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("Hello " + name);
        }
    }

}
