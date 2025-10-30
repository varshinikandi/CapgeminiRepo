package com.gmail.Users.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

public class UserInteraction {
	private WebDriver driver;
	private ExtentTest test;
	public UserInteraction(WebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test =test;
	}
//	public WebDriver getDriver() {
//		return driver;
//	}
	public void appsetup() {
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	public void getUsername(String username) {
		
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys(username);
	}
	public void getPassword(String pwd)
	{
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(pwd);
	}
	public void getSubmitButton() {
		WebElement submit=driver.findElement(By.name("submit"));
		submit.click();	
	}

}
