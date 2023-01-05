package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;

	@FindBy(xpath = "//h1[text()='Welcome to the Simple Travel Agency!']")

	private WebElement title;

	@FindBy(xpath = "//a[@href='vacation.html']")

	private WebElement vacationUrl;

	@FindBy(name = "fromPort")

	private WebElement departureCity;

	@FindBy(name = "toPort")

	private WebElement destinationCity;

	@FindBy(xpath = "//input[@type='submit']")

	private WebElement findFlights;

	public HomePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getVacationUrl() {
		return vacationUrl;
	}
	public WebElement getDepartureCity() {
		return departureCity;
	}

	public WebElement getDestinationCity() {
		return destinationCity;
	}

	public WebElement getFindFlights() {
		return findFlights;
	}

}
