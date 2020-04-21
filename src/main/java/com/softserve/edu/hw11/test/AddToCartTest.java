package com.softserve.edu.hw11.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class AddToCartTest {

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
                {"Success: You have added MacBook to your shopping cart!\n" + "×",
                        "Success: You have added iPhone 3 to your shopping cart!\n" + "×",
                        "$246.40"}
        };
    }

    @Test(dataProvider = "testData")
    public void addItemsToCart(String macAlertMessage, String iPhoneAlertMessage, String totalIPhonePrice) throws InterruptedException {

        String macbookCartButton = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]";
        String iPhoneCartButton = "//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]";
        String alertAddedToCart = "//div[@class = 'alert alert-success']";
        String cartButtonOnTheTopBar = "//*[@id='top-links']/ul/li[4]";
        String iPhoneInTheCart = "//a[text() ='iPhone 3']";
        String macBookInTheCart = "//a[text() ='MacBook']";
        String iPhoneQuantity = "//*[@id='content']/form/div/table/tbody/tr[1]/td[4]/div/input";
        String refreshIphoneQuantity = "//*[@id='content']/form/div/table/tbody/tr[1]/td[4]/div/span/button[1]";
        String totaliPhonePrice = "//*[@id='content']/form/div/table/tbody/tr[1]/td[6]";


// Add MacBook to the Cart
        driver.findElement(By.xpath(macbookCartButton)).isDisplayed();
        driver.findElement(By.xpath(macbookCartButton)).click();

//Verify success alert
        driver.findElement(By.xpath(alertAddedToCart)).isDisplayed();
        Assert.assertEquals(driver.findElement(By.xpath(alertAddedToCart)).getText(), macAlertMessage);
        Thread.sleep(1000);

// Add iPhone3 to the Cart
        driver.findElement(By.xpath(iPhoneCartButton)).isDisplayed();
        driver.findElement(By.xpath(iPhoneCartButton)).click();
        Thread.sleep(1000);

//Verify success alert
        driver.findElement(By.xpath(alertAddedToCart)).isDisplayed();
        Assert.assertEquals(driver.findElement(By.xpath(alertAddedToCart)).getText(), iPhoneAlertMessage);

//Go to the Cart
        driver.findElement(By.xpath(cartButtonOnTheTopBar)).click();
        Thread.sleep(2000);

// Verify items in the Cart
        driver.findElement(By.xpath(iPhoneInTheCart)).isDisplayed();
        driver.findElement(By.xpath(macBookInTheCart)).isDisplayed();

// Change iPhone quantity to 2
        driver.findElement(By.xpath(iPhoneQuantity)).click();
        driver.findElement(By.xpath(iPhoneQuantity)).clear();
        driver.findElement(By.xpath(iPhoneQuantity)).sendKeys("2");

        driver.findElement(By.xpath(refreshIphoneQuantity)).click();
        Thread.sleep(2000);

// Check total iPhone price
        String price = driver.findElement(By.xpath(totaliPhonePrice)).getText();
        Assert.assertEquals(price, totalIPhonePrice);






    }

}
