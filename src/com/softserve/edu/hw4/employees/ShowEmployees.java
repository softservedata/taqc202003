package com.softserve.edu.hw4.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowEmployees {

    String reader = " ";

    Employee[] employees = {new Employee("Jack", "hr"), new Employee("Mary", "engineering"),
            new Employee("Ana", "engineering"), new Employee("John", "tech"),
            new Employee("Ben", "iot"),};


    public void scanner() {

        System.out.println("Please enter employee's department: ");
        Scanner scanner = new Scanner(System.in);
        reader = scanner.next().toLowerCase();

    }

    public void printEmployeeName() {
        scanner();
        List<String> employeesFound = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getDepartment().equals(reader)) {
                String name = employee.getName();
                System.out.println(name);
                employeesFound.add(name);
            }
        }
        if (employeesFound.size() == 0) {
            System.out.println("There are no employees in this department");
        }
    }

    public static void main(String[] args) {

        ShowEmployees showEmployees = new ShowEmployees();
        showEmployees.printEmployeeName();

    }

}
