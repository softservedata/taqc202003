package com.softserve.edu.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class My {
	private String name;

	public My(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
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
		My other = (My) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "My [name=" + name + "]";
	}

}

public class FindDups {

	public static void main(String[] args) {
		/*-
		Set<String> s = new HashSet<>();
		for (int i = 0; i < args.length; i++) {
			if (!s.add(args[i]))
				System.out.println("Duplicate detected: " + args[i]);
		}
		System.out.println(s.size() + " distinct words detected: " + s);
		*/
		//
		// *
		My[] my = { new My("Ivan"), new My("Petro"), new My("Ivan"), new My("Petro"), new My("Ira") };
		//
		Set<My> s = new HashSet<>();
		//List<My> s = new ArrayList<>();
		for (int i = 0; i < my.length; i++) {
			if (!s.add(my[i]))
				System.out.println("Duplicate detected: " + my[i]);
		}
		System.out.println(s.size() + " distinct words detected: " + s);
		// */
	}
}
