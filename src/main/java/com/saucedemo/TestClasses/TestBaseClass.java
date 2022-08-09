package com.saucedemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.saucedemo.POMClasses.LoginPOMClass;

public class TestBaseClass 
{

	
	Logger log = Logger.getLogger("SauceDemoMavenProject");
	WebDriver driver;
	
	@Parameters("browsername")
	@BeforeMethod
	public void setUpMethod(String browsername)
	{
	
		if(browsername.equals("chrome"))
		{		
			System.setProperty("webdriver.chrome.driver", 
	
			"./Driverfolder/chromedriver.exe");
			driver = new ChromeDriver();
			log.info("Browser is opened");

			driver.manage().window().maximize();
			log.info("Chrome Browser is maximized");
			
			
		}
		
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Driverfolder/geckodriver.exe");
			 driver = new FirefoxDriver();
			 log.info("Browser is opened");

			driver.manage().window().maximize();
			log.info("Firefox Browser is maximized");
		}
			
		else
		{
			log.info("Browser not selected");
		}
			
		PropertyConfigurator.configure("log4j.properties");
		
	driver.get("https://www.saucedemo.com/");
	log.info("URL is opened");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
	//login
	LoginPOMClass lp = new LoginPOMClass(driver);
    lp.sendUsername();
    lp.sendPassword();
    lp.clickOnLoginButton();

	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("Driver is closed");
	}
	
}
