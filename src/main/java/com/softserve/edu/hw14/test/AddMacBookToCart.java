package com.softserve.edu.hw14.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class AddMacBookToCart {

    private static WebDriver driver;

    @BeforeClass
    public void setUpBeforeClass() throws Exception{

        System.out.println("@BeforeClass");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDownAfterClass() throws Exception {

        System.out.println("@AfterClass");
        driver.quit();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("\t@Before method");
        driver.get("http://taqc-opencart.epizy.com/");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("\t@After method");
    }

    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                {"Success: You have added MacBook to your shopping cart!\n" + "×"}
        };
    }

    @Test(dataProvider = "testData")
    public void addMacBookToCart(String alertSuccess) throws InterruptedException{

        String macbookCartButton = "//h4/a[text()='MacBook']/../../following-sibling::div/button[contains(@onclick,'cart.add')]";
        String alertAddedToCart = "//div[@class = 'alert alert-success']";
        String cartButtonOnTheTopBar = "//div[@id='top-links']/ul/li[4]";
        String macBookInTheCart = "//a[text() ='MacBook']";

        // Add MacBook to the Cart
        driver.findElement(By.xpath(macbookCartButton)).isDisplayed();
        driver.findElement(By.xpath(macbookCartButton)).click();

        //Check alert
        driver.findElement(By.xpath(alertAddedToCart)).isDisplayed();
        Assert.assertEquals(driver.findElement(By.xpath(alertAddedToCart)).getText(), alertSuccess);
        Thread.sleep(2000);

        //Go to Cart
        driver.findElement(By.xpath(cartButtonOnTheTopBar)).click();
        Thread.sleep(2000);

        //MacBook presented
        driver.findElement(By.xpath(macBookInTheCart)).isDisplayed();
    }
}
