package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Employee;

public class Home5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bird first = new Eagle ();
	        Bird second = new Swallow (); 
	        Bird third = new Penguin (); 
	        Bird fourth = new Chicken (); 

	        Bird[] birds = {first, second, third, fourth};
	        
	        for (int i = 0; i < birds.length; i++) {
	        	 birds[i].fly();
	        }
	}

}
