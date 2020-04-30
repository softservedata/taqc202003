package com.softserve.edu.opencart.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.softserve.edu.opencart.pages.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class EpizyUserTestRunner {
	private final Long ONE_SECOND_DELAY = 1000L;
	protected static WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
	}

	@BeforeClass
	public void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownAfterClass() throws Exception {
		presentationSleep();
		driver.quit();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver.get("http://taqc-opencart.epizy.com/");
		presentationSleep();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		System.out.println("\t@After method");
		// logout, get(urlLogout), delete cookie, delete cache
	}

	public HomePage loadApplication() {
		// return new HomePage(driver);
		return new HomePage(driver);
	}

	public void presentationSleep() {
		presentationSleep(1);
	}

	public void presentationSleep(Integer seconds) {
		try {
			Thread.sleep(seconds * ONE_SECOND_DELAY); // For Presentation ONLY
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
