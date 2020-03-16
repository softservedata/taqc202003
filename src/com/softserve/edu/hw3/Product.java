package com.softserve.edu.hw3;

public class Product {
	private String ProdName;
	private double ProdPrice;
	
public Product (String ProdName, double ProdPrice) {
		
		this.ProdName = ProdName;
		this.ProdPrice = ProdPrice;
	}
	
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public double getProdPrice() {
		return ProdPrice;
	}
	public void setProdPrice(double prodPrice) {
		ProdPrice = prodPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ProdName == null) ? 0 : ProdName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(ProdPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Product other = (Product) obj;
		if (ProdName == null) {
			if (other.ProdName != null)
				return false;
		} else if (!ProdName.equals(other.ProdName))
			return false;
		if (Double.doubleToLongBits(ProdPrice) != Double.doubleToLongBits(other.ProdPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [ProdName=" + ProdName + ", ProdPrice=" + ProdPrice + "]";
	}

}
