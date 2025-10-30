package com.gmail.Users.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.gmail.Users.Config.Reports;

public class UserInteraction3 {
	
	private WebDriver driver;
	private WebDriverWait wait;
	ExtentTest test;
	
	public UserInteraction3(WebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(name="userName")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="submit")
	private WebElement submitButton;
	
	
	public boolean getUsername(String unm) {
	    //WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
		
       
        boolean actResult=true;
        try {
        	wait.until(ExpectedConditions.visibilityOf(username));
        	Reports.generateReport(driver, test, Status.PASS, "Username found");
        	 username.sendKeys(unm);
        }
        catch(TimeoutException te)
        {
        	actResult = false;
        }
        return actResult;
        
}

public boolean getPassword(String pwd) {
   
   //password = driver.findElement(By.xpath("//input[@name='password']"));
	boolean actResult = true;
  	 try {
  		 wait.until(ExpectedConditions.visibilityOf(username));
           Reports.generateReport(driver, test, Status.PASS, "Password found");
           
           password.sendKeys(pwd);
  	 }catch (TimeoutException te) {
           actResult = false;
           Reports.generateReport(driver, test, Status.FAIL, "password not interacting...");
       }
  	return actResult;
   
}


public boolean run(String expectedResult) {
	boolean actResult = true;
	 WebElement ele;
  	 if(expectedResult.equals("Login Successfully"))
  	 {
  		 ele=driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
  	 }
  	 else
  	 {
  		 ele=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
  	 }
  	 try {
  		 //WebElement success = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
  		// unsuccess = driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
  		 wait.until(ExpectedConditions.visibilityOf(ele));
  		 if(ele.getText().matches("Login Successfully"))
  		 {
  			Reports.generateReport(driver, test, Status.PASS, "Valid User");
  		 }
  		 else // if(unsuccess.getText().matches("Enter your userName and password correct"))
  		 {
  			actResult = false;
           Reports.generateReport(driver, test, Status.FAIL, "Invalid User");
  		 }
           
  	 }catch (Exception te) {
           actResult = false;
           Reports.generateReport(driver, test, Status.FAIL, "password not interacting...");
       }
  	 
  	
  	 return actResult;
 }



public void getSubmitButton() {
	
	//WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
    submitButton.click();
}


}
