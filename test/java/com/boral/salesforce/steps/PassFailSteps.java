package com.boral.salesforce.steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;

public class PassFailSteps {
	@Given("I want to write a step with precondition and fail it")
	public void givenI() {
		Assert.assertTrue(false);
	}

	@Given("I want to write a step with precondition and pass it")
	public void given() {
		Assert.assertTrue(true);
	}
}
