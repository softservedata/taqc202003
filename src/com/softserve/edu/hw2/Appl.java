package com.softserve.edu.hw2;

import java.util.Scanner;   // https://www.inf.unibz.it/~calvanese/teaching/06-07-ip/lecture-notes/uni02/node33.html 


public class Appl {
	
	//If you do not want to change the var (Global.K ?)
	private static int K = 16;
    public static int getValK(){
        return K;
    }
	
    
    public static void KeyboardInput (String UserName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        UserName = scanner.nextLine();
        System.out.println("Hello, " + UserName +"!");
      }
	
    
	public static void main(String[] args)   {
        System.out.println("Java Logical Operations:");

		int k; 
		
		//Post - increment (next time K will be 17) 
		k = getValK();
		System.out.println("k++ = " + (k++)); 
		
		//Pre - increment 
		k = getValK();
		System.out.println("++k = " + (++k)); 

		//k+++k == (k + ++k) = k +  Pre - increment K 
		k = getValK();
		System.out.println("k+++k == (k + ++k) = " + (k+++k)); 
		
		//50---k == (50 - --k) = 50 -  Pre - decrement K 
		k = getValK();
		System.out.println("50---k == (50 - --k) = " + (50 - --k)); 		

		//k^2
		k = getValK();
		System.out.println("k*k == (k^2) = " + (k*k));

		// k/3 - float value, but we received int
		k = getValK();
		System.out.println("k/3 = 5.33 (integer =5) == " + (k/3));		

		// % -Returns the remainder of the division.
		k = getValK();
		System.out.println("k%3 = 5.33 == " + (k%3));	// KARL?)
		
		// % -Returns the remainder of the division.
		k = getValK();
		System.out.println("k++<++k == (logical comparison k++ and ++k) = " + (k++<++k));
		
        Scanner scanner = new Scanner(System.in); // creates a new Scanner object, that is connected to standard input (the keyboard)
		KeyboardInput(scanner.nextLine());
		
    }

}
