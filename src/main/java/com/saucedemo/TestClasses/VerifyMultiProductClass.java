package com.saucedemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.HomePOMMultipleProduct;

public class VerifyMultiProductClass extends TestBaseClass
{

	@Test
	public void verifyMultiProducts() 
	{
	
		
		log.info("Multi Product Functionality");
//		Home Page All Product Functionality
		HomePOMMultipleProduct hp = new HomePOMMultipleProduct(driver);
		hp.MultiProductMethod();
		
		String actualURL = driver.getCurrentUrl();
		String expected = "https://www.saucedemo.com/";
		Assert.assertEquals(actualURL, expected, "Test Case Passed");

		
		
		
	}
	
}
