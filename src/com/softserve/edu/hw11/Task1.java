package com.softserve.edu.hw11;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    private static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        Thread.sleep(1000); // For Presentation Only
        driver.quit();
    }

    @Before
    public void setUp() throws Exception {
        driver.get("http://taqc-opencart.epizy.com/");
        Thread.sleep(1000);
    }
    @Test
    public void AddItemsToCart() throws Exception {
        //Add mac to cart
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.button-group > button:nth-child(1)")).click();
        Thread.sleep(1000);
        WebElement result = driver.findElement(By.className("alert-success"));
        String alertMac = "Success: You have added MacBook to your shopping cart";

        //Check if Success message appears
        Assert.assertTrue(result.getText().contains(alertMac));

        //Add iPhone to cart
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(2) > div > div.button-group > button:nth-child(1)")).click();
        String alertIphone = "Success: You have added iPhone 3 to your shopping cart";
        Thread.sleep(1000);
        WebElement result2 = driver.findElement(By.className("alert-success"));

        //Check success message
        Assert.assertTrue(result2.getText().contains(alertIphone));

        // Go to Cart
        driver.findElement(By.cssSelector("#cart > button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#cart > ul > li:nth-child(2) > div > p > a:nth-child(1) > strong > i")).click();
        Thread.sleep(1000);
        WebElement iPhone = driver.findElement(By.cssSelector("#content > form > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > a"));
        WebElement mac = driver.findElement(By.cssSelector("#content > form > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > a"));
        String iPhoneCart = "iPhone 3";
        String macCart= "MacBook";

        //Check if Iphone and MacBook are in Cart
        Assert.assertTrue(iPhone.getText().contains(iPhoneCart));
        Assert.assertTrue(mac.getText().contains(macCart));

        //Change count of iPhone to 2
        driver.findElement(By.cssSelector("#content > form > div > table > tbody > tr:nth-child(1) > td:nth-child(4) > div > input")).clear();

        //Refresh
        driver.findElement(By.cssSelector("#content > form > div > table > tbody > tr:nth-child(1) > td:nth-child(4) > div > input")).sendKeys("2");
        driver.findElement(By.cssSelector("#content > form > div > table > tbody > tr:nth-child(1) > td:nth-child(4) > div > span > button.btn.btn-primary > i")).click();
        Thread.sleep(1000);
        String cartAlert = "Success: You have modified your shopping cart!";
        WebElement refreshAlert = driver.findElement(By.cssSelector("body > div:nth-child(4) > div.alert.alert-success"));

        //Check if alert appears
        Assert.assertTrue(refreshAlert.getText().contains(cartAlert));
    }
}
