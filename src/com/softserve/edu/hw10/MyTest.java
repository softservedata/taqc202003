package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
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
        driver.quit();
    }

    @Before
    public void setUp() throws Exception {
        driver.get("http://taqc-opencart.epizy.com/");
    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }

    @Test
    public void testCurrency() throws Exception {
        driver.findElement(By.cssSelector("button.btn.btn-link.dropdown-toggle")).click();
        driver.findElement(By.cssSelector("[name='GBP']")).click();

        String actualPageCurrency = driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']/strong")).getText();
        String actualTotalCartCurrency = driver.findElement(By.id("cart-total")).getText();
        List<WebElement> prices = driver.findElements(By.cssSelector("[class*=price]"));
        List<String> actualPriceCurrency = new ArrayList<>();
        for (WebElement each : prices) {
            actualPriceCurrency.add(each.getText());
        }

        Assert.assertEquals("£", actualPageCurrency);
        Assert.assertTrue(actualTotalCartCurrency.contains("£"));
        for(String a : actualPriceCurrency) {
            Assert.assertTrue(a.contains("£") && !a.contains("$") && !a.contains("€"));
        }
        //Result - pass
    }

    @Test
    public void testSearch() throws Exception {
        driver.findElement(By.linkText("Laptops & Notebooks")).click();
        driver.findElement(By.partialLinkText("Macbook")).click();

        List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class='caption']/h4/a"));
        List<String> actual = new ArrayList<>();
        for (WebElement each : searchResults) {
            actual.add(each.getText());
        }

        for(String a : actual) {
            Assert.assertTrue(a.toLowerCase().contains("macbook"));
        }
        //Result - pass
    }
}

