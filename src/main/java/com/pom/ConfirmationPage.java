package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	
	
	
	public static WebDriver driver;

	@FindBy(xpath = "(//table//tbody//td[2])[1]")

	private WebElement getId;

	public ConfirmationPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getGetId() {
		return getId;
	}
	
	

}
