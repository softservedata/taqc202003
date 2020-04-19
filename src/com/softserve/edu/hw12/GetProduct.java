package com.softserve.edu.hw12;

public enum GetProduct {
	
    MACBOOK("MacBook"),
    IPHONE("iPhone 3"),
    APPLE_CINEMA("Apple Cinema 30\""),
    CANON("Canon EOS 5D");
	
    private String product;

	public String getProduct() {
		return product;
	}

	private GetProduct(String product) {
		this.product = product;
	}
	

}
