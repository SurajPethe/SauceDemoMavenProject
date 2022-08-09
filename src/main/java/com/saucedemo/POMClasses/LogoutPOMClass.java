package com.saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOMClass 
{

	WebDriver driver;
	Actions act;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement option;
	
	public void clickonoption()
	{
		option.click();
		
//		act.click(option).perform();
	}
	
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logout;
	
	public void clickonlogout()
	{
		logout.click();
//		act.click(logout).perform();
	}
	
	
	public LogoutPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Actions act = new Actions(driver);
	
	}
	
}
