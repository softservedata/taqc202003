package com.softserve.edu;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
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
		//throw new RuntimeException("HaHaHa"); // Test fail, AfterClass running
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\t@After method");
		// logout, get(urlLogout), delete cookie, delete cache
		//throw new RuntimeException("HaHaHa"); // Test fail, AfterClass running
	}

	@Test
	public void checkVisible() throws Exception {
		System.out.println("\t\t@Test findByCss()");
		// Choose Curency
		WebElement currency = driver.findElement(By.cssSelector("button.btn.btn-link.dropdown-toggle"));
		currency.click();
		Thread.sleep(1000); // For Presentation Only
		//
		WebElement usd = driver.findElement(By.cssSelector("[name='USD']"));
		Thread.sleep(1000); // For Presentation Only
		//
		System.out.println("Opened usd.isEnabled() = " + usd.isEnabled());
		System.out.println("Opened usd.isDisplayed() = " + usd.isDisplayed());
		Thread.sleep(1000); // For Presentation Only
		//usd.click(); // Refresh page
		//
		currency.click(); // Error after Refresh page
		System.out.println("Closed usd.isEnabled() = " + usd.isEnabled());
		System.out.println("Closed usd.isDisplayed() = " + usd.isDisplayed());
		//usd.click(); // error, element not clicable
		Thread.sleep(1000); // For Presentation Only
	}
}
