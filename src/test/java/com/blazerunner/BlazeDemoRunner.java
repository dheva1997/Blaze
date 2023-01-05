package com.blazerunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pom.BookingPage;
import com.pom.ConfirmationPage;
import com.pom.HomePage;
import com.pom.PurchasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeDemoRunner extends BaseClass {

	public static WebDriver driver;

	public static Integer min;

	@BeforeTest
	private void setProperty() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://blazedemo.com/index.php");

		driver.manage().window().maximize();

	}

	@Test
	private void TestValidation() {

		// Task1
		HomePage hp = new HomePage(driver);

		String actual = getText(hp.getTitle());

		System.out.println(actual);

		String expected = "Welcome to the Simple Travel Agency!";

		Assert.assertEquals(actual, expected, "The title which displayed is verified successful");
		// Task2
		clickOnElement(hp.getVacationUrl());

		// Navigate back to home page

		driver.navigate().back();

		// Task3-a
		dropDown(hp.getDepartureCity(), "selectbyvalue", "Mexico City");

		dropDown(hp.getDestinationCity(), "selectbyvisibletext", "London");
		// Task3-b
		clickOnElement(hp.getFindFlights());

		BookingPage bp = new BookingPage(driver);

		clickOnElement(bp.getChooseFlight());
		// Task3-c
		PurchasePage pp = new PurchasePage(driver);

		clickOnElement(pp.getPurchaseFlight());
		// Task3-d
		ConfirmationPage cp = new ConfirmationPage(driver);

		String text = getText(cp.getGetId());

		System.out.println(text);

	}

	@AfterTest
	private void quit() {

		driver.quit();

	}

}
