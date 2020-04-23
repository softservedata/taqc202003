package com.softserve.edu.hw11;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.*;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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

    @Before
    public void setUp() throws Exception {
        driver.get("http://taqc-opencart.epizy.com/");
    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }

    private WebElement getElementByName(String name) {
        WebElement result = null;
        List<WebElement> containers = driver.findElements(By.cssSelector("div[class*=product-layout]"));
        for (WebElement current : containers) {
            if (current.findElement(By.cssSelector("h4 > a")).getText().equals(name)) {
                result = current;
                break;
            }
        }
        if (result == null) {
            //Custom Exception
            throw new RuntimeException("WebElement by title/name: " + name + " not found");
        }
        return result;
    }


    @Test
    public void test1_AddMacBookToCart() throws Exception {
        //Add MackBook to the Shopping Cart
        getElementByName("MacBook").findElement(By.cssSelector("button[onclick*='cart.add']")).click();
        //Check if the operation is successful
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert")).getText().contains("Success: You have added MacBook to your shopping cart!"));
    }

    @Test
    public void test2_AddiPhone3ToCart() throws Exception {
        //Add iPhone 3 to the Shopping Cart
        getElementByName("iPhone 3").findElement(By.cssSelector("button[onclick*='cart.add']")).click();
        //Check if the operation is successful
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert")).getText().contains("Success: You have added iPhone 3 to your shopping cart!"));
    }

    @Test
    public void test3_CheckShoppingCart() throws Exception {
        //Open Shopping Cart
        driver.findElement(By.xpath("//ul/li/a[@title='Shopping Cart']")).click();
        //Select products from the Shopping Cart
        List<WebElement> products = driver.findElements(By.cssSelector(".table-responsive > table.table-bordered > tbody > tr > td.text-left > a"));
        ArrayList<String> actualProductNames = new ArrayList<>();
        for (WebElement p : products) {
            actualProductNames.add(p.getText());
        }
        ArrayList<String> expectedProductNames = new ArrayList<> (
                Arrays.asList("iPhone 3", "MacBook")
        );
        //Check if added products are present in the Shopping Cart
        Assert.assertEquals(actualProductNames, expectedProductNames);
    }
    @Test
    public void test4_AddOneMoreiPhone3() throws Exception {
        //Return to the Shopping Cart
        driver.findElement(By.xpath("//ul/li/a[@title='Shopping Cart']")).click();
        //Check initial total cost of iPhone 3
        String initialTotal = driver.findElement(By.cssSelector(".table-responsive > table.table-bordered > tbody > tr:first-child > td.text-right:last-child")).getText();
        //Convert cost to double
        String currency = "[$€£]";
        Pattern p = Pattern.compile(currency);
        Matcher m = p.matcher(initialTotal);
        double init = Double.parseDouble(m.replaceAll(""));
        //Change iPhone 3 quantity
        driver.findElement(By.cssSelector(".table-responsive > table.table-bordered > tbody > tr:first-child > td.text-left:nth-child(4) > .input-group.btn-block > .form-control")).click();
        driver.findElement(By.cssSelector(".table-responsive > table.table-bordered > tbody > tr:first-child > td.text-left:nth-child(4) > .input-group.btn-block > .form-control")).clear();
        driver.findElement(By.cssSelector(".table-responsive > table.table-bordered > tbody > tr:first-child > td.text-left:nth-child(4) > .input-group.btn-block > .form-control")).sendKeys("2");
        //Update quantity
        driver.findElement(By.cssSelector(".table-responsive > table.table-bordered > tbody > tr:first-child > td.text-left:nth-child(4) > .input-group.btn-block > .input-group-btn > button[type=submit]")).click();
        //Check if the operation is successful
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert")).getText().contains("Success: You have modified your shopping cart!"));
        //Check the result total cost of iPhone 3
        String resultTotal = driver.findElement(By.cssSelector(".table-responsive > table.table-bordered > tbody > tr:first-child > td.text-right:last-child")).getText();
        //Convert cost to double
        m = p.matcher(resultTotal);
        double res = Double.parseDouble(m.replaceAll(""));
        //Check that total cost of iPhone 3 is doubled
        Assert.assertEquals((init * 2), res, 0.0);
    }
}
