package com.softserve.edu.hw9.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SoftServeAcademyTest {

    @Test
    public void academySiteTest() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://softserve.academy/");

        //Close cookie popup
        driver.findElement(By.className("eupopup-closebutton")).click();
        //Click link "Check your knowledge
        driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/b/h3/a")).click();
        //Search by city
        driver.findElement(By.id("coursesearchbox")).click();
        driver.findElement(By.id("coursesearchbox")).sendKeys("Lviv");
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        //Verify elements presence
        driver.findElement(By.xpath("//div[@data-courseid='32']")).isDisplayed();
        driver.findElement(By.xpath("//div[@data-courseid='30']")).isDisplayed();
        driver.findElement(By.xpath("//div[@data-courseid='83']")).isDisplayed();


        driver.quit();


    }

}
