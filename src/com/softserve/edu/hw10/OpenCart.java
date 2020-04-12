package com.softserve.edu.hw10;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenCart {

    private static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        Thread.sleep(1000); // For Presentation Only
        driver.quit();
    }

    @Before
    public void setUp() throws Exception {
        driver.get("http://taqc-opencart.epizy.com/");
        Thread.sleep(1000);
    }

       @Test
       //Task1. Зайти на сайт http://taqc-opencart.epizy.com/
       //   Клікнути на вибір валюти  Currency
       //   Вибрати PoundSterling
       //   Перевірити, чи на сторінці змінилася грошова одиниця
    public void selectCurrency() throws Exception {
           driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']")).click();
           Thread.sleep(1000);
           driver.findElement(By.xpath("//button[@name='GBP']")).click();
           Thread.sleep(1000);
           WebElement result = driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']/strong"));
           String expected = "£";
           Assert.assertTrue(result.getText().contains(expected));
       }

    @Test
    //Task2. Зайти на сайт http://taqc-opencart.epizy.com/
    //   Клікнути на Laptops & Notebooks
    //   Клікнути на Macbook (3)
    //   Перевірити, чи на сторінці з'явилися товари Macbook
    public void findMacBook() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//following-sibling::div//a[contains(text(),'Macbook (3)')]")).click();
        Thread.sleep(1000);
        List<WebElement> macList = driver.findElements(By.xpath("//div[@class='caption']/h4/a"));
        List<String> result = new ArrayList<>();
        for (WebElement each : macList) {
            result.add(each.getText());
        }
        for(String text : result){
            Assert.assertTrue(text.toLowerCase().contains("macbook"));
        }
    }
}