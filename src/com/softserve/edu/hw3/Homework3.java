package com.softserve.edu.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args)   
/*	
	// Case 1
	
	{
        int a=0;
        int b=0;
        try (Scanner cs = new Scanner(System.in)){
        	{System.out.print("a= ");}
        	a = cs.nextInt();
        	{System.out.print("b= ");}
        	b = cs.nextInt();
        	{System.out.print("entered:  " + b + ", " + a);
        	System.out.println(" ");            	
        } 
        }
        catch (Exception e) {
        	System.out.println("The value is Not an Integer");
        }
	}  

	// Case2
	
	{
        	double x=0;
            double y=0;
            double z=0;
         
            try (Scanner cs = new Scanner(System.in))
            {
            	System.out.print("x= ");
            	x = cs.nextDouble();
            	System.out.print("y= ");
            	y = cs.nextDouble();
            	System.out.print("z= ");
            	z = cs.nextDouble();
            	double arr[] = {x, y, z};
            	Arrays.sort(arr);
            	System.out.print(Arrays.toString(arr));
            }
          
            catch (Exception f) {
            	System.out.println("The value is Not an Double");
                    }   

*/
	{
    	double f=0;
        double g=0;
        double h=0;
        double j=0;
        try (Scanner cs = new Scanner(System.in)){
        	System.out.print("f= ");
        	f = cs.nextDouble();
        	System.out.print("g= ");
        	g = cs.nextDouble();
        	System.out.print("h= ");
        	h = cs.nextDouble();
        	System.out.print("j= ");
        	j = cs.nextDouble();
        	double arr[] = {f, g, h, j};
        	
        	{for(double i=0; i<arr.length; i++);
        	System.out.print(Arrays.toString(arr));}
             
        }
        	catch (Exception s) {
            	System.out.println("The value is Not a Namber");
        	}
	}
}

        	