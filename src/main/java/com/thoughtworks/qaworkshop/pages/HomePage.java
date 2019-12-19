package com.thoughtworks.qaworkshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.qaworkshop.base.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath = "//a[text()[normalize-space()='Register']]")
	private WebElement registerLink;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}

	public void clickRegisterLink() throws Throwable {
		
		//webDriverWait(registerLink);
		Thread.sleep(3000);
		//registerLink.click();	
		//return new RegistrationPage();
		jsClick(registerLink);
	}
	
	
	
	
	

}
