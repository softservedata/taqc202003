package com.softserve.edu.hw5;

public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Figure square1 = new Square (2.2);
		 Figure square2 = new Square (3.3); 
		 Figure rectangle1 = new Rectangle (2.2, 3.3); 
		 Figure rectangle2 = new Rectangle (2, 3);
		 Figure rectangle3 = new Rectangle (210, 75);

		 Figure[] figures = {square1, square2, rectangle1, rectangle2, rectangle3};
	        
	        for (int i = 0; i < figures.length; i++) {
	        	
	        	 System.out.println(figures[i].perumetr());
	        }
	}

}
