package com.softserve.edu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		driver.manage().window().maximize();
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
		// throw new RuntimeException("HaHaHa"); // Test fail, AfterClass running
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\t@After method");
		// logout, get(urlLogout), delete cookie, delete cache
		// throw new RuntimeException("HaHaHa"); // Test fail, AfterClass running
	}

	// @Test
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
		// usd.click(); // Refresh page
		//
		currency.click(); // Error after Refresh page
		System.out.println("Closed usd.isEnabled() = " + usd.isEnabled());
		System.out.println("Closed usd.isDisplayed() = " + usd.isDisplayed());
		// usd.click(); // error, element not clicable
		Thread.sleep(1000); // For Presentation Only
	}

	//@Test
	public void findByXPath() throws Exception {
		System.out.println("\t\t@Test findByXPath()");
		// Precondition
		// Choose Curency
		driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']")).click();
		Thread.sleep(1000); // For Presentation Only
		driver.findElement(By.xpath("//button[@name='EUR']")).click();
		Thread.sleep(1000); // For Presentation Only
		//
		// Steps
		// Type Search Field
		driver.findElement(By.xpath("//input[@name='search']")).click();
		driver.findElement(By.xpath("//input[@name='search']")).clear();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("mac");
		Thread.sleep(1000); // For Presentation Only
		//
		// Click Search Button
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Thread.sleep(1000); // For Presentation Only
		//
		// Check
//			WebElement price = driver
//					.findElement(By.xpath("//a[text()='MacBook']/../following-sibling::p[@class='price']"));
		WebElement axe = driver.findElement(By.xpath("//div[contains(@class,'product-layout')]//a[text()='MacBook']"));
		//
		// Scrolling by Action class
//		Actions action = new Actions(driver);		
//		action.moveToElement(axe).perform();
//		Thread.sleep(4000); // For Presentation Only
		//
		// Scrolling by JavaScript injection
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", axe);
		Thread.sleep(4000); // For Presentation Only
		//
		WebElement price = axe.findElement(By.xpath("./../following-sibling::p[@class='price']"));
		Assert.assertTrue(price.getText().contains("472.33"));
		//
		// Return to Previous State
		driver.findElement(By.xpath("//img[contains(@src, '/logo.png')]")).click();
		Thread.sleep(1000); // For Presentation Only
	}
	
	private WebElement getElementByName(String name) {
		WebElement result = null;
		List<WebElement> containers = driver.findElements(By.cssSelector("div.product-layout.product-grid"));
		for (WebElement current : containers) {
			if (current.findElement(By.cssSelector("h4 > a")).getText().equals(name)) {
				result = current;
				break;
			}
		}
		if (result == null) {
			// Develop Custom Exception
			throw new RuntimeException("WebElement by title/name: " + name + " not found");
		}
		return result;
	}
	
	@Test
	public void findByCss() throws Exception {
		System.out.println("\t\t@Test findByCss()");
		// Precondition
		// Choose Curency
		driver.findElement(By.cssSelector("button.btn.btn-link.dropdown-toggle")).click();
		Thread.sleep(1000); // For Presentation Only
		driver.findElement(By.cssSelector("[name='USD']")).click();
		Thread.sleep(1000); // For Presentation Only
		//
		// Steps
		driver.findElement(By.cssSelector("#search > input")).click();
		driver.findElement(By.cssSelector("#search > input")).clear();
		driver.findElement(By.cssSelector("#search > input")).sendKeys("mac");
		Thread.sleep(1000); // For Presentation Only
		//
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		Thread.sleep(1000); // For Presentation Only
		//
		/*-
		//driver.findElement(By.cssSelector("a:contains('MacBook')")).click(); // ERROR
		//WebElement temp = driver.findElement(By.cssSelector("div.product-layout.product-grid div:has(> h4 > a[href*='id=43']) > p[class='price']")); // Error
		//WebElement price1 = driver.findElement(By.cssSelector("#content > div:nth-child(8) > div:nth-child(2) > div > div:nth-child(2) > div.caption > p.price")); //Ok
		// Search a $("div.product-layout.product-grid h4 > a")
		// Search h4 $("div.product-layout.product-grid h4:has(> a)")
		// Search Price $("div.product-layout.product-grid h4:has(> a[href*='id=43']) + p + p")
		// Search Price $("div.product-layout.product-grid div:has(> h4 > a[href*='id=43']) > p[class='price']")
		*/
		//
		// Check
		// WebElement price =
		// driver.findElement(By.cssSelector("div.product-layout.product-grid div:has(> h4 > a[href*='id=43']) > p.price")); // id=43 Hardcode Invalid Solution
		WebElement price = getElementByName("MacBook").findElement(By.cssSelector("p.price"));
		Assert.assertTrue(price.getText().contains("$602.00"));
		//
		// Return to Previous State
		driver.findElement(By.cssSelector("#logo .img-responsive")).click();
		Thread.sleep(2000); // For Presentation Only
	}
	
}
