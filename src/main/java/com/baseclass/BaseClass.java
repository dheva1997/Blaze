package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static String getText(WebElement element) {

		String text = element.getText();

		return text;

	}

	public static void clickOnElement(WebElement element) {

		element.click();
	}

	public static WebDriver navigateBack() {

		driver.navigate().back();

		return driver;

	}

	public static void dropDown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("selectbyvalue")) {

			s.selectByValue(value);

		}

		else if (type.equalsIgnoreCase("selectbyindex")) {

			int index = Integer.parseInt(value);

			s.selectByIndex(index);

		} else if (type.equalsIgnoreCase("selectbytext")) {
			s.selectByVisibleText(value);

		}

	}

}
