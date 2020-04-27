package com.softserve.edu;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.service.DriverService;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {
	private final String TIME_TEMPLATE = "yyyy-MM-dd_HH-mm-ss";
	// public static ChromeDriverService service;
	public static DriverService service;

	private void takeScreenShot(WebDriver driver) throws IOException {
		String currentTime = new SimpleDateFormat(TIME_TEMPLATE).format(new Date());
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./" + currentTime + "_screenshot.png"));
	}

	// @Test
	public void testFirefox1_3xx() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		element.submit();
		//
		// Actions action = new Actions(driver);
		// action.moveToElement(driver.findElement(By.id("fbar"))).perform();
		Thread.sleep(2000);
		takeScreenShot(driver);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.id("fbar")));
		// driver.quit();
	}

	// Using default profile of firefox
	// @Test
	public void testFirefox2() throws Exception {
		ProfilesIni profileIni = new ProfilesIni();
		// FirefoxProfile profile = profileIni.getProfile("default");
		FirefoxProfile profile = profileIni.getProfile("default-release");
		//
		profile.setAcceptUntrustedCertificates(true);
		// profile.setAssumeUntrustedCertificateIssuer(false);
		// profile.setPreference("app.update.enabled", false);
		//
		WebDriverManager.firefoxdriver().setup();
		//
		FirefoxOptions options = new FirefoxOptions().setProfile(profile);
		// .setBinary("c:/Program Files/Nightly/firefox.exe")
		// .addArguments("-console");
		// .addPreference("browser.cache.disk.enable", false)
		// .addCapabilities(new DesiredCapabilities(ImmutableMap.of("pageLoadStrategy",
		// "eager")));
		WebDriver driver = new FirefoxDriver(options);
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		element.submit();
		Thread.sleep(2000);
		takeScreenShot(driver);
		// driver.quit();
	}

	// @Test
	public void testFirefox21() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		FirefoxProfile profile = new FirefoxProfile(new File(
				// "C:\\Users\\yharasym\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\5cbpt6mc.default"));
				// System.getenv("HOMEPATH") +
				// "\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\xv0c0oyh.default-1539880051618"));
				System.getenv("USERPROFILE")
						+ "\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\ag2q6v21.default-release"));
		//
//			DesiredCapabilities dc = DesiredCapabilities.firefox();
//			dc.setCapability(FirefoxDriver.PROFILE, profile);
//			FirefoxDriver driver = new FirefoxDriver(dc);
		//
		FirefoxOptions options = new FirefoxOptions().setProfile(profile);
		// .setBinary("c:/Program Files/Nightly/firefox.exe")
		// .addArguments("-console")
		// .addPreference("browser.cache.disk.enable", false)
		// .addCapabilities(new DesiredCapabilities(ImmutableMap.of("pageLoadStrategy",
		// "eager")));
		WebDriver driver = new FirefoxDriver(options);
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		element.submit();
		Thread.sleep(2000);
//			(new WebDriverWait(driver, 5)).until(ExpectedConditions
//					.visibilityOfElementLocated(By.linkText("2")));
		takeScreenShot(driver);
		// driver.quit();
	}

	@Test // Log to console
	public void testFirefox5() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions()
				// .setBinary("c:/Program Files/Nightly/firefox.exe")
				.addArguments("-console");
		// if (isContinueIntegration()) {
		options.addArguments("--headless"); // Without UI
		// }
		WebDriver driver = new FirefoxDriver(options);
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		// element.sendKeys("Cheese!");
		element.sendKeys("Selenium Download");
		System.out.println("sendKeys(Cheese!) DONE");
		// TODO
		// console.log("sendKeys(Cheese!)");
		element.submit();
		Thread.sleep(2000);
		System.out.println("Title: " + driver.getTitle());
//			(new WebDriverWait(driver, 5)).until(ExpectedConditions
//					.visibilityOfElementLocated(By.linkText("2")));
		takeScreenShot(driver);
		driver.quit();
	}

}
