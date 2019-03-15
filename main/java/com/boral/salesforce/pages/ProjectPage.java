package com.boral.salesforce.pages;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProjectPage extends BasePage {

	@FindBy(xpath = "//*[@id='brandBand_1']/div/div[1]/div[3]/div[1]/div/div[1]/div/header/div[2]/div/div[1]/div[2]/h1/div/span")
	WebElement projectNameHeader;
	
	@FindBy(xpath = "//a/div[@title='New']")
	WebElement newProjectBtn;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	WebElement projectRecordType;

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	WebElement jobRecordType;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextBtn;

	WebElement projectStartDate;

	WebElement projectEndDate;

	@FindBy(xpath = "//label[contains(.,'Name')]/following::input[1]")
	WebElement projectNameTxt;

	@FindBy(xpath = "//label[contains(.,'Start Date')]/following::input[1]")
	WebElement projectStartDateTxt;

	@FindBy(xpath = "//label[contains(.,'End Date')]/following::input[1]")
	WebElement projectEndDateTxt;

	@FindBy(xpath = "(//button/span[.='Save'])[2]")
	WebElement btnSave;

	@FindBy(id = "autocomplete_one")
	WebElement addressTxt;

	@FindBy(xpath = "//label[contains(.,'Street')]/following::input[1]")
	WebElement streetTxt;

	@FindBy(xpath = "//label[contains(.,'Suburb')]/following::input[1]")
	WebElement cityTxt;

	@FindBy(xpath = "//label[contains(.,'State')]/following::input[1]")
	WebElement stateTxt;

	@FindBy(xpath = "//label[contains(.,'Postal')]/following::input[1]")
	WebElement zipCodeTxt;

	@FindBy(xpath = "//label[contains(.,'Country')]/following::input[1]")
	WebElement countryTxt;

	@FindBy(xpath = "//input[@value = 'Save']")
	WebElement saveAddressBtn;

	public ProjectPage(WebDriver driver) {
		super(driver, 30);
		PageFactory.initElements(driver, this);
		waitFor(ExpectedConditions.visibilityOf(newProjectBtn));
	}

	public ProjectPage clickNewProjectBtn() {
		newProjectBtn.click();
		return this;
	}

	public ProjectPage selectProjectRecordType() {
		projectRecordType.click();
		return this;
	}

	public ProjectPage selectJobRecordType() {
		jobRecordType.click();
		return this;
	}

	public ProjectPage clickNextBtn() {
		nextBtn.click();
		return this;
	}

	public ProjectPage setProjectStartDate() {
		// Date date = new Date();
		// date.getDate()
		return this;
	}

	public ProjectPage setProjectFutureDate() {
		// Joda time
		return this;
	}

	public ProjectPage setAddressTxt(String addressStr) {
		addressTxt.sendKeys(addressStr);
		return this;
	}

	public String getAddressTxt() {
		return addressTxt.getText();
	}

	public ProjectPage setStreetTxt(String streetName) {
		streetTxt.sendKeys(streetName);
		return this;
	}

	public String getStreetTxt() {
		return stateTxt.getText();
	}

	public ProjectPage setCityTxt(String cityName) {
		cityTxt.sendKeys(cityName);
		return this;
	}

	public String getCityTxt() {
		return cityTxt.getText();
	}

	public String getStateTxt() {
		return this.stateTxt.getText();
	}

	public ProjectPage setStateTxt(String stateName) {
		this.stateTxt.sendKeys(stateName);
		return this;
	}

	public String getZipCodeTxt() {
		return zipCodeTxt.getText();
	}

	public ProjectPage setZipCodeTxt(String zipCodeStr) {
		this.zipCodeTxt.sendKeys(zipCodeStr);
		return this;
	}

	public WebElement getCountryTxt() {
		return countryTxt;
	}

	public ProjectPage setCountryTxt(String countryName) {
		this.countryTxt.sendKeys(countryName);
		return this;
	}

	public String getProjectNameInHeader() {
		return this.projectNameHeader.getText();
	}
}
