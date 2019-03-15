package com.boral.salesforce.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage {
	
	@FindBy(id = "username")
	WebElement txtUsername;

	@FindBy(id = "password")
	WebElement txtPassword;

	@FindBy(id = "Login")
	WebElement btnLogin;
	
	@FindBy(id = "error")
	WebElement lblErrorMessage;

	public LoginPage(WebDriver driver) {
		super(driver,30);
		PageFactory.initElements(driver, this);
		waitFor(ExpectedConditions.visibilityOf(txtUsername));
	}

	public LoginPage setUsername(String username) {
		if (txtUsername.isDisplayed()) {
			txtUsername.clear();
			txtUsername.sendKeys(username);
		}
		return this;
	}

	public LoginPage setPassword(String password) {
		if (txtPassword.isDisplayed()) {
			txtPassword.clear();
			txtPassword.sendKeys(password);
		}
		return this;
	}

	public HomePage clickSubmitExpectingFailure() {
		if (btnLogin.isDisplayed()) {
			btnLogin.click();
		}
		return new HomePage(driver);
	}
	
	public LoginPage clickSubmit() {
		if (btnLogin.isDisplayed()) {
			btnLogin.click();
		}
		return this;
	}

	public LoginPage validLogin(String username, String password) {
		return setUsername(username).setPassword(password).clickSubmit();
	}
	
	public HomePage invalidLogin(String username, String password) {
		return setUsername(username).setPassword(password).clickSubmitExpectingFailure();
	}

	public String getErrorMessage() {
		waitFor(ExpectedConditions.visibilityOf(lblErrorMessage));
		return lblErrorMessage.getText();
	}
	
}
