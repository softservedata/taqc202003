package com.softserve.edu.hw10.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OpenCartTest {

    private static WebDriver driver;

    @BeforeAll
    static void setUp() throws Exception{

        System.out.println("@BeforeClass");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        }

    @Test
    public void changeCurrencyTest() throws Exception {

        driver.get("http://taqc-opencart.epizy.com/");

        WebElement currencyButton = driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']"));
        currencyButton.click();

        WebElement gbp = driver.findElement(By.cssSelector("[name='GBP']"));
        gbp.click();

        Thread.sleep(300);
        driver.findElement(By.xpath("//span[text() = '0 item(s) - £0.00']")).isDisplayed();
    }

    @Test
    public void chooseMacbook() throws Exception{

        driver.get("http://taqc-opencart.epizy.com/");

        WebElement laptopCategoryInTopBar = driver.findElement(By.xpath("//a[text() = 'Laptops & Notebooks']"));
        laptopCategoryInTopBar.click();
        System.out.println();

        WebElement macbookCategory = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/div/ul/li[1]/a"));
        macbookCategory.click();

        driver.findElement(By.xpath("//h2[text() = 'Macbook']")).isDisplayed();
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass");
        driver.quit();
    }
}
