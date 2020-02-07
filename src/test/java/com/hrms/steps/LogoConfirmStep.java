package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.LogoPageElements;
import com.hrms.pages.ResearchPageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;



public class LogoConfirmStep extends CommonMethods {
	@Given("I open browser and navigated to the HRMS")
	public void i_open_browser_and_navigated_to_the_HRMS() {
	    setUp();
	}

	@When("I confirm logo appear")
	public void i_confirm_logo_appear() {
	    boolean isDisplayed= mainLogo.logo.isDisplayed();
        Assert.assertTrue("Logo not appear", isDisplayed);
        
	}

	@When("I close browser")
	public void i_close_browser() {
	  tearDown();
	}


}
