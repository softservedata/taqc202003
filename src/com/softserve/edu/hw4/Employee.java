package com.softserve.edu.hw4;

import java.util.Objects;

public class Employee {
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
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return department.equals(employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department);
    }

    @Override
    public String toString() {
        return "Employee name = " + name +
                ", Department = " + department;
    }
}
