package com.softserve.edu.hw4;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}

}

public class AppEmployee {
	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		emps[0] = new Employee("Ivan", "IT");
		emps[1] = new Employee("Petro", "QC");
		emps[2] = new Employee("Stepan", "Academy");
		emps[3] = new Employee("Ihor", "IT");
		emps[4] = new Employee("Roman", "IT");
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("dep = ");
		String dep = sc.nextLine();
		//
		for (Employee current : emps) {
			if (current.getDepartment().trim().equalsIgnoreCase(dep)) {
				System.out.println(current);
			}
		}
		//
		for (int i = 0; i < emps.length; i++) {
			if (emps[i].getDepartment().trim().equalsIgnoreCase(dep)) {
				System.out.println(emps[i]);
			}
		}
	}

}
