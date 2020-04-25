package com.softserve.edu.hw8.hw9;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AcademyTest {
    List<String> expectedResult = new ArrayList<String>() {{
        add("HTML/CSS/JS Fundamentals [Lviv]");
        add("Java Core (Lviv)");
        add("Python Core (Lviv)");
    }};

    @Test
    public void ifSearchedElementsPresent() {
        System.out.println("---Homework 9---Search the element on hte page---");
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://softserve.academy/");
        driver.findElement(By.className("eupopup-closebutton")).click();
        driver.findElement(By.xpath("//b[contains(text(),'Check your knowledge')]")).click();
        driver.findElement(By.id("coursesearchbox")).click();
        driver.findElement(By.id("coursesearchbox")).sendKeys("Lviv");
        driver.findElement(By.cssSelector(".btn.btn-secondary")).click();
        List<WebElement> listResult = driver.findElements(By.className("coursename"));
        List<String> actualResult = new ArrayList<>();
        for (WebElement element : listResult) {
            actualResult.add(element.getText().trim());
        }
        Assert.assertEquals("Some elements are not present on the page Actual result is different", expectedResult, actualResult);
        driver.quit();

    }
}
