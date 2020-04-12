package com.softserve.edu.hw10.t1;

import org.hamcrest.core.StringContains;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MacBookSelectTest {
    private static WebDriver driver;


    @BeforeClass
    public static void beforeClass() {
        System.out.println("---Homework 10---Task2--- ");
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Before
    public void getWebsite() {
        driver.get("http://taqc-opencart.epizy.com/");
    }

    //-Positive tests

    @Test
    public void ifHeaderIsMacBook() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Laptops & Notebooks')]")))
                .click(driver.findElement(By.xpath("//following-sibling::div//a[contains(text(),'Macbook')]"))).perform();
        String expectedResult = "Macbook";
        String actualResult = driver.findElement(By.cssSelector(".col-sm-9 >h2")).getText();
        Assert.assertEquals("The page title is not match MacBook",expectedResult.toLowerCase(),actualResult.toLowerCase());
        System.out.println("Page title after search is: " + actualResult);

    }


    @Test
    public void ifOnlyMacBookProducts() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Laptops & Notebooks')]")))
                .click(driver.findElement(By.xpath("//following-sibling::div//a[contains(text(),'Macbook')]"))).perform();
        String expectedResult = "Macbook";
        List<WebElement> macBookElements = driver.findElements(By.cssSelector(".product-thumb h4>a"));
        List<String> actualResult = new ArrayList<>();
        for(WebElement text : macBookElements){
            actualResult.add(text.getText().toLowerCase().trim());
        }
        actualResult.forEach(result -> Assert.assertTrue("No matches with MacBook: ",result.contains(expectedResult.toLowerCase())));
        System.out.println("Only MacBook's products on the page"+ actualResult);

    }


    @After
    public void clearCash() {
        driver.manage().deleteAllCookies();

    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();

    }
}
