package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@value='Purchase Flight']")

	private WebElement purchaseFlight;

	public PurchasePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getPurchaseFlight() {
		return purchaseFlight;
	}
	
	

}
