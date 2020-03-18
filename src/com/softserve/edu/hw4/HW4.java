package com.softserve.edu.hw4;

import java.util.Arrays;
import java.util.Scanner;


public class HW4 {

    //find sum of positive numbers
    public static void sumOfPositives(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                continue;
            }
            sum = sum + arr[i];
        }
        if (sum != 0) {
            System.out.println("Sum of positive numbers: " + sum);
        } else {
            System.out.println("There are no positive numbers in array."); //zero is neither positive nor negative
        }
    }

    //find max negative number in array
    public static void maxOfNegatives(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (max == 0 || arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        if (max != 0) {
            System.out.println("Max negative number: " + max);
        } else {
            System.out.println("There are no negative numbers in array."); //zero is neither positive nor negative
        }
    }

    public static void main(String[] args) {
        System.out.println("Tasks 1 and 2");
        int[] arr = new int[10];
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array of 10 elements: ");
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
         } catch (Exception e) {
                System.out.println("Something went wrong.");
        }

        sumOfPositives(arr);

        maxOfNegatives(arr);

        System.out.println("Task 3");
        Employee[] employees = {
                new Employee("John", "Sales"),
                new Employee("Jane", "Marketing"),
                new Employee("Anna", "Marketing"),
                new Employee("Scott", "IT"),
                new Employee("Mary", "Sales"),
                new Employee("Alex", "Sales")
        };
        String department = "";
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name of the department: ");
            department = sc.nextLine();
        } catch(Exception e) {
                System.out.println("Something went wrong.");
        }
        if (department.equalsIgnoreCase("Sales") || department.equalsIgnoreCase("IT") || department.equalsIgnoreCase("Marketing")) {
            for (Employee employee : employees) {
                if (employee.getDepartment().equalsIgnoreCase(department)) {
                    System.out.println(employee.toString());
                }
            }
        } else {
            System.out.println("Invalid department name.");
        }
    }
}
