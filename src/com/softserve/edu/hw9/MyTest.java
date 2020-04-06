package com.softserve.edu.hw9;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyTest {
    @Test
    public void testSearch() {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://softserve.academy/");

            JavascriptExecutor exec = (JavascriptExecutor)driver;
            exec.executeScript("arguments[0].click()", driver.findElement(By.linkText("Check your knowledge: tests/recommendations")));

            driver.findElement(By.name("q")).click();
            driver.findElement(By.name("q")).clear();
            driver.findElement(By.name("q")).sendKeys("Lviv");

            driver.findElement(By.cssSelector(".btn-secondary")).click();

            List<WebElement> searchResults = driver.findElements(By.xpath("//*[contains(@class,'coursebox')]"));

            List<String> expected = new ArrayList<>(
                    Arrays.asList("30", "32", "83"));
            List<String> actual = new ArrayList<>();
            for (WebElement each : searchResults) {
                    actual.add(each.getAttribute("data-courseid"));
                }
            Collections.sort(actual);
            Assert.assertEquals(expected, actual);

            driver.quit();

            //Result - pass
    }
}
