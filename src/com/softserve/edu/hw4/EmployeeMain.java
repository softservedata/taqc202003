package com.softserve.edu.hw4;
import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employee = new Employee[9];
        employee[0] = new Employee("Ivan", "Business Analysis");
        employee[1] = new Employee("Serhii", "Front-End");
        employee[2] = new Employee("Anna", "Human Relations");
        employee[3] = new Employee("Marina", "Quality Assurance");
        employee[4] = new Employee("Oleksiy", "PMO");


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Select department:");
        String department = sc1.nextLine();
        sc1.close();


        //
        for (Employee current : employee) {
            if (current.getDepartment().trim().equalsIgnoreCase(department)) {
                System.out.println(current);
            }
        }
        //
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment().trim().equalsIgnoreCase(department)) {
                System.out.println(employee[i]);
            }
        }
    }
}
