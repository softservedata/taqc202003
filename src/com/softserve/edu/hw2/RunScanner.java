package com.softserve.edu.hw2;
import java.util.Scanner;
public class RunScanner {

	public static void main(String[] args) {
		System.out.println("What is your name?' and click <Enter>:");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Hello, " + name);
		scan.close();
		}
		}