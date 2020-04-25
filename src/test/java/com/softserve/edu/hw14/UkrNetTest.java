package com.softserve.edu.hw14;

import com.softserve.edu.data.ItemsToSelect;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WindowType;

public class UkrNetTest {
    private static WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("---Homework 14---\n---Switch to IFrame---");
        WebDriverManager.chromedriver().setup();

    }

    @BeforeClass
    @Parameters(value = "implicitWait")
    public void beforeClass(int time) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    @Parameters(value = "url")
    public void getWebsite(String url) {
        driver.get(url);
    }

    @DataProvider
    public Object[][] selectItem() {
        return new Object[][]{
                {ItemsToSelect.MACBOOK,},

        };
    }

    @Test(dataProvider = "selectItem")
    @Parameters(value = "url1")
    public void checkAddMacBookAndSwitchToUktNet(ItemsToSelect macBookItem) throws InterruptedException, AWTException {
        String format = "Success: You have added %s to your shopping cart!";
        driver.findElement(By.xpath("//h4/a[contains(text()," + macBookItem.getItemName() + ")]/ancestor::div[@class= 'product-thumb transition']//i[@class='fa fa-shopping-cart']")).click();
        String actualResultMacBook = driver.findElement(By.cssSelector(".alert.alert-success")).getText().trim();
        Assert.assertTrue(actualResultMacBook.contains(String.format(format, macBookItem.getItemName())), "MacBook is not added to the shopping cart");

        (new Actions(driver)).pause(1000).moveToElement(driver.findElements(By.xpath("//i[@class='fa fa-shopping-cart']")).get(0)).click().perform();
        String shoppingCartTitle = driver.findElement(By.cssSelector("#content >h1")).getText();
        Assert.assertTrue(shoppingCartTitle.contains("Shopping Cart"), "There is not ShoppingCart page!");

        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1)).get("https://www.ukr.net/");
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='login-frame-wraper']/iframe")));
        driver.findElement(By.cssSelector("#id-input-login")).click();
        driver.findElement(By.cssSelector("#id-input-login")).clear();
        driver.findElement(By.cssSelector("#id-input-login")).sendKeys("MyFirstName");
        String inputText = driver.findElement(By.cssSelector("#id-input-login")).getAttribute("value");
        Assert.assertEquals(inputText, "MyFirstName", "Text is not the same");
    }

    @AfterMethod
    public void clearCash() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();

    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("---Test running finished---");
    }
}
