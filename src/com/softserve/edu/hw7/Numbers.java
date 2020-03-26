package com.softserve.edu.hw7;

import java.util.Comparator;

public class Numbers {
	 public static class NameComparator implements Comparator<Numbers>{

		
		public int compare(Numbers o1, Numbers o2) {
			
			return ( o1).getNumbersName().compareTo(o2.getNumbersName());
		}
		 
	 }
	private String numbersName;

	public Numbers(String numbersName) {
		this.numbersName = numbersName;

	}

	public String getNumbersName() {
		return numbersName;
	}

	public void setNumbersName(String numbersName) {
		this.numbersName = numbersName;
	}

	@Override
	public String toString() {
		return "Numbers [numbersName=" + numbersName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numbersName == null) ? 0 : numbersName.hashCode());
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
		Numbers other = (Numbers) obj;
		if (numbersName == null) {
			if (other.numbersName != null)
				return false;
		} else if (!numbersName.equals(other.numbersName))
			return false;
		return true;
	}

	public static Comparator getNameComparator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
