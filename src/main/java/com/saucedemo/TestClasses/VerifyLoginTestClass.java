package com.saucedemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.LoginPOMClass;

public class VerifyLoginTestClass extends TestBaseClass
{
	@Test
	public void verifyLoginFunctionality() 
	{
		    
		log.info("Login Functionality");
		//validation
        String expectedTitle = "Swag Labs";	   //given	
		
		String actualTitle = driver.getTitle();  //actual
		

		String actualURL = driver.getCurrentUrl();
		String expected = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualURL, expected, "Test Case Passed");

		
		
	}

	private void takesScreenshots(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	
}
