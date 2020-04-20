package com.softserve.edu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.edu.opencart.data.Currencies;
import com.softserve.edu.opencart.data.SearchItem;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchNgTest {
	private static WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite class SearchNgTest beforeSuite()");
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
	}

	@BeforeClass
	public void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
		Thread.sleep(1000); // For Presentation Only
		driver.quit();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		System.out.println("\t@Before method");
		driver.get("http://taqc-opencart.epizy.com/");
		Thread.sleep(1000); // For Presentation Only
	}

	@AfterMethod
	public void tearDown() throws Exception {
		System.out.println("\t@After method");
		// logout, get(urlLogout), delete cookie, delete cache
	}

	@DataProvider
	public Object[][] searchData() {
		return new Object[][] { { Currencies.EURO, new SearchItem("mac") }, };
	}

	@Test(dataProvider = "searchData")
	public void findByXPath(Currencies currency, SearchItem searchItem) throws Exception {
		System.out.println("\t\t@Test findByXPath()");
		// Precondition
		// Choose Curency
		driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']")).click();
		Thread.sleep(1000); // For Presentation Only
		driver.findElement(By.xpath("//button[@name='" + currency.getAttributeName() + "']")).click();
		Thread.sleep(1000); // For Presentation Only
		//
		// Steps
		// Type Search Field
		driver.findElement(By.xpath("//input[@name='search']")).click();
		driver.findElement(By.xpath("//input[@name='search']")).clear();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(searchItem.getSearchText());
		Thread.sleep(1000); // For Presentation Only
		//
		// Click Search Button
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Thread.sleep(1000); // For Presentation Only
		//
		// Check
//		WebElement price = driver
//		.findElement(By.xpath("//a[text()='MacBook']/../following-sibling::p[@class='price']"));
		WebElement axe = driver.findElement(By.xpath("//div[contains(@class,'product-layout')]//a[text()='MacBook']"));
		//
		// Scrolling by Action class
//			Actions action = new Actions(driver);		
//			action.moveToElement(axe).perform();
//			Thread.sleep(4000); // For Presentation Only
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
}
