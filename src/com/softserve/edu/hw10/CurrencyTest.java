package com.softserve.edu.hw10;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CurrencyTest {
    @Test
    public void testCurrency() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.manage().window().maximize();
        driver.get("http://taqc-opencart.epizy.com/");

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

        driver.quit();

        //Result - pass
    }
}

