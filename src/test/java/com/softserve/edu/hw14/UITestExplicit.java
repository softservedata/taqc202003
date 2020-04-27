package com.softserve.edu.hw14;

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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.softserve.edu.hw14.productdata.GetProduct;
import com.softserve.edu.hw14.productdata.SeachtItems;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITestExplicit {
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
		//driver.get("http://taqc-opencart.epizy.com/");
		//Thread.sleep(1000); // For Presentation Only

	}

	@AfterMethod
	public void tearDown() throws Exception {
		System.out.println("\t@After method");
		// logout, get(urlLogout), delete cookie, delete cache
	}
	
	@DataProvider
    public Object[][] getData() {
        return new Object[][] {
                  {GetProduct.MACBOOK},  
        };
    }
	@DataProvider
    public Object[][] getData1() {
        return new Object[][] {
                  {new SeachtItems("blablabla@mail.com")},  
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

	@Test(dataProvider = "getData")
	public void MacToCartTest(GetProduct product1) throws Exception {
		
		driver.get("http://taqc-opencart.epizy.com/");
		//MAC
		System.out.println("\t\t@Adding Macbook to cart");
		getElementByName(product1.getProduct()).findElement(By.xpath(".//button[contains(@onclick,'cart.add')]")).click();
		
		//Explicit
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//Explicit: find elem present
		WebElement addMac = (new WebDriverWait(driver, 10))
	        	.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'alert')]")));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//
		System.out.println("Mac to cart: " + addMac.getText());
		Assert.assertTrue(addMac.getText().contains(product1.getProduct()),"Mac insn't added to cart!");
		
		//Go to Cart tab
		
		//scrolling..2
		WebElement CartButton = driver.findElement(By.xpath("//*[@id='top-links']//i[contains(@class, 'fa fa-shopping-cart')]"));
		Actions action = new Actions(driver);
        action.moveToElement(CartButton).perform();
		
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='top-links']//i[contains(@class, 'fa fa-shopping-cart')]")).click();
		
		
		System.out.println("\t\t@Checking a cart");
		
        String ShoppingCartText = driver.findElement(By.cssSelector("#content >h1")).getText();
        Assert.assertTrue(ShoppingCartText.contains("Shopping Cart"), "You are not in the ShoppingCart page!");
		
      //Checking Cart List
        
		List<WebElement> search = driver.findElements(By.xpath("//table[@class='table table-bordered']//a[text()]"));
		List<String> inCart = new ArrayList<>();
        for (WebElement elem : search) {
        	System.out.println("found:  " + elem.getText()) ;
        	inCart.add(elem.getText());
        }
        List<String> expectedCart = new ArrayList<String>();
        //expectedCart.add(product2.getProduct());
        expectedCart.add(product1.getProduct());
       
        Assert.assertEquals(expectedCart, inCart, "The cart doesn't include all elements");
        
	}
	
	@Test(dataProvider = "getData1")
	public void MailTest(SeachtItems mail) throws Exception {
		
		driver.get("https://www.ukr.net/");
		//MAC
		System.out.println("\t\t@Let's check e-mail!!");
		
		driver.switchTo().frame("mail widget");
		WebElement loginField  = (new WebDriverWait(driver, 10))
	        	.until(ExpectedConditions.visibilityOfElementLocated(By.id("id-input-login")));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		loginField.click();
		loginField.sendKeys(mail.getMail());
		loginField.submit();
		
	}
	
}
