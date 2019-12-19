package com.thoughtworks.qaworkshop.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thoughtworks.qaworkshop.base.BaseClass;
import com.thoughtworks.qaworkshop.pages.HomePage;
import com.thoughtworks.qaworkshop.pages.RegistrationPage;

public class RegistrationPageTest extends BaseClass {

	public RegistrationPage page;
	public HomePage home;
	
	@BeforeMethod
	public void setUp() throws Throwable {
		initialization();
		home = new HomePage();
		page = new RegistrationPage();
			
		
	}
	
	@Test
	public void registrationFormFillingTest() throws Throwable {
		
		
		home.clickRegisterLink();
		page.fillRegistrationForm();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		//driver.quit();
	}
}
