package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class LogoPageElements extends CommonMethods{
	
	@FindBy(xpath="//img[@itemprop='logo']")
	public WebElement logo;
	
	
	public LogoPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
