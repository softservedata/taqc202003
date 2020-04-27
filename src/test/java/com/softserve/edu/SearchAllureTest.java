package com.softserve.edu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.edu.opencart.data.Currencies;
import com.softserve.edu.opencart.data.SearchItem;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;

@Owner(value = "OWNER First name")
@Epic("EPIC AllureTest")
@Feature("FEATURE SearchAllureTes")
public class SearchAllureTest {
	private static WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeClass
	public void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownAfterClass() throws Exception {
		Thread.sleep(1000); // For Presentation Only
		driver.quit();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver.get("http://taqc-opencart.epizy.com/");
		Thread.sleep(1000); // For Presentation Only
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {
		if (!result.isSuccess()) {
			saveImageAttach("PICTURE Test name = " + result.getName());
			saveHtmlAttach("HTML MacBook");
		}
		// logout, get(urlLogout), delete cookie, delete cache
	}


	@Attachment(value = "{0}", type = "image/png")
	public byte[] saveImageAttach(String attachName) {
		byte[] result = null;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			result = Files.readAllBytes(scrFile.toPath());
			FileUtils.copyFile(scrFile, new File(System.getenv().get("USERPROFILE") + "\\Downloads\\screenshot.png"));
		} catch (IOException e) {
			// TODO Create Custom Exception 
			e.printStackTrace();
		}
		return result;
	}

	@Attachment(value = "{0}", type = "text/plain")
	public byte[] saveHtmlAttach(String attachName) {
		return driver.getPageSource().getBytes();
	}

	
	@Attachment(value = "{0}", type = "text/plain")
	public byte[] saveTextAttach(String attachName, String fileName) {
		String path = this.getClass().getResource("/").getPath();
		path = path.replace("target/test-classes/", fileName);
		path = path.substring(1);
		byte[] result = null;
		try {
			result = Files.readAllBytes(Paths.get(path));
		} catch (IOException e) {
			// TODO Create Custom Exception 
			e.printStackTrace();
		}
		return result;
	}

	protected void takeScreenShot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(System.getenv().get("USERPROFILE") + "\\Downloads\\screenshot.png"));
		String htmlText = driver.getPageSource();
		//FileUtils.writeStringToFile(new File(System.getenv().get("USERPROFILE") + "\\Downloads\\screenshot.html"), htmlText);
		Path path = Paths.get(System.getenv().get("USERPROFILE") + "\\Downloads\\screenshot.html");
		Files.write(path, htmlText.getBytes(), StandardOpenOption.CREATE);
	}
	
	
	@Step("STEP Choose Curency")
	private void chooseCurency(Currencies currency) throws Exception {
		driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']")).click();
		Thread.sleep(1000); // For Presentation Only
		driver.findElement(By.xpath("//button[@name='" + currency.getAttributeName() + "']")).click();
		Thread.sleep(1000); // For Presentation Only
	}
	
	@Step("STEP Type Search Field")
	private void typeSearchField(SearchItem searchItem) throws Exception {
		driver.findElement(By.xpath("//input[@name='search']")).click();
		driver.findElement(By.xpath("//input[@name='search']")).clear();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(searchItem.getSearchText());
		Thread.sleep(1000); // For Presentation Only
	}
	
	@Step("STEP Click Search Button")
	private void clickSearchButton() throws Exception {
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Thread.sleep(1000); // For Presentation Only
	}
	
	@Step("STEP Read Price")
	private String readPrice(String searchName) throws Exception {
		WebElement container = driver.findElement(By.xpath("//div[contains(@class,'product-layout')]//a[text()='" + searchName + "']"));
		WebElement price = container.findElement(By.xpath("./../following-sibling::p[@class='price']"));
		Thread.sleep(1000); // For Presentation Only
		return price.getText();
	}
	
	@Step("STEP Goto Home")
	private void gotoHome() throws Exception {
		driver.findElement(By.xpath("//img[contains(@src, '/logo.png')]")).click();
		Thread.sleep(1000); // For Presentation Only
	}
	

	@DataProvider
	public Object[][] searchData() {
		return new Object[][] {
			{ Currencies.EURO, new SearchItem("mac") },
		};
	}
	
	@Description("TEST DESCRIPTION: class SearchAllureTest; findByXPath().")
	@Severity(SeverityLevel.BLOCKER)
	@Story("STORY SearchAllureTest")
	@Issue("SSWMS-12331")
	@Link(name = "LINK goto site", url = "https://softserve.academy")
	@TmsLink(value = "TL-678")
	@Test(dataProvider = "searchData")
	public void findByXPath(Currencies currency, SearchItem searchItem) throws Exception {
		chooseCurency(currency);
		typeSearchField(searchItem);
		clickSearchButton();
		String price = readPrice("MacBook");
		    saveImageAttach("PICTURE MacBook");
		    saveHtmlAttach("HTML MacBook");
		Assert.assertTrue(price.contains("472.33"));
		gotoHome();
		    saveTextAttach("TEXT FROM PROJECT testng.xml", "testng.xml");
	}
	
}
