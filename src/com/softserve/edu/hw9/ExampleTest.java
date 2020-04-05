package com.softserve.edu.hw9;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest {

//	public static void main(String[] args) {
//		System.out.println("My first program");
//

    @Test
    public void first() throws Exception {
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://softserve.academy/");
        Thread.sleep(2000); // wait until loads
        Thread.sleep(2000); // wait until loads
        driver.findElement(By.className("eupopup-closebutton")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#region-main > div > div > div > b > h3 > a")).click();
        Thread.sleep(2000); // new page loads
        //
        driver.findElement(By.id("coursesearchbox")).sendKeys("Lviv");
        driver.findElement(By.className("btn-secondary")).click(); //go
        Thread.sleep(2000);
        WebElement result = driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/h2"));
        System.out.println("Message: " + result.getText());
        Thread.sleep(2000); // For Presentaion ONLY.
        //
        String expected = "Search results: 3";
        Assert.assertTrue(result.getText().contains(expected));
        Thread.sleep(2000); // For Presentaion ONLY.
        driver.close();
        driver.quit();
    }

}
