package com.softserve.edu.gener;

public class MyEntity<T extends Entity> {

	public void run(T entity) {
		entity.id();
	}
}
