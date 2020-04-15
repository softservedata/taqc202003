package com.softserve.edu.hw10;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest {
	@Test
	public void first() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(" http://taqc-opencart.epizy.com/");

		WebElement currency = driver.findElement(By.cssSelector(".btn.btn-link.dropdown-toggle"));
		currency.click();
		Thread.sleep(2000);
		WebElement usd = driver.findElement(By.name("USD"));
		usd.click();

		Thread.sleep(2000); // For Presentaion ONLY.

		driver.quit();
	}
}
