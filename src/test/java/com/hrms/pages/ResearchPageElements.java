package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class ResearchPageElements extends CommonMethods{
	
	@FindBy(linkText="Research")
	public WebElement researchText;
	
	@FindBy(linkText="Research Labs")
	public WebElement researchLab;
	
	@FindBy(xpath="//div[@id='landingpage-grid-container'][img]")
	public WebElement labPicture;
	
	
	
	public ResearchPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
