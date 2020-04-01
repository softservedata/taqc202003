package com.softserve.edu.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.softserve.edu.hw3.Product;

public class Home4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		   java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("1. Input 10 numbers");
	        String line = in.readLine();
	        String[] numbers = line.split(" ");
	        Integer sum = 0;
	        for (int i = 0; i < numbers.length; i++) {
				if (Integer.valueOf(numbers[i]) > 0) {
					sum = sum + Integer.valueOf(numbers[i]);
				}
			}
	        System.out.println(sum);
	        
	        
	        Integer max = Integer.MIN_VALUE;
	        for (int i = 0; i < numbers.length; i++) {
				if (Integer.valueOf(numbers[i]) < 0 && Integer.valueOf(numbers[i]) > max) {
					max = Integer.valueOf(numbers[i]);
				}
			}
	        System.out.println(max);
	        
	        Employee first = new Employee (new String("Ivan"), new String("meal")); 
	        Employee second = new Employee (new String("Dima"), new String("IT")); 
	        Employee third = new Employee (new String("Katya"), new String("paper")); 
	        Employee fourth = new Employee (new String("Masha"), new String("IT")); 
	        Employee fifth = new Employee (new String("Bob"), new String("Werhause")); 
	        
	        Employee[] employes = {first, second, third, fourth, fifth};
	        in = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("1. Input dep");
	        String department = in.readLine();
	        for (int i = 0; i < employes.length; i++) {
	        	if(employes[i].getDepartment().equals(department)) {
	        		System.out.println(employes[i].getName());
	        	}
	        }
	        
	}
	

}
