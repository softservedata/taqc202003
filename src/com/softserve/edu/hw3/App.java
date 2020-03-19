package com.softserve.edu.hw3;

public class App {
    private final int num = 10;
	
    public void m1() {
    	int localNum = num;
    	//num++;
    	localNum++;
    }
    
	public static void main(String[] args) {
		int k = 0;
		k++;
		//final int i = 50;
		int i = 50;
		int j = i-- + k;
		//
		App app = new App();
		System.out.println("origin num = " + app.num);
		app.m1();
		System.out.println("next num = " + app.num);
	}
}
