package com.softserve.edu.hw4;

import java.util.Objects;
import java.util.Scanner;

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

public class AppEmployee {
    public static void main(String[] args) {
        Employee[] emp = new Employee [5];
        emp [0] = new Employee("Ivanov", "IT");
        emp [1] = new Employee("Petrov", "Tech Support");
        emp [2] = new Employee("Sidorov", "Call Centre");
        emp [3] = new Employee("Ivanova", "IT");
        emp [4] = new Employee("Sidorova", "Tech Support");

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Department");
        String dept = scn.nextLine();
        for (Employee current: emp) {
            if (current.getDepartment().trim().equalsIgnoreCase(dept)) {
               System.out.println(current);
            }
        }


    }

    }

