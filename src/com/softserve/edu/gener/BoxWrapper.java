package com.softserve.edu.gener;

public class BoxWrapper {
	
	private Box box;

	public BoxWrapper() {
		box = new Box();
	}
	
	public String get() {
		return (String) box.get();
	}

	public void set(String obj) {
		box.set(obj);
	}
}
