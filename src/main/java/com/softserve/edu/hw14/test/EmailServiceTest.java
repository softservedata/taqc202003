package com.softserve.edu.hw14.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class EmailServiceTest {

    private static WebDriver driver;

    @BeforeClass
    public void setUpBeforeClass() throws Exception{

        System.out.println("@BeforeClass");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDownAfterClass() throws Exception {

        System.out.println("@AfterClass");
        driver.quit();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("\t@Before method");
        driver.get("https://www.ukr.net/");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("\t@After method");
    }

    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                {"test.user@ukr.net",
                "11111111"}
        };
    }

    @Test(dataProvider = "testData")
    public void loginToUkrNet(String username, String password) throws InterruptedException{

        driver.switchTo().frame("mail widget");
        WebElement loginField = driver.findElement(By.id("id-input-login"));
        WebElement passwordField = driver.findElement(By.id("id-input-password"));
        WebElement loginButton = driver.findElement(By.className("form__submit"));

        //Input login data
        Thread.sleep(1000);
        loginField.click();
        loginField.sendKeys(username);

        //Input password data
        passwordField.click();
        passwordField.sendKeys(password);

        //Click Login button
        loginButton.click();
    }
}
