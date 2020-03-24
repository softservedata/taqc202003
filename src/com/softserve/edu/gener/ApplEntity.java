package com.softserve.edu.gener;

public class ApplEntity {
	public static void main(String[] args) {
		MyEntity<OneEntity> me = new MyEntity<>();
		//MyEntity<Integer> me = new MyEntity<>(); // Compile Error
		me.run(new OneEntity());
	}
}
