package com.boral.salesforce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver,30);
		PageFactory.initElements(driver, this);
		//waitFor(ExpectedConditions.visibilityOf(txtUsername));
	}
}
