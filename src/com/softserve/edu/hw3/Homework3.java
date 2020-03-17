package com.softserve.edu.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {   
	
	// Case 1
	/*-
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
 */
	// Case2
/*	
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
     // Case3
  /*-          
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
        	
        	for(double i=0; i<arr.length; i++);
        	{int i = 0;
			if ((arr[i] % 2 ) == 0 );}
        	{
        	System.out.print(Arrays.toString(arr));}
             
        }
        	catch (Exception s) {
            	System.out.println("The value is Not a Namber");
        	}
        	*/
	//
		Product st1 = new Product ("Sony", 125);
		Product st2 = new Product ("Phillips", 100);
		Product st3 = new Product ("LG", 125);
		Product st4 = new Product ("Panasonic", 55);
		if (st1.getPrice()>st2.getPrice()&&st1.getPrice()>st3.getPrice()&&st1.getPrice()>st4.getPrice()) {
		    System.out.println(st1.getName() + " is the most expencive");
		    return;
		}
		if (st2.getPrice()>st1.getPrice()&&st2.getPrice()>st3.getPrice()&&st2.getPrice()>st4.getPrice())  {
		    System.out.println(st2.getName()+ " is the most expencive");
		    return;
		}
		if (st3.getPrice()>st1.getPrice()&&st3.getPrice()>st2.getPrice()&&st3.getPrice()>st4.getPrice())  {
		    System.out.println(st3.getName()+ " is the most expencive");
		    return;
		}
		if (st4.getPrice()>st1.getPrice()&&st4.getPrice()>st2.getPrice()&&st4.getPrice()>st3.getPrice())  {
		    System.out.println(st4.getName()+ " is the most expencive");
		    return;
		}
		if (st1.getPrice()==st2.getPrice()&&st2.getPrice()==st3.getPrice()&&st3.getPrice()==st4.getPrice())  {
		    System.out.println(st1.getName() + ", " + st2.getName() + ", " + st3.getName() + ", and " + st4.getName() + " are equal ;)");
		    return;
		}
		if (st1.getPrice()==st2.getPrice()&&st2.getPrice()==st3.getPrice()&&st3.getPrice()!=st4.getPrice())  {
		    System.out.println(st1.getName() + ", " + st2.getName() + ", and " + st3.getName() + " are the most expencive");
		    return;
		}
		if (st1.getPrice()==st2.getPrice()&&st2.getPrice()!=st3.getPrice()&&st1.getPrice()==st4.getPrice())  {
		    System.out.println(st1.getName() + ", " + st2.getName() + ", and " + st4.getName() + " are the most expencive");    
		    return;
		}
		if (st1.getPrice()==st3.getPrice()&&st1.getPrice()!=st2.getPrice()&&st1.getPrice()==st4.getPrice())  {
		    System.out.println(st1.getName() + ", " + st3.getName() + ", and " + st4.getName() + " are the most expencive");    
		    return;
		}
		if (st2.getPrice()==st3.getPrice()&&st2.getPrice()==st4.getPrice()&&st2.getPrice()!=st1.getPrice())  {
		    System.out.println(st2.getName() + ", " + st3.getName() + ", and " + st4.getName() + " are the most expencive");    
		    return;
		}
		if (st1.getPrice()==st2.getPrice()&&st1.getPrice()>st3.getPrice()) {
		    System.out.println(st1.getName() + " and " + st2.getName() + " are the most expencive");    
		    return;
		}
		if (st1.getPrice()==st3.getPrice()&&st1.getPrice()>st2.getPrice()) {
		    System.out.println(st1.getName() + " and " + st3.getName() + " are the most expencive");    
		    return;
		}
		if (st1.getPrice()==st4.getPrice()&&st1.getPrice()>st2.getPrice())  {
		    System.out.println(st1.getName() + " and " + st4.getName() + " are the most expencive");    
		    return;
		}
		if (st2.getPrice()==st3.getPrice()&&st2.getPrice()>st4.getPrice())  {
		    System.out.println(st2.getName() + " and " + st3.getName() + " are the most expencive");    
		    return;
		}
		if (st2.getPrice()==st4.getPrice()&&st2.getPrice()>st1.getPrice())  {
		    System.out.println(st2.getName() + " and " + st4.getName() + " are the most expencive");    
		    return;
		}
		if (st3.getPrice()==st4.getPrice()&&st3.getPrice()>st1.getPrice())  {
		    System.out.println(st3.getName() + " and " + st4.getName() + " are the most expencive");    
		    return;
		    
	}
}
}



        	