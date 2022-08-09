package com.saucedemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.LoginPOMClass;
import com.saucedemo.POMClasses.LogoutPOMClass;
import com.saucedemo.UtilitiesClasses.TakeScreenshot;

public class VerifyLogoutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogoutFunctionality() 
	{
		
		
		log.info("Logout Functionality");
//		Logout Functionality
		LogoutPOMClass logout = new LogoutPOMClass(driver);
		logout.clickonoption();
		log.info("Click on Option button");
		logout.clickonlogout();
		log.info("click on logout Button");
		

		String actualURL = driver.getCurrentUrl();
		String expected = "https://www.saucedemo.com/";
		Assert.assertEquals(actualURL, expected, "Test Case Passed");

		
	}

}
