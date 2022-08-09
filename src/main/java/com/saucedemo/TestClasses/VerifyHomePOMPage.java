package com.saucedemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.HomePagePOMClass;
import com.saucedemo.POMClasses.LoginPOMClass;

public class VerifyHomePOMPage extends TestBaseClass
{
	@Test
	public void verifyHomePageFunctionality() throws InterruptedException 
	{
	
		
		log.info("Home Page Functionality");
//		Home page product select
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		
		
		hp.addtocartfirstproduct();
		Thread.sleep(1000);
		
		log.info("First Product selected");
		
	String actualURL = driver.getCurrentUrl();
	String expected = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualURL, expected, "Test Case Passed");
	}
	
	
}
