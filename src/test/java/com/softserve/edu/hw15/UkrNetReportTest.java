package com.softserve.edu.hw15;

import com.softserve.edu.data.ItemsToSelect;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class UkrNetReportTest {
    public static final Logger logger = LoggerFactory.getLogger(UkrNetReportTest.class);
    private static WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        logger.info("---Homework 15---\n---Using Reports to display info---");
//        Reporter.log("<BR><FONT SIZE='4' COLOR='BLUE'>---Homework 15---\n---Using Reports to display info---</FONT><BR>",true);
        WebDriverManager.chromedriver().setup();

    }

    @BeforeClass
    @Parameters(value = "implicitWait")
    public void beforeClass(int time) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    @Parameters(value = "url")
    public void getWebsite(String url) {
        driver.get(url);
    }

    @DataProvider
    public Object[][] selectItem() {
        return new Object[][]{
                {ItemsToSelect.MACBOOK,},

        };
    }

    @Test(dataProvider = "selectItem")
    @Parameters(value = "url1")
    public void checkAddMacBookAndSwitchToUktNet(ItemsToSelect macBookItem) throws InterruptedException, AWTException {
        Reporter.log("<BR><FONT SIZE='4' COLOR='BLUE'>Test stars with search item = " + macBookItem.toString() + " </FONT><BR>", 7, true);
        String format = "Success: You have added %s to your shopping cart!";
        driver.findElement(By.xpath("//h4/a[contains(text()," + macBookItem.getItemName() + ")]/ancestor::div[@class= 'product-thumb transition']//i[@class='fa fa-shopping-cart']")).click();
        String actualResultMacBook = driver.findElement(By.cssSelector(".alert.alert-success")).getText().trim();
        Assert.assertTrue(actualResultMacBook.contains(String.format(format, macBookItem.getItemName())), "MacBook is not added to the shopping cart");
        Reporter.log("<BR><FONT SIZE='4' COLOR='GREEN'>Assert result:  " + actualResultMacBook + " </FONT><BR>", 7, true);

        (new Actions(driver)).pause(1000).moveToElement(driver.findElements(By.xpath("//i[@class='fa fa-shopping-cart']")).get(0)).click().perform();
        String shoppingCartTitle = driver.findElement(By.cssSelector("#content >h1")).getText();
        Assert.assertTrue(shoppingCartTitle.contains("Shopping Cart"), "There is not ShoppingCart page!");

        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1)).get("https://www.ukr.net/");
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='login-frame-wraper']/iframe")));
        driver.findElement(By.cssSelector("#id-input-login")).click();
        driver.findElement(By.cssSelector("#id-input-login")).clear();
        driver.findElement(By.cssSelector("#id-input-login")).sendKeys("MyFirstName");
        String inputText = driver.findElement(By.cssSelector("#id-input-login")).getAttribute("value");
        Assert.assertEquals(inputText, "MyFirstName", "Text is not the same");
    }

    @AfterMethod
    public void clearCash(ITestResult result) throws IOException {
        Reporter.setCurrentTestResult(result);

        if (!result.isSuccess()) {
            Reporter.log("<BR><FONT SIZE='4' COLOR='RED'>Test Failed: " + result.getName() + " </FONT><BR>", 3, true);
            Reporter.log("<br><p>Screenshot</p>");
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File(new ScreenShot().takeScreenShotPath()));
            Files.write(Paths.get(new ScreenShot().takeHtmlPath()), driver.getPageSource().getBytes(), StandardOpenOption.CREATE);
            Reporter.log("<br><div><image style=\"max-width:50%%\" src=\"" + new ScreenShot().takeScreenShotPath() + "\" alt=\"could not take screen shot\" /></div>");
        } else {
            Reporter.log("<BR><FONT SIZE='4' COLOR='GREEN'>Test Passed: " + result.getName() + " </FONT><BR>", 7, true);
        }
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();

    }

    @AfterSuite
    public void afterSuite() {
        logger.info("---Test running finished---");

    }
}
