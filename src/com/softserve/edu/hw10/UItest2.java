package com.softserve.edu.hw10;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UItest2 {
	private static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
		Thread.sleep(1000); // For Presentation Only
		driver.quit();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("\t@Before method");
		driver.get("http://taqc-opencart.epizy.com/");
		Thread.sleep(1000); // For Presentation Only
		//throw new RuntimeException("CHECK!!"); // Test fail, AfterClass running
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\t@After method");
		// logout, get(urlLogout), delete cookie, delete cache
		//throw new RuntimeException("CHECK!!"); // Test fail, AfterClass running
	}

	@Test
	public void CurrencyTest() throws Exception {
		System.out.println("\t\t@CurrencyTest");
		// Choose Curency
		WebElement currency_state1 = driver.findElement(By.cssSelector("button.btn.btn-link.dropdown-toggle"));
		currency_state1.click();
		System.out.println("original currency : " + currency_state1.getText());
		//Thread.sleep(1000); // For Presentation Only
		//
		WebElement gbp_state1 = driver.findElement(By.cssSelector("[name='GBP']"));
		//Thread.sleep(1000); // For Presentation Only
		gbp_state1.click(); // Refresh page
		//Thread.sleep(1000); // For Presentation Only
		WebElement currency_state2 = driver.findElement(By.cssSelector("button.btn.btn-link.dropdown-toggle"));
		currency_state2.click(); 
		//Thread.sleep(1000); // For Presentation Only
		System.out.println("new currency: " + currency_state2.getText());
		
		String expected = "£";
		Assert.assertTrue(currency_state2.getText().equals(expected));
		
	}
	
	@Test
	public void SearchMacTest() throws Exception {
		System.out.println("\t\t@ SearchMacTest");
		
		driver.findElement(By.linkText("Laptops & Notebooks")).click();
		//Thread.sleep(1000); // For Presentation Only
		driver.findElement(By.partialLinkText("Macbook")).click();
		//Thread.sleep(1000); // For Presentation Only
		
		List<WebElement> search = driver.findElements(By.cssSelector("div.caption a"));
		int Macfound = 0;
        for (WebElement elem : search) {
        	System.out.println("found:  " + elem.getText()) ;
        	if (elem.getText().toLowerCase().contains("macbook")) {
        		Macfound++;
    		}
        	
        }
        System.out.println("The number of MacBooks found: " + Macfound);
        Assert.assertTrue("There's no Mac in the page found",Macfound >= 1);
		
	}
}