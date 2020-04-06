package com.softserve.edu.hw9;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest {

	@Test
	public void first() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://softserve.academy/");
		Thread.sleep(1000);
	
		 driver.findElement(By.linkText("Check your knowledge:/tests recommendations")).click();
		JavascriptExecutor exec = (JavascriptExecutor)driver;
        exec.executeScript("arguments[0].click()");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Lviv");
		Thread.sleep(21000);
		//WebElement alert = driver.findElement(By.cssSelector("div.alert.alert-danger"));
		//System.out.println("Message: " + alert.getText());
		driver.quit();

	}
}
