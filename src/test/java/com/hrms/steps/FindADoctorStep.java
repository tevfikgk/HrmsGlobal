package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.FindADoctorElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FindADoctorStep extends CommonMethods {
	
	
	@When("I navigate to find a doctor page")
	public void i_navigate_to_find_a_doctor_page() {
	    click(findDoctor.pationtCare);
	    click(findDoctor.findDoctor);
	}

	@When("I search Farida Ali, M.D. name")
	public void i_search_Farida_Ali_M_D_name() {
	   sendText(findDoctor.searchDoctor, "Farida Ali, M.D."); 
	   click(findDoctor.searchDoctor);
	}
	
	@When("I search {string} name")
	public void i_search_name(String doctorName) {
		sendText(findDoctor.searchDoctor, doctorName); 
		   click(findDoctor.searchDoctor);
	}
	
	
	@Then("I see her picture")
	public void i_see_her_picture() {
	   boolean pictureDisplayed= findDoctor.picture.isDisplayed();
			   Assert.assertTrue("Picture is not displayed", pictureDisplayed);
	}

}
