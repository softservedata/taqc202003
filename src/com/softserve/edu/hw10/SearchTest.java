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

public class SearchTest {

    @Test
    public void testSearch() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.manage().window().maximize();
        driver.get("http://taqc-opencart.epizy.com/");

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

        driver.quit();

        //Result - pass

    }
}
