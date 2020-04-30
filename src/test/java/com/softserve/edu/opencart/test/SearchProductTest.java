package com.softserve.edu.opencart.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.edu.opencart.data.Currencies;
import com.softserve.edu.opencart.data.Product;
import com.softserve.edu.opencart.data.ProductRepository;
import com.softserve.edu.opencart.data.SearchItem;
import com.softserve.edu.opencart.data.SearchItemReposotory;
import com.softserve.edu.opencart.pages.HomePage;
import com.softserve.edu.opencart.pages.SearchSuccessPage;

public class SearchProductTest extends EpizyUserTestRunner {

	@DataProvider
	public Object[][] searchData() {
		return new Object[][] {
			{ Currencies.EURO,
				SearchItemReposotory.searchMacBook(),
				ProductRepository.getMacBook() },
		};
	}
	
	@Test(dataProvider = "searchData")
	public void findByXPath(Currencies currency, SearchItem searchItem, Product product) {
		HomePage homepage = loadApplication()
				.chooseCurrency(currency);
		presentationSleep();
		//
		SearchSuccessPage searchSuccessPage = homepage
				.successfulSearch(searchItem);
		presentationSleep();
		//
		Assert.assertTrue(searchSuccessPage
				.getProductComponentPriceByName(product)
				.contains(product.getPrice(currency)));
		presentationSleep();
		//
		homepage = searchSuccessPage
				.gotoHomePage();
		presentationSleep();
	}
}
