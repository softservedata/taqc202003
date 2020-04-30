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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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

	// @Test // Log to console
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

	// @Test
	public void testChrome1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		element.submit();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("fbar"))).perform();
		Thread.sleep(2000);
		takeScreenShot(driver);
		driver.quit();
	}

	// @Test
	// chrome command line arguments
	// https://peter.sh/experiments/chromium-command-line-switches/
	public void testChrome2() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--no-proxy-server");
		// options.addArguments("--no-sandbox");
		// options.addArguments("--disable-web-security");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--start-fullscreen");
		// options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(options);
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		element.submit();
		//
		Thread.sleep(2000);
		takeScreenShot(driver);
		driver.quit();
	}

	// @Test
	public void testChrome3UserProfile() throws Exception {
		WebDriverManager.chromedriver().setup();
		//
		System.out.println("HOME_PATH getenv = " + System.getenv("HOMEPATH"));
		// System.out.println("HOME_PATH Property = " +
		// System.getProperty("HOMEPATH"));
//	        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
//	                this.getClass().getResource("/chromedriver-windows-32bit.exe").getPath());
		// String userProfile =
		// "C:\\Users\\yharasym\\AppData\\Local\\Google\\Chrome\\User
		// Data\\Default\\";
		String userProfile = System.getenv("HOMEPATH") + "\\AppData\\Local\\Google\\Chrome\\User Data";
		// + "\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\";
		System.out.println("PATH: " + userProfile);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--no-proxy-server");
		// options.addArguments("--no-sandbox");
		// options.addArguments("--disable-web-security");
		options.addArguments("--ignore-certificate-errors");
		// options.addArguments("--disable-extensions");
		// options.addArguments("\""+"user-data-dir=" + userProfile+"\""); // Work in
		// Linux, MacOS, etc. Do not working on Windows.
		options.addArguments("--user-data-dir=" + userProfile); // Working in Windows.
		// options.addArguments("--user-data-dir=" + userProfile); // Work in Linux,
		// MacOS, etc. Do not working on Windows.
		WebDriver driver = new ChromeDriver(options);
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
	public void testChrome4() throws Exception {
		WebDriverManager.chromedriver().setup();
		//
//	        System.setProperty("webdriver.chrome.driver",
//	                this.getClass().getResource("/chromedriver-windows-32bit.exe").getPath());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--no-proxy-server");
		// options.addArguments("--no-sandbox");
		// options.addArguments("--disable-web-security");
		options.addArguments("--ignore-certificate-errors");
		// options.addArguments("--disable-extensions");
		//
		// WebDriver driver = new ChromeDriver(options); // Comment
		//
		// options.setBinary("C:\\Program Files
		// (x86)\\Google\\Chrome\\Application\\chrome.exe");
		// options.setBinary("C:\\Windows\\system32\\calc.exe");
		// options.setBinary("C:\\Windows\\notepad.exe");
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		// DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		// capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		// WebDriver driver = new ChromeDriver(capabilities);
		WebDriver driver = new ChromeDriver(options);
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

	// Chrome Without UI
	// @Test
	public void testChrome5() throws Exception {
		WebDriverManager.chromedriver().setup();
		//
		// Firefox https://developer.mozilla.org/en-US/Firefox/Headless_mode
		// Chrome https://peter.sh/experiments/chromium-command-line-switches/
		// System.setProperty("webdriver.chrome.driver",
//			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
//	                this.getClass().getResource("/chromedriver-windows-32bit.exe").getPath());
//	        System.setProperty("webdriver.chrome.driver",
//	                this.getClass().getResource("/chromedriver-windows-32bit.exe").getPath());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // Chrome Without UI
		WebDriver driver = new ChromeDriver(options);
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println("\tdriver.get http://www.google.com DONE");
		System.out.println("\tCurrent title is: " + driver.getTitle());
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		element.submit();
		Thread.sleep(1000);
		System.out.println("\telement.sendKeys Cheese! DONE");
		System.out.println("\tPage title is: " + driver.getTitle());
		Thread.sleep(2000);
		takeScreenShot(driver);
		driver.quit();
	}

	// @Test
	public void testHtmlUnit() throws Exception {
//			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
//	                this.getClass().getResource("/chromedriver-windows-32bit.exe").getPath());
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--headless"); // Chrome Without UI
//			WebDriver driver = new ChromeDriver(options);
		//
		// WebDriver driver = new FirefoxDriver();
//			WebDriver driver = new HtmlUnitDriver(true);
		WebDriver driver = new HtmlUnitDriver();
//			((HtmlUnitDriver) driver).setJavascriptEnabled(true); // TODO Enable CSS
		((HtmlUnitDriver) driver).setJavascriptEnabled(false); // TODO Enable CSS
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println("\tdriver.get http://www.google.com DONE");
		System.out.println("\tCurrent title is: " + driver.getTitle());
		Thread.sleep(1000);
		//
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		System.out.println("\telement.sendKeys Cheese! DONE");
		System.out.println("\tPage title is: " + driver.getTitle());
		element.submit();
		Thread.sleep(1000);
		// WebDriverWait wait = new WebDriverWait(driver, 5);
		// wait.until(ExpectedConditions.titleContains("Cheese"));
		// (new WebDriverWait(driver, 5)).until(
		// ExpectedConditions.titleContains("Cheese"));
		System.out.println("\tPage title is: " + driver.getTitle());
		//
		driver.findElement(By.partialLinkText("Cheese - Wikipedia")).click();
		System.out.println("\tELEMENT IS " + driver.findElement(By.id("firstHeading")).getText());
		System.out.println("\tPage title is: " + driver.getTitle());
		Assert.assertEquals(driver.findElement(By.id("firstHeading")).getText(), "Cheese");
		// Thread.sleep(2000);
		// takeScreenShot(driver); // Do not use!!!
		// driver.quit();
		driver.quit();
	}

	// Download from http://phantomjs.org/download.html
	// Download from phantomjsdriver-1.4.4.jar
	// https://mvnrepository.com/artifact/com.codeborne/phantomjsdriver/1.4.4
	// Use Selenium 3.0.1, 3.x.x; Do not use Selenium 2.5.x
	// @Test
	public void testPhantomjs() throws Exception {
		WebDriverManager.phantomjs().setup();
		//
//			System.setProperty("phantomjs.binary.path",
//					"./lib/phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		// WebDriver driver = new HtmlUnitDriver(true);
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println("\tdriver.get http://www.google.com DONE");
		System.out.println("\tCurrent title is: " + driver.getTitle());
		Thread.sleep(1000);
		//
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		System.out.println("\telement.sendKeys Cheese! DONE");
		System.out.println("\tPage title is: " + driver.getTitle());
		element.submit();
		Thread.sleep(1000);
		// WebDriverWait wait = new WebDriverWait(driver, 5);
		// wait.until(ExpectedConditions.titleContains("Cheese"));
		// (new WebDriverWait(driver, 5)).until(
		// ExpectedConditions.titleContains("Cheese"));
		System.out.println("\tPage title is: " + driver.getTitle());
		//
		System.out.println("\tTaking First Screenshot ...");
		Thread.sleep(2000);
		takeScreenShot(driver);
		//
		driver.findElement(By.partialLinkText("Cheese - Wikipedia")).click();
		System.out.println("\tELEMENT IS " + driver.findElement(By.id("firstHeading")).getText());
		Assert.assertEquals(driver.findElement(By.id("firstHeading")).getText(), "Cheese");
		//
		System.out.println("\tTaking Second Screenshot ...");
		// File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(scrFile, new File("./screenshot1.png"));
		Thread.sleep(2000);
		takeScreenShot(driver);
		System.out.println("\tDone Screenshot");
		//
		// driver.quit();
		driver.quit();
	}

	@BeforeClass
	public void createService() throws Exception {
		WebDriverManager.chromedriver().setup();
		service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File(System.getenv("USERPROFILE")
						+ "\\.m2\\repository\\webdriver\\chromedriver\\win32\\80.0.3987.106\\chromedriver.exe"))
				// .usingDriverExecutable(new File("./lib/chromedriver.exe"))
				// .usingDriverExecutable(new File("C:\\Program Files
				// (x86)\\Google\\Chrome\\Application\\chromedriver.exe"))
				// .usingDriverExecutable(new
				// File(this.getClass().getResource("/chromedriver-windows-32bit.exe").getPath()))
				// .usingAnyFreePort()
				.usingPort(8888).build();
		service.start();
		System.out.println("\t+++Service Start");
	}

	@Test
	public void testRemout() throws Exception {
		//
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--no-proxy-server");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-web-security");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-extensions");
		// WebDriver driver = new ChromeDriver(options);
		//
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		//
		// WebDriver driver = new RemoteWebDriver(new URL("127.0.0.1:8888"),
		// capabilities);
		WebDriver driver = new RemoteWebDriver(service.getUrl(), capabilities);
		System.out.println("\t+++RemoteWebDriver Start, service.getUrl()=" + service.getUrl());
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		element.submit();
		Thread.sleep(4000);
		takeScreenShot(driver);
		driver.quit();
		System.out.println("\t+++driver.quit()");
	}

	@AfterClass
	public void StopService() {
		if (service != null) {
			service.stop();
			System.out.println("\t+++RemoteWebDriver Stop");
		}
	}

}
