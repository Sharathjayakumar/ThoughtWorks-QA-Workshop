package com.thoughtworks.qaworkshop.testcases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.qaworkshop.base.BaseClass;
import com.thoughtworks.qaworkshop.pages.HomePage;
import com.thoughtworks.qaworkshop.pages.RegistrationPage;

public class Test extends BaseClass{

	public static void main(String[] args) throws Throwable {
		
		
		HomePage page = new HomePage();
		RegistrationPage rpage = new RegistrationPage();
		
		System.setProperty("webdriver.chrome.driver","/Users/sds-sarath.kj/Documents/eclipse-workspace/ThoughtWorksQAWorkshop/chromedriver");
		WebDriver driver = new ChromeDriver();
		Dimension d = driver.manage().window().getSize();
		
		System.out.println(d);
		
		
		

	}

}
