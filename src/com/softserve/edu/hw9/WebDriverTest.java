package com.softserve.edu.hw9;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {
	
	@Test
	public void SearchLvivTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://softserve.academy/");   //(get or navigate) 
		Thread.sleep(1000); // For Presentaion ONLY.
		//
		//scrolling..
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/p/b/span")));
		Thread.sleep(1000); // For Presentaion ONLY.
		driver.findElement(By.linkText("Continue")).click(); //accepting cookies
		Thread.sleep(1000); // For Presentaion ONLY.
		
		driver.findElement(By.linkText("Check your knowledge: tests/recommendations")).click();
		Thread.sleep(1000); // For Presentaion ONLY.
		
		//scrolling..
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/h4")));
		Thread.sleep(1000); // For Presentaion ONLY.
		
		driver.findElement(By.id("coursesearchbox")).click();
		driver.findElement(By.id("coursesearchbox")).clear();
		driver.findElement(By.id("coursesearchbox")).sendKeys("Lviv");
		Thread.sleep(1000); // For Presentaion ONLY.
		
		driver.findElement(By.cssSelector("button.btn.btn-secondary")).click();
		Thread.sleep(1000); // For Presentaion ONLY.
		
		WebElement result = driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/h2"));
		System.out.println(result.getText());
		//
		String expected = "Search results:";
		Assert.assertTrue(result.getText().contains(expected));
		Thread.sleep(1000); // For Presentaion ONLY.

		driver.quit(); // Close TAB, stop server
		
	} 
	
	

}
