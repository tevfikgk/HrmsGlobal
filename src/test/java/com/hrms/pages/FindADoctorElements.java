package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class FindADoctorElements {

	@FindBy(linkText="Patient Care")
	public WebElement pationtCare;
	
	@FindBy(linkText="Find a Doctor")
	public WebElement findDoctor;

	@FindBy(xpath="//input[@placeholder='Search by Name or Specialty']")
	public WebElement searchDoctor;
	
	@FindBy(xpath="//input[@class='find_a_doc_submit']")
	public WebElement searchButtton;
	
	@FindBy(xpath="//img[@alt='Farida Ali, M.D.']")
	public WebElement picture;
	
	
	public FindADoctorElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
