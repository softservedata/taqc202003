package com.softserve.edu;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstNg0 {
	//private boolean isTestSuccessful = false;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("class FirstNg @BeforeSuite beforeSuite() ");
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		System.out.println("class FirstNg @AfterSuite afterSuite() ");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("\tclass FirstNg @BeforeTest beforeTest() ");
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		System.out.println("\tclass FirstNg @AfterTest afterTest() ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("\t\tclass FirstNg @@BeforeClass beforeClass() ");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("\t\tclass FirstNg @AfterClass afterClass() ");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\t\t\tclass FirstNg @BeforeMethod beforeMethod() ");
		//isTestSuccessful = false;
		//throw new RuntimeException("@BeforeMethod hahaha");
	}

	/*-
	@AfterMethod
	public void afterMethod() {
		System.out.println("\t\t\tclass FirstNg @AfterMethod afterMethod() ");
		if (!isTestSuccessful) {
			System.out.println("***test failed");
		}
	}
	*/
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		System.out.println("\t\t\t@AfterMethod class FirstNg0 afterMethod()");
		//if (!isTestSuccessful) {
		if (!result.isSuccess()) {
			//System.out.println("Test " + testName + " ERROR");
			System.out.println("Test " + result.getName() + " ERROR");
			// Take Screenshot, save sourceCode, save to log, prepare report, Return to previous state, logout, etc.
		}
		//throw new RuntimeException("@AfterMethod hahaha");
	}
	
	@Test
	public void checkFirst() {
		System.out.println("\t\t\t\tclass FirstNg @Test checkFirst() ");
		int i = 2;
		if (i > 1) {
			//throw new RuntimeException("hahaha");
		}
		//isTestSuccessful = true;
	}

	@Test
	public void checkFirst2() {
		System.out.println("\t\t\t\tclass FirstNg @Test checkFirst2() ");
		//isTestSuccessful = true;
	}
}
