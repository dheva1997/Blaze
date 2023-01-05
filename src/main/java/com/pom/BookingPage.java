package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//td[text()='$200.98']//preceding::input[1]")

	private WebElement chooseFlight;

	 public BookingPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getChooseFlight() {
		return chooseFlight;
	}
	
	
}
