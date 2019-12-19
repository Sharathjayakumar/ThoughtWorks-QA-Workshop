package com.thoughtworks.qaworkshop.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	
	public static Properties prop;
	public static WebDriver driver;
	
	public static WebDriverWait wait;
	
	public BaseClass() {
	try {
		prop = new Properties();
		FileInputStream propFile = new FileInputStream("/Users/sds-sarath.kj/Documents/eclipse-workspace/ThoughtWorksQAWorkshop/"+
		"src/main/java/com/thoughtworks/qaworkshop/config/config.properties");
		prop.load(propFile);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	public static void initialization() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","/Users/sds-sarath.kj/Documents/eclipse-workspace/ThoughtWorksQAWorkshop/chromedriver");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		//driver.manage().window().setSize(new Dimension(1000,3000));
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Thread.sleep(3000);
	}
	
	public void webDriverWait(WebElement element) {
		
		wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		//wait.until(ExpectedConditions.in);
	}
	
	public void jsClick(WebElement element) {	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	
	
	
	
	
	

}
