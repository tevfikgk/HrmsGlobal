package com.hrms.testbase;

import com.hrms.pages.FindADoctorElements;
import com.hrms.pages.LogoPageElements;
import com.hrms.pages.ResearchPageElements;

public class PageInitiliazer extends BaseClass{
	protected static LogoPageElements mainLogo;
	protected static FindADoctorElements findDoctor;
	public static ResearchPageElements search;
	
	public static void initiliazeAllPages() {
		
		 mainLogo=new LogoPageElements();
		findDoctor=new FindADoctorElements();
		search=new ResearchPageElements();
		
	}
}
