package com.softserve.edu.hw4;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
    //Написати клас Employee з полями name та department.
    // Клас повинен містити конструктор з ініціалізацією полів,
    // геттери та сеттери, методи equals та toString.
    //Створити масив об'єктів класу Employee (не менше п'яти).
    // Прочитати з клавіатури назву відділу. Вивести всіх працівників, які належать цьому відділу.

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
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee employee[] = new Employee[5];
        employee[0] = new Employee("Olena","SDO");
        employee[1] = new Employee("Pavlo","QMO");
        employee[2] = new Employee("Iryna","HR");
        employee[3] = new Employee("Dmytro","Admin");
        employee[4] = new Employee("Anna","HR");

        System.out.println("Please enter department (QMO, SDO, HR, Admin): ");
        Scanner scanner = new Scanner(System.in);
        String departName = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < employee.length; i++) {
            if (departName.equals(employee[i].getDepartment())){
                System.out.println("There is such employee in this department: " +employee[i].getName());
            }
        }



    }
}
