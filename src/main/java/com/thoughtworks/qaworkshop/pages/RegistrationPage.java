package com.thoughtworks.qaworkshop.pages;

import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.qaworkshop.base.BaseClass;

public class RegistrationPage extends BaseClass {

	
	@FindBy(xpath= "//input[@formcontrolname='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@formcontrolname='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@formcontrolname='mobileNumber']")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@formcontrolname='confirmPassword']")
	private WebElement confirmPassword;
	
	@FindBy (xpath="//input[@formcontrolname='customFile']")
	private WebElement chooseFile;
	
	@FindBy (xpath="//a[text()[normalize-space()='terms of service']]")
	private WebElement termsOfService;
	
	@FindBy(xpath="//button[text()[normalize-space()='Register']]")
	private WebElement registerButton;
	
	public RegistrationPage() {
		
		PageFactory.initElements(driver, this);
	}

	public void enterFirstName(String fName) throws Throwable{
		Thread.sleep(5000);//Need to use explicit wait here.. just adding thread.sleep for debugging
		firstName.sendKeys(fName);	
	}
	
	public void enterLastName(String lName){
		lastName.sendKeys(lName);	}
	
	public void enterEmail(String emailName){
		email.sendKeys(emailName);}
	
	public void enterMobileNumber(String mNumber){
		mobileNumber.sendKeys(mNumber);}
	
	public void enterPassWord(String pWord){
		password.sendKeys(pWord);}
	
	public void enterConfirmPassWord(String cpWord){
		confirmPassword.sendKeys(cpWord);}
	
	public void chooseFile(String file){
		chooseFile.sendKeys(file);}
	
	public void termsOfService(){
		//termsOfService.click();
		
		jsClick(termsOfService);
		//driver.switchTo().window("https://sleepy-brook-65250.herokuapp.com/terms");
		driver.findElement(By.xpath("//button[text()[normalize-space()='I Accept & Close']]")).click();
		
		
		}
	
	
	public void registerButton(){
		registerButton.click();}
	
	public void fillRegistrationForm() throws Throwable {
		
		enterFirstName("Sarath");
		enterLastName("Jayakumar");
		enterEmail("sh@gmail.com");
		enterMobileNumber("8056100695");
		enterPassWord("London@2019");
		enterConfirmPassWord("London@2019");
		chooseFile("/Users/sds-sarath.kj/Documents/eclipse-workspace/ThoughtWorksQAWorkshop/pom.xml");
		termsOfService();
		registerButton();
		
		
	}
	
}
