package com.softserve.edu.hw10.t2;

import org.hamcrest.core.StringContains;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GBRSelectTest {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("---Homework 10---Task1--- ");
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
    public void ifPoundSelected() {
        driver.findElement(By.cssSelector(".btn.btn-link.dropdown-toggle")).click();
        driver.findElement(By.name("GBP")).click();
        String expectedResult = "£";
        String actualResult = driver.findElement(By.cssSelector(".btn.btn-link.dropdown-toggle > strong")).getText();
        Assert.assertEquals("Currency is not poundSterling", expectedResult, actualResult);
        System.out.println("Currency in dropdown is: " + actualResult);
    }

    @Test
    public void ifProductsPriceIsPound() {
        driver.findElement(By.cssSelector(".btn.btn-link.dropdown-toggle")).click();
        driver.findElement(By.name("GBP")).click();
        String expectedResult = "£";
        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='product-thumb transition']//p[@class='price']"));
        List<String> priceList = new ArrayList<>();
        for (WebElement pr : webElementList) {
            priceList.add(pr.getText().trim());
        }
        for (String price : priceList) {
            Assert.assertTrue("Product price is not poundSterling", price.contains(expectedResult));
        }
        System.out.println("Product price contains currency: " + expectedResult);
    }

    @Test
    public void ifPoundIcInCart() {
        driver.findElement(By.cssSelector(".btn.btn-link.dropdown-toggle")).click();
        driver.findElement(By.name("GBP")).click();
        String expectedResult = "£";
        String actualResult = driver.findElement(By.cssSelector("#cart-total")).getText();
        Assert.assertThat("Currency in the cart is not poundSterling ", actualResult, StringContains.containsString(expectedResult));
        System.out.println("Currency in the cart is: " + expectedResult);
    }

    //- Negative Tests

    @Test
    public void ifNotUsdOrEuro() {
        driver.findElement(By.cssSelector(".btn.btn-link.dropdown-toggle")).click();
        driver.findElement(By.name("GBP")).click();
        String[] expectedResult = {"€", "$"};
        String actualResult = driver.findElement(By.cssSelector(".btn.btn-link.dropdown-toggle > strong")).getText();
        Assert.assertNotEquals("Currency is USD or EURO", Arrays.toString(expectedResult), actualResult);
        System.out.println("Not : " + expectedResult[0] + " and not : " + expectedResult[1] + " are selected in Currency dropdown."+"\n"+"Currency selected is: "+actualResult);
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
