package com.gmail.Users.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class UserInteraction2 {
	private WebDriver driver;
	private ExtentTest test;
	public UserInteraction2(WebDriver driver,ExtentTest test)
	{
		
		this.test =test;
		PageFactory.initElements(driver, this);
	}
//	public WebDriver getDriver() {
//		return driver;
//	}
	@FindBy(xpath="//a[normalize-space()='REGISTER']") private WebElement Register;
	@FindBy(xpath="//input[@name='firstName']") private WebElement Firstname;
	@FindBy(xpath="//input[@name='lastName']") private WebElement Lastname;
	@FindBy(xpath="//input[@name='phone']") private WebElement Phone;
	@FindBy(xpath="//input[@id='userName']") private WebElement Email;
	@FindBy(xpath="//input[@id='email']") private WebElement email;
	@FindBy(xpath="//input[@name='password']") private WebElement pwd;
	@FindBy(xpath="//input[@name='confirmPassword']") private WebElement confirmpwd;
	@FindBy(xpath="//input[@name='submit']") private WebElement submit;
	
	public void getRegisterPage()
	{
		Register.click();
		
	}
	public void getFirstName(String fn)
	{
		Firstname.sendKeys(fn);
		
	}
	public void getLastName(String ln)
	{
		Lastname.sendKeys(ln);
		
	}

	public void getPhone(String phone)
	{
		Phone.sendKeys(phone);
		
	}

	public void getUsername(String email)
	{
		Email.sendKeys(email);
		
	}

	public void getEmail(String mail)
	{
		email.sendKeys(mail);
		
	}

	public void getPassword(String password)
	{
		pwd.sendKeys(password);
		
	}

	public void getConfirmPassword(String conpwd)
	{
		confirmpwd.sendKeys(conpwd);
		
	}

	public void clickSubmit()
	
	{
		submit.click();
		
	}

	
	
}
