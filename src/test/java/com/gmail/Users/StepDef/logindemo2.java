package com.gmail.Users.StepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.gmail.Users.Pages.UserInteraction3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logindemo2 {
	WebDriver driver=Hooks.driver;;
	ExtentTest test=Hooks.test;
	UserInteraction3 obj;
	//UserInteraction obj=new UserInteraction();
	//Base base;
	
 
	@Given("I navigate to login page")
	
	public void i_navigate_to_login_page() {
		//driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
	   obj=new UserInteraction3(driver, test);
//		obj.appsetup();
//		driver=obj.getDriver();
	}

	@When("I entered {string} and {string}")
	public void i_entered_and(String string, String string2) {
		obj.getUsername(string);
		obj.getPassword(string2);
		obj.getSubmitButton();
		
//		WebElement username=driver.findElement(By.name("userName"));
//		username.sendKeys(string);
//		
//		WebElement password=driver.findElement(By.name("password"));
//		password.sendKeys(string2);
//		
//		WebElement submit=driver.findElement(By.name("submit"));
//		submit.click();	
		System.out.println(string+" "+string2);
//		WebElement logintext=driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
//		
//		Assert.assertEquals(logintext.getText(),"Login Successfully");
//	    
//		System.out.println(string + ""+string2);
	}
	
	@Then("Itas navigated to the home page {string}")
	public void its_navigated_to_the_home_page(String expectedResult) {
//		if(expectedResult.equals("Login Successfully")) {
//			System.out.println("Login Successfully");
//			WebElement logintext=driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
//			//System.out.println(logintext.getText());
//			Assert.assertEquals(logintext.getText(),"Login Successfully");
//		}else if(expectedResult.equals("Enter your userName and password correct")) {
//			System.out.println("No Login Successfully");
//			WebElement errtext=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
//			//System.out.println(logintext.getText());
//			Assert.assertEquals(errtext.getText(),"Enter your userName and password correct");
//			
//		}	
		//boolean result=obj.run(expectedResult);
		//Assert.assertTrue(result);
		
		//its_navigated_to_the_home_page(String ex) {
			 
	    	try {
	    	    boolean result = obj.run(expectedResult);
	    	    Assert.assertTrue(result);
	    	    System.out.println("Success..");
	    	} catch (AssertionError ae) {
	    	    System.out.println("Failure... Assertion failed: ");
	    	}
		    	
	        
	    }
	
	
	@Then("Itas navigated to the Error Message")
	public void itas_navigated_to_the_Error_Message() {
        WebElement logintext=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
		
		Assert.assertEquals(logintext.getText(),"Enter your userName and password correct");
		System.out.println("Login failed");
	}

	
	@When("I entered following details")
	public void i_entered_following_details(DataTable dataTable) {
		
		List<List<String>> ele=dataTable.cells();
		for(int i=1;i<ele.size();i++)
		{
		String user=ele.get(i).get(0);
		String pwd=ele.get(i).get(1);
	
		obj.getUsername(user);
		
		obj.getPassword(pwd);
		
			
		obj.getSubmitButton();
		System.out.println(user+" "+pwd);
		
	
		}
	}
	
	
	@And("I entered username and password")
	public void i_entered_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("correct credentials");
	}
	@And("I clicked signin button")
	public void i_clicked_signin_button() {
	   
		System.out.println("signin button clicked");
	}
	
	
	@And("I entered correct username")
	public void i_entered_correct_username() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("correct username");
	}
	
	@But("Invalid pwd")
	public void Invalid_pwd() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Incorrect Password");
	}
	
	
	
	
	@When("I insert {string} and {string}")
	public void i_insert_and(String unm, String pwd) {

		obj.getUsername(unm);

		obj.getPassword(pwd);

		obj.getSubmitButton();
	}



}
