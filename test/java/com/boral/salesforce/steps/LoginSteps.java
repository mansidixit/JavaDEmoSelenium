package com.boral.salesforce.steps;

import org.testng.Assert;

import com.boral.salesforce.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends AbstractSteps {

	@Given("^the salesforce page loads$")
	public void the_salesforce_page_loads() {
		System.out.println("Title of the Application" + driver.getTitle());
	}

	@When("^I provide \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\" as credentials$")
	public void i_provide_test_abc_and_test_as_credentials(String username, String password) {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.invalidLogin(username, password);
	}

	@Then("^I verify the \\\"([^\\\"]*)\\\"$")
	public void i_verify_the_Please_check_your_username_and_password_If_you_still_can_t_log_in_contact_your_Salesforce_administrator(
			String errMessage) {
		LoginPage loginpage = new LoginPage(driver);
		Assert.assertEquals(errMessage, loginpage.getErrorMessage(), "The Error message isnt the one as expected");
		driver.close();
	}

	@When("^I provide valid credentials$")
	public void i_provide_valid_credentials() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.validLogin(System.getProperty("username"), System.getProperty("password"));
		System.out.println(System.getProperty("username"));
	}

	@Then("^I am logged on to the site$")
	public void i_am_logged_on_to_the_site() {
		System.out.println("test in here");
	}
	
	
	@Given("The user is logged in as {string} and {string}")
	public void the_user_is_logged_in_as_and(String string1, String string2) {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.validLogin(string1, string2);
	}
}
