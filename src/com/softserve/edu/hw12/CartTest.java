package com.softserve.edu.hw12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CartTest {
    private static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        //driver.quit();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        driver.get("http://taqc-opencart.epizy.com/");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        //driver.quit();
    }

    @DataProvider
    public Object[][] AddToCart() {
        return new Object[][] {
                {"MacBook"},
                {"iPhone 3"}
        };
    }

    @DataProvider
    public Object[][] ChangeQuantity() {
        return new Object[][] {
                {"iPhone 3", "2"}
        };
    }


    @Test(priority = 1, dataProvider = "AddToCart")
    public void testAddToCart(String product) throws Exception {

        //Add product to the Shopping Cart
        driver.findElement(By.xpath("//div[contains(@class,'product-layout')]//h4/a[text()='" + product + "']//ancestor::div[contains(@class,'product-layout')]//button[contains(@onclick,'cart.add')]")).click();

        //Check if the operation is successful
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert')]")).getText().contains("Success: You have added " + product + " to your shopping cart!"));

        //Open Shopping Cart
        driver.findElement(By.xpath("//ul/li/a[@title='Shopping Cart']")).click();

        //Check if added product is present in the Shopping Cart
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']//table/tbody/tr/td[@class='text-left']/a")).isDisplayed());

        System.out.println(product + " is successfully added to Cart");
    }

    @Test(priority = 2, dataProvider = "ChangeQuantity")
    public void testChangeQuantity(String product, String quantity) throws Exception {

        //Open Shopping Cart
        driver.findElement(By.xpath("//ul/li/a[@title='Shopping Cart']")).click();

        //Check initial total cost of product
        String initialTotal = driver.findElement(By.xpath("//div[@id='content']//table/tbody/tr/td[@class='text-left']/a[text()='" + product + "']/ancestor::tr/td[@class='text-right']//following-sibling::td")).getText();

        //Convert cost to double
        String currency = "[$€£,]";
        Pattern p = Pattern.compile(currency);
        Matcher m = p.matcher(initialTotal);
        double init = Double.parseDouble(m.replaceAll(""));

        //Change product quantity
        driver.findElement(By.xpath("//div[@id='content']//table/tbody/tr/td[@class='text-left']/a[text()='" + product + "']/ancestor::tr/td[@class='text-left'][last()]//input")).click();
        driver.findElement(By.xpath("//div[@id='content']//table/tbody/tr/td[@class='text-left']/a[text()='" + product + "']/ancestor::tr/td[@class='text-left'][last()]//input")).clear();
        driver.findElement(By.xpath("//div[@id='content']//table/tbody/tr/td[@class='text-left']/a[text()='" + product + "']/ancestor::tr/td[@class='text-left'][last()]//input")).sendKeys(quantity);

        //Update quantity
        driver.findElement(By.xpath("//div[@id='content']//table/tbody/tr/td[@class='text-left']/a[text()='" + product + "']/ancestor::tr/td[@class='text-left'][last()]//button[@type='submit']")).click();

        //Check if the operation is successful
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert')]")).getText().contains("Success: You have modified your shopping cart!"));

        //Convert total cost to double
        String resultTotal = driver.findElement(By.xpath("//div[@id='content']//table/tbody/tr/td[@class='text-left']/a[text()='" + product + "']/ancestor::tr/td[@class='text-right']//following-sibling::td")).getText();
        m = p.matcher(resultTotal);
        double res = Double.parseDouble(m.replaceAll(""));

        System.out.println("Initial cost: " + initialTotal);
        System.out.println("Result cost: " + resultTotal);

        //Check that total cost of product is x quantity
        Assert.assertEquals((init * Integer.parseInt(quantity)), res, 0.0);
    }
}