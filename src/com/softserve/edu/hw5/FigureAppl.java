package com.softserve.edu.hw5;

public class FigureAppl {
	public static void main(String[] args) {
		Figure[] figures= { new Rectangle(3,2),new Rectangle (6,5), new Square (8),new Square (2.3),};
		
		 for (Figure figure: figures) {
	            System.out.println("Perimeter  is = " + figure.getPerimeter());
	        }
	    }
	}
	

