package com.softserve.edu.hw11;

import org.hamcrest.core.StringContains;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddProductToCartTest {
    private static WebDriver driver;


    @BeforeClass
    public static void beforeClass() {
        System.out.println("---Homework 11---");
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Before
    public void getWebsite() {
        driver.get("http://taqc-opencart.epizy.com/");
    }

    @Test
    public void ifProductsAddedToCart() {
        String format = "Success: You have added %s to your shopping cart!";
        String macBook = "MacBook";
        driver.findElement(By.xpath("//a[contains(text(),'MacBook')]/ancestor::div[@class= 'product-thumb transition']//i[@class='fa fa-shopping-cart']")).click();
        String actualResultMacBook = driver.findElement(By.cssSelector(".alert.alert-success")).getText().trim();
        Assert.assertThat("MacBook is not added to the shopping cart", actualResultMacBook, StringContains.containsString(String.format(format, macBook)));
        System.out.println(actualResultMacBook);
        driver.navigate().refresh();
        String iphone3 = "iPhone 3";
        driver.findElement(By.xpath("//a[contains(text(),'iPhone 3')]/ancestor::div[@class= 'product-thumb transition']//i[@class='fa fa-shopping-cart']")).click();
        String actualResultIphone3 = driver.findElement(By.cssSelector(".alert.alert-success")).getText();
        Assert.assertTrue("Iphone3 is not added to the shopping cart", actualResultIphone3.contains(String.format(format, iphone3)));
        System.out.println(actualResultIphone3);
        driver.navigate().refresh();
        List<String> array = new ArrayList<String>() {{
            add(iphone3);
            add(macBook);
        }};
        driver.findElement(By.cssSelector("#top-links .fa.fa-shopping-cart")).click();
        List<WebElement> productsList = driver.findElements(By.cssSelector(".table-responsive tbody .text-left > a"));
        List<String> products = new ArrayList<>();
        for (WebElement element : productsList) {
            products.add(element.getText().trim());
        }
        Assert.assertEquals("There is 0 items in shopping cart", array, products);
        System.out.println("Next products are in the shopping cart: " + products);
        driver.findElements(By.xpath("//div[@class='input-group btn-block']//following-sibling::input")).get(0).click();
        driver.findElements(By.xpath("//div[@class='input-group btn-block']//following-sibling::input")).get(0).clear();
        driver.findElements(By.xpath("//div[@class='input-group btn-block']//following-sibling::input")).get(0).sendKeys("2");
        driver.findElements(By.xpath("//div[@class='input-group btn-block']//following-sibling::input")).get(0).submit();
        String successMessage = driver.findElement(By.cssSelector(".fa.fa-check-circle")).getText().trim();
        Assert.assertTrue("Success message is not present ", driver.findElement(By.cssSelector(".fa.fa-check-circle")).isDisplayed());
        String value = driver.findElement(By.xpath("//div[@class='input-group btn-block']//following-sibling::input")).getAttribute("value");
        Assert.assertEquals("New quantity is not changed to 2: ", "2", value);
        System.out.println(successMessage + " \nNew Quantity is: " + value);


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
