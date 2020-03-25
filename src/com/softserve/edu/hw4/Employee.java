package com.softserve.edu.hw4;

import java.util.Scanner;

public class Employee {

	String name;
	String department;
	static Employee[] work1 = new Employee[5];

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
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
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

	public static void main(String[] args) {

		Employee[] work2 = { new Employee("Anakin Skywalker", "Front-end"), 
				new Employee("Yoda", "Front-end"),
				new Employee("Darth Vader", "Back-end"), 
				new Employee("R2D2", "Back-end"),
				new Employee("C-3PO", "QA"), };

		String dep;
		System.out.println("enter a department (e.i. Front-end, Back-end, QA) ");
		Scanner cs = new Scanner(System.in);
		dep = cs.nextLine();
		
		for (Employee current: work2) {
			if (dep.toLowerCase().trim().equals(current.getDepartment().toLowerCase())) {
				System.out.println("The employee you are looking for is: " + current.getName());
			}

			
//		else for (Employee current1: work2) {
//				if (dep.toLowerCase().trim()!=(current1.getDepartment().toLowerCase()))
//				System.out.println("No such department");
			

		}
	}
	}




