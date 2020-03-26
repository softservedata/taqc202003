package com.softserve.edu.hw6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Student {

	public static class NameComparator implements Comparator<Student> {
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	private String name;

	public Student(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student_name= " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class Task1 {

	public static void main(String[] args) {

		Set<Student> group1 = new TreeSet<>(new Student.NameComparator());
		// Set<Student> set = new TreeSet<>();
		group1.add(new Student("oleg"));
		group1.add(new Student("petro"));
		group1.add(new Student("ira"));
		group1.add(new Student("andriy"));
		group1.add(new Student("vasyl"));
		group1.add(new Student("alex"));
		group1.add(new Student("ivan"));
		group1.add(new Student("nadia"));
		group1.add(new Student("lesia"));

		System.out.println("First group:");
		System.out.println(group1);

		Set<Student> group2 = new TreeSet<>(new Student.NameComparator());
		// Set<Student> set = new TreeSet<>();
		group2.add(new Student("mykyta"));
		group2.add(new Student("katia"));
		group2.add(new Student("roman"));
		group2.add(new Student("andriy"));
		group2.add(new Student("vasyl"));
		group2.add(new Student("alex"));
		group2.add(new Student("ivan"));
		group2.add(new Student("vaselysa"));
		group2.add(new Student("lesia"));

		System.out.println("\nSecond group:");
		System.out.println(group2);

		System.out.println("\nThe list of the identical names:");
		List<Student> SameNames = new ArrayList<>(group2);
		SameNames.retainAll(group1);

		// https://ru.stackoverflow.com/questions/591536/%D0%A7%D1%82%D0%BE-%D0%B7%D0%B0-%D0%BC%D0%B5%D1%82%D0%BE%D0%B4%D1%8B-removeall-%D0%B8-retainall
		if (SameNames.isEmpty()) {
			System.out.println("There are no identical names for 2 groups");
		} else {
			System.out.println(SameNames);
		}

	}
}
