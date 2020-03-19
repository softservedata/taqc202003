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
		if (this == obj) {
			return true;
		}
		if (obj == null) {
		
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;{
		if (department == null) {
			if (other.department != null)
				return false;
		
		} else {if (!department.equals(other.department))
			return false;
		}
		if (name == null) {
			if (other.name != null)
		return false;
		} else { if (!name.equals(other.name))
			return false;
		}
		return true;
	}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}

}

public class ApplEmployee {
public static void main (String []args) {
	Employee [] emps = new Employee [5];
	emps[0]= new Employee ("Olena","NET");
	emps[1]= new Employee ("Iryna","Shell");
	emps[2]= new Employee ("Halyna","NET");
	emps[3]= new Employee ("Vika","RWS");
	emps[4]= new Employee ("Milena","Reserve");
	
	Scanner sc = new Scanner(System.in);{
		System.out.println("dep =" );
		String dep =sc.nextLine();
		for (Employee current:emps) {
			
		for (int i=0; i<emps.length; i++) {
			if (emps[i].getDepartment().trim().equalsIgnoreCase(dep)) {
				System.out.print(emps[i]);
			}
		}
		}
	}
}
}

		
	
