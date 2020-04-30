package com.softserve.edu.opencart.pages;

import org.openqa.selenium.WebDriver;

import com.softserve.edu.opencart.data.Currencies;
import com.softserve.edu.opencart.data.Product;

public class SearchSuccessPage extends TopPart {

	private ProductsContainerComponent productsContainerComponent;

	public SearchSuccessPage(WebDriver driver) {
		super(driver);
		initElements();
	}

	private void initElements() {
		// init elements
		productsContainerComponent = new ProductsContainerComponent(driver);
	}

	// Page Object

	// productsContainerComponent

	public ProductsContainerComponent getProductsContainer() {
		return productsContainerComponent;
	}

	// Functional
	
	public String getProductComponentPriceByName(Product product) {
		return getProductsContainer().getProductComponentPriceByProduct(product);
	}

	// Business Logic

	public SearchSuccessPage chooseCurrency(Currencies currency) {
		clickCurrencyByPartialName(currency);
		return new SearchSuccessPage(driver);
	}
	
}
