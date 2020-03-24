package com.softserve.edu.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Student implements Comparable<Student> {

	public static class NameComparator implements Comparator<Student> {
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	public static class IdComparator implements Comparator<Student> {
		public int compare(Student o1, Student o2) {
			return o1.getId() - o2.getId();
		}
	}

	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

//	public int compareTo(Student obj) {
//		return this.getId() - obj.getId();
//	}

	public int compareTo(Student obj) {
		return this.getName().compareTo(obj.getName());
	}

}

public class AppSort {

	public static void main(String[] args) {
		/*-
		String[] arr = { "ivan", "petro", "ira", "andriy", "vasyl", "stepan" };
		System.out.println("original: arr = " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorted: arr = " + Arrays.toString(arr));
		*/
		//
		/*-
		Student[] arr = { new Student(10, "ivan"), new Student(2, "petro"), new Student(12, "ira"),
				new Student(5, "andriy"), new Student(8, "vasyl"), new Student(1, "stepan") };
		System.out.println("original: arr = " + Arrays.toString(arr));
		Arrays.sort(arr, new Student.IdComparator());
		System.out.println("sorted: arr = " + Arrays.toString(arr));
		*/
		//
		/*-
		List<Student> list = new ArrayList<>();
		list.add(new Student(10, "ivan"));
		list.add(new Student(2, "petro"));
		list.add(new Student(12, "ira"));
		list.add(new Student(5, "andriy"));
		list.add(new Student(8, "vasyl"));
		list.add(new Student(1, "stepan"));
		//
		System.out.println("original list = " + list);
		//Collections.sort(list, new Student.IdComparator());
		//Collections.sort(list);
		list.sort(new Student.IdComparator());
		System.out.println("sorted list = " + list);
		*/
		//
		/*-
		//Set<Student> set = new TreeSet<>(new Student.IdComparator());
		Set<Student> set = new TreeSet<>();
		set.add(new Student(10, "ivan"));
		set.add(new Student(2, "petro"));
		set.add(new Student(12, "ira"));
		set.add(new Student(5, "andriy"));
		set.add(new Student(8, "vasyl"));
		set.add(new Student(1, "stepan"));
		System.out.println(set);
		*/
		//
		Map<String, String> mapA = new HashMap<>();
		mapA.put("key1", "one");
		mapA.put("key2", "two");
		System.out.println("mapA.get(key2) = " + mapA.get("key2"));
		//
		for (Map.Entry<String, String> entry : mapA.entrySet()) {
			System.out.println("key= " + entry.getKey() + "   value = 	" + entry.getValue());
		}
		//
	}
}
