package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.ResearchPageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class ResearchConfirmStep extends CommonMethods{
	
	
	@When("I navigate to research page")
	public void i_navigate_to_research_page() {
	   click(search.researchText);
	}
	
	@When("I navigate to lab page")
	public void i_navigate_to_lab_page() {
	    click(search.researchLab);
	}

	@Then("I see the lab  picture")
	public void i_see_the_lab_picture() {
		boolean pictureDisplayed= search.labPicture.isDisplayed();
	    Assert.assertTrue("Lab Picture is not seen", pictureDisplayed );
	}
}