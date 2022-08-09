package com.saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass 
{

	private WebDriver driver;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addtocart;
	
	public void addtocartfirstproduct()
	{
		addtocart.click();
	}

	public HomePagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
}
