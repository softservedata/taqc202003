package com.softserve.edu.hw4;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        System.out.println("---Home work 4---");
        Scanner scanner = new Scanner(System.in);
        try {
            int[] array = new int[10];
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter the number: ");
                int n = Integer.parseInt(scanner.nextLine());
                array[i] = n;
            }
            int minValue = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < minValue) {
                    minValue = array[i];
                }
            }
            int maxFromNeg = minValue;
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    sum = sum + array[i];
                } else {
                    if (array[i] > maxFromNeg) {
                        maxFromNeg = array[i];
                    }
                }
            }
            System.out.println("---Task 1---Display the sum of the positive numbers in array---");
            System.out.println("Sum equals = " + sum);
            System.out.println("---Task 2---Display the max number from negative numbers in array---");
            System.out.println("Max nim number = " + maxFromNeg);
        } catch (NumberFormatException e) {
            System.out.println("Reader error");
        }

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan", "MarketingDP");
        employees[1] = new Employee("Oleg", "SalesDp");
        employees[2] = new Employee("Dima", "ManagementDp");
        employees[3] = new Employee("Petro", "SupportDp");
        employees[4] = new Employee("Roman", "AdministratorsDp");
        System.out.print("Your company has next departments: ");
        for (Employee department : employees) {
            System.out.print(department.getDepartment() + " ");

        }
        System.out.print("\nEnter the whole name or part of the name to find the employee in Department: ");
        String departmentName = scanner.nextLine();
        for (Employee employeeCurrent : employees) {
            if (employeeCurrent.getDepartment().toLowerCase().trim().contains(departmentName)) {
                System.out.println(employeeCurrent);
            }
        }
        System.out.println("You enter the wrong name )^^(");


        scanner.close();

    }
}
