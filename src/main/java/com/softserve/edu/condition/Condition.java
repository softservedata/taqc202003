package com.softserve.edu.condition;

public class Condition {

	public static void main(String[] args) throws Exception {
		/*-
		int x = 5;
		int y = -5;
		boolean b = x < y;
		System.out.println("b=" + b);
		System.out.println(x == y); // false
		System.out.println(x != y); // true
		System.out.println(x >= y); // true
		*/
		//
		/*-
		int i = 1;
		int y = 2;
		// int z = i++ + y;
		int z = i++ + ++y;
		System.out.println("i=" + i + " y=" + y + " z=" + z);
		*/
		//
		/*-
		int i = 1;
		int j = 2;
		int k = i | j;
		System.out.println("k=" + k);
		*/
		//
		/*-
		int t = 5, s = 4, v = 7;
		System.out.println(t > s && t > v || s < v); // true
		System.out.println((t < v || s > v) && t < s); // false
		*/
		//
		/*-
		int a = 3, b = 2;
		String str2;
		//		if (--a == b) {
		//			str2 = "yes";
		//		} else {
		//			str2 = "no";
		//		}
		str2 = a-- == b ? "yes" : "no";
		System.out.println("str2 = " + str2);
		*/
		//
		/*-
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Do you enjoy Java? (yes/no/maybe)");
		String input = br.readLine();
		//
		switch (input.toLowerCase()) {
		case "yes":
			System.out.println("yes");
		case "maybe":
			System.out.println("Great!");
			break;
		case "no":
			System.out.println("Too bad!");
			break;
		default:
			System.out.println("Wrong!");
		}
		*/
		//
		Student st1 = new Student("Ivan", 22);
		Student st2 = new Student("Ivan", 22);
		System.out.println("st1 == st2  is: " + (st1 == st2)); // Error
		System.out.println("st1.equals(st2)  is: " + st1.equals(st2));
		System.out.println("st1.hashCode()  is: " + st1.hashCode());
		System.out.println("st2.hashCode()  is: " + st2.hashCode());
		//
		Student[] arr1 = new Student[3];
		arr1[0] = new Student("Ivan", 21);
		arr1[1] = new Student("Petro", 23);
		arr1[2] = new Student("Stepan", 25);
		//
		Student[] arr2 = {new Student("Ivan", 21), new Student("Petro", 23), new Student("Stepan", 25)};
		//
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i].toString());
		}
		//
		String s1 = "123";
		String s2 = new String("123");
	}
}
