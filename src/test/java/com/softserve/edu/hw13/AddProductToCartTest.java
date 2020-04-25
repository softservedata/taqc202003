package com.softserve.edu.hw13;

import com.softserve.edu.data.ItemsToSelect;
import com.softserve.edu.data.NewItemCount;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddProductToCartTest {
    private static WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("---Homework 13---\n---Using Maven framework---");
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
                {ItemsToSelect.MACBOOK, ItemsToSelect.IPHONE, new NewItemCount("2")},

        };
    }

    @Test(dataProvider = "selectItem")
    public void ifProductsAddedToCart(ItemsToSelect macBookItem, ItemsToSelect iPhoneItem, NewItemCount expectedCount) {
        String format = "Success: You have added %s to your shopping cart!";
        driver.findElement(By.xpath("//a[contains(text()," + macBookItem.getItemName() + ")]/ancestor::div[@class= 'product-thumb transition']//i[@class='fa fa-shopping-cart']")).click();
        String actualResultMacBook = driver.findElement(By.cssSelector(".alert.alert-success")).getText().trim();
        Assert.assertTrue(actualResultMacBook.contains(String.format(format, macBookItem.getItemName())), "MacBook is not added to the shopping cart");
        System.out.println(actualResultMacBook);
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[contains(text(),'" + iPhoneItem.getItemName() + "')]/ancestor::div[@class= 'product-thumb transition']//i[@class='fa fa-shopping-cart']")).click();
        String actualResultIphone3 = driver.findElement(By.cssSelector(".alert.alert-success")).getText();
        Assert.assertTrue(actualResultIphone3.contains(String.format(format, iPhoneItem.getItemName())), "Iphone3 is not added to the shopping cart");
        System.out.println(actualResultIphone3);
        driver.navigate().refresh();
        List<String> array = new ArrayList<String>() {{
            add(iPhoneItem.getItemName());
            add(macBookItem.getItemName());
        }};
        driver.findElement(By.cssSelector("#top-links .fa.fa-shopping-cart")).click();
        List<WebElement> productsList = driver.findElements(By.cssSelector(".table-responsive tbody .text-left > a"));
        List<String> products = new ArrayList<>();
        for (WebElement element : productsList) {
            products.add(element.getText().trim());
        }
        Assert.assertEquals(products, array, "There is 0 items in the Shopping cart");
        System.out.println("Next products are in the shopping cart: " + products);
        driver.findElements(By.xpath("//div[@class='input-group btn-block']//following-sibling::input")).get(0).click();
        driver.findElements(By.xpath("//div[@class='input-group btn-block']//following-sibling::input")).get(0).clear();
        driver.findElements(By.xpath("//div[@class='input-group btn-block']//following-sibling::input")).get(0).sendKeys(expectedCount.getNewCount());
        driver.findElements(By.xpath("//div[@class='input-group btn-block']//following-sibling::input")).get(0).submit();
        String successMessage = driver.findElement(By.cssSelector(".fa.fa-check-circle")).getText().trim();
        Assert.assertTrue(driver.findElement(By.cssSelector(".fa.fa-check-circle")).isDisplayed(), "Success message is not present ");
        String value = driver.findElement(By.xpath("//div[@class='input-group btn-block']//following-sibling::input")).getAttribute("value");
        Assert.assertEquals(value, expectedCount.getNewCount(), "New quantity is not changed to 2:");
        System.out.println(successMessage + " \nNew Quantity is: " + value);

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