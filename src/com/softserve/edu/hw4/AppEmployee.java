package com.softserve.edu.hw4;

import java.util.Arrays;
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

		System.out.println("\n ========HOMEWORK #4=============");

		Integer numbers[] = new Integer[10];
		int j = 1;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Input number#" + j++ + " : ");
			numbers[i] = Integer.parseInt(sc.nextLine());
		}

		System.out.println("numbers= " + Arrays.toString(numbers));

/////////task1

		System.out.println("\n ========HOMEWORK #4.1=============");
		int sum = 0;
		for (int num : numbers) {
			if (num > 0) {
				sum = sum + num;
			}
		}
		System.out.println("Sum of positive elements: " + sum);

/////////task2
		System.out.println("\n ========HOMEWORK #4.2=============");

		int countmin = 0;
		int min = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0 && numbers[i] < min) {
				min = numbers[i];
				countmin++;
			}
		}
		if (countmin == 0) {
			System.out.println("There's no negative elements in the array");
		} else {
			System.out.println("Max negatime element is: " + min);
		}

		///////// task3
		System.out.println("\n ========HOMEWORK #4.3=============");
		Employee[] emps = new Employee[9];
		emps[0] = new Employee("Mark", "HR");
		emps[1] = new Employee("Oleksandr", "DEV");
		emps[2] = new Employee("Vasyl", "PM");
		emps[3] = new Employee("Alex", "ATQC");
		emps[4] = new Employee("Dmytro", "DEV");
		emps[5] = new Employee("Lesia", "DEV");
		emps[6] = new Employee("Sergiy", "ATQC");
		emps[7] = new Employee("Denys", "HR");
		emps[8] = new Employee("Roman", "DEV");

		Scanner sc1 = new Scanner(System.in);
		System.out.println("\n Specify the departnent (HR/DEV/PM/ATQC)?");
		String dep = sc1.nextLine();
		sc1.close();

		int deps = 0;
		for (Employee current : emps) {
			if (current.getDepartment().equalsIgnoreCase(dep)) {
				System.out.println(current);
				deps++;
			}

		}
		if (deps == 0) {
			System.out.println("Invalin input - there's no such department like " + "< " + dep + "  >");
		}

	}

}
