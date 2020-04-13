package com.softserve.edu.hw11;

import java.util.ArrayList;
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

public class X_CssTest {
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
	
	private WebElement getElementByName(String name) {
		WebElement result = null;
		List<WebElement> containers = driver.findElements(By.cssSelector("div.product-layout"));
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
	public void CartTest() throws Exception {
		//MAC
		System.out.println("\t\t@Adding Macbook to cart");
		
		getElementByName("MacBook").findElement(By.xpath(".//button[contains(@onclick,'cart.add')]")).click();
		Thread.sleep(2000);
		
		WebElement addMac = driver.findElement(By.cssSelector("div.alert.alert-success"));
		System.out.println("Mac to cart: " + addMac.getText());
		
		Assert.assertTrue("Mac insn't added to cart!",addMac.getText().contains("MacBook"));
		
		//IPHONE
		System.out.println("\t\t@Adding iPhone 3 to cart");
		getElementByName("iPhone 3").findElement(By.xpath(".//button[contains(@onclick,'cart.add')]")).click();
		Thread.sleep(2000);
		
		WebElement addPhone = driver.findElement(By.cssSelector("div.alert.alert-success"));
		System.out.println("iPhone to cart: " + addPhone.getText());
		
		Assert.assertTrue("Mac insn't added to cart!",addPhone.getText().contains("iPhone 3"));
		
		//Go to Cart tab
		driver.findElement(By.xpath("//*[@id='top-links']//i[contains(@class, 'fa fa-shopping-cart')]")).click();
		
		//Checking if Mac and iPhone are present in the Cart
		System.out.println("\t\t@Checking a cart");
		
		List<WebElement> search = driver.findElements(By.xpath("//table[@class='table table-bordered']//a[text()]"));
		List<String> inCart = new ArrayList<>();
        for (WebElement elem : search) {
        	System.out.println("found:  " + elem.getText()) ;
        	inCart.add(elem.getText());
        }
        List<String> expectedCart = new ArrayList<String>();
        expectedCart.add("iPhone 3");
        expectedCart.add("MacBook");
       
        Assert.assertEquals ("The cart doesn't include all elements", expectedCart, inCart);
        
        //change the number of iPhones
        driver.findElements(By.xpath("//table[@class='table table-bordered']//a[text()='iPhone 3']/../following-sibling::td//input")).get(0).click();
        driver.findElements(By.xpath("//table[@class='table table-bordered']//a[text()='iPhone 3']/../following-sibling::td//input")).get(0).clear();
        driver.findElements(By.xpath("//table[@class='table table-bordered']//a[text()='iPhone 3']/../following-sibling::td//input")).get(0).sendKeys("2");
        driver.findElements(By.xpath("//table[@class='table table-bordered']//a[text()='iPhone 3']/../following-sibling::td//input")).get(0).submit();
        Thread.sleep(2000);
        
		WebElement editingPhone = driver.findElement(By.cssSelector("div.alert.alert-success"));
		System.out.println("cart editing: " + editingPhone.getText());
		Assert.assertTrue("The Cart insn't eddited!",editingPhone.getText().contains("Success"));
		
		driver.navigate().refresh();
		String PhoneValue = driver.findElements(By.xpath("//table[@class='table table-bordered']//a[text()='iPhone 3']/../following-sibling::td//input")).get(0).getAttribute("value") ;
		System.out.println("the new number of iPhones: " + PhoneValue);
		Assert.assertEquals("the new number of iPhones hasn't been changed","2",PhoneValue);
	}
	
}