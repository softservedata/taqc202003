package com.softserve.edu.hw13;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.softserve.edu.hw13.productdata.GetProduct;
import com.softserve.edu.hw13.productdata.ProductItems;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITestMaven {
	private static WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite class UITestMaven beforeSuite()");
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
	public static void tearDownAfterClass() throws Exception {
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
        return new Object[][] {
                  {GetProduct.MACBOOK, GetProduct.IPHONE, new ProductItems("3") },  
        };
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

	@Test(dataProvider = "searchData")
	public void CartTest(GetProduct product1 , GetProduct product2, ProductItems amount ) throws Exception {
		//MAC
		System.out.println("\t\t@Adding Macbook to cart");
		
		getElementByName(product1.getProduct()).findElement(By.xpath(".//button[contains(@onclick,'cart.add')]")).click();
		Thread.sleep(2000);
		
		WebElement addMac = driver.findElement(By.cssSelector("div.alert.alert-success"));
		System.out.println("Mac to cart: " + addMac.getText());
		
		Assert.assertTrue(addMac.getText().contains(product1.getProduct()),"Mac insn't added to cart!");
		
		//IPHONE
		System.out.println("\t\t@Adding iPhone 3 to cart");
		getElementByName(product2.getProduct()).findElement(By.xpath(".//button[contains(@onclick,'cart.add')]")).click();
		Thread.sleep(2000);
		
		WebElement addPhone = driver.findElement(By.cssSelector("div.alert.alert-success"));
		System.out.println("iPhone to cart: " + addPhone.getText());
		
		Assert.assertTrue(addPhone.getText().contains(product2.getProduct()), "Iphone insn't added to cart!");
		
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
        expectedCart.add(product2.getProduct());
        expectedCart.add(product1.getProduct());
       
        Assert.assertEquals(expectedCart, inCart, "The cart doesn't include all elements");
        
        //change the number of iPhones
        driver.findElements(By.xpath("//table[@class='table table-bordered']//a[text()='iPhone 3']/../following-sibling::td//input")).get(0).click();
        driver.findElements(By.xpath("//table[@class='table table-bordered']//a[text()='iPhone 3']/../following-sibling::td//input")).get(0).clear();
        driver.findElements(By.xpath("//table[@class='table table-bordered']//a[text()='iPhone 3']/../following-sibling::td//input")).get(0).sendKeys(amount.getProduct());
        driver.findElements(By.xpath("//table[@class='table table-bordered']//a[text()='iPhone 3']/../following-sibling::td//input")).get(0).submit();
        Thread.sleep(2000);
        
		WebElement editingPhone = driver.findElement(By.cssSelector("div.alert.alert-success"));
		System.out.println("cart editing: " + editingPhone.getText());
		Assert.assertTrue(editingPhone.getText().contains("Success"),"The Cart insn't eddited!");
		
		driver.navigate().refresh();
		String PhoneValue = driver.findElements(By.xpath("//table[@class='table table-bordered']//a[text()='iPhone 3']/../following-sibling::td//input")).get(0).getAttribute("value") ;
		System.out.println("the new number of iPhones: " + PhoneValue);
		Assert.assertEquals(amount.getProduct(),PhoneValue,"the new number of iPhones hasn't been changed");
	}
	
}
