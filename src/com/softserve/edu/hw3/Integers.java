package com.softserve.edu.hw3;

import java.util.Scanner;

public class Integers {
	
	public static void main(String [] args) 
	   
	// case1
	{
		int a=0;
        int b=0;
        try (Scanner cs = new Scanner(System.in)){
        	System.out.print("a= ");
        	a = cs.nextInt();
        	System.out.print("b= ");
        	b = cs.nextInt();
        	int c=a;
        	a=b;
        	b=c;
        	System.out.print("entered:  " + a + ", " + b);
        	        	
        } catch (Exception e) {
        	System.out.println("The value is Not an Integer");
        
        }
	} 
	// case2
	{
        
        double a=0;
        double b=0;
        double c=0;
     
        try (Scanner cs = new Scanner(System.in)){
        	System.out.print("a= ");
        	a = cs.nextDouble();
        	System.out.print("b= ");
        	b = cs.nextDouble();
        	System.out.print("c= ");
        	c = cs.nextDouble();
        	double d=0;
        	if (b < a) {
    			d = a;
    			a = b;
    			b = d;
    		}
    		if (c < b) {
    			d = c;
    			c = b;
    			b = d;
    		}
    		if (b < a) {
    			d = a;
    			a = b;
    			b = d;
    		}
        	System.out.print("result is " + a + ", " + b + ", " + c);
        }
      
        catch (Exception f) {
        	System.out.println("The value is Not a Double");
                }  
      //case3          
        {
        	int f=0;
            int g=0;
            int h=0;
            int j=0;
            try (Scanner cs = new Scanner(System.in)){
            	System.out.print("f= ");
            	f = cs.nextInt();
            	System.out.print("g= ");
            	g = cs.nextInt();
            	System.out.print("h= ");
            	h = cs.nextInt();
            	System.out.print("j= ");
            	j = cs.nextInt();

            	if  (f%2==1) 
        			System.out.println("f is an even number " + f);
            	if  (g%2==1) 
        			System.out.println("g is an even number " + g);
            	if  (h%2==1) 
        			System.out.println("h is an even number " + h);
            	if  (j%2==1) 
        			System.out.println("j is an even number " + j);
                             }
            	catch (Exception s) {
                	System.out.println("The value is Not a Namber");
            	}
        }
	}
}