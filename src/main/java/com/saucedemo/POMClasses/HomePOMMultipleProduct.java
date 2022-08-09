package com.saucedemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMMultipleProduct 
{

	WebDriver driver;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	List <WebElement> Multiproduct;
	
	public void MultiProductMethod()
	{
		for(WebElement product : Multiproduct )
		{

			product.click();
		}
		
	}
	
	
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement cartcount;
	
	public String CartCountMethod()
	{
		return cartcount.getText();
	}
	
	
	public HomePOMMultipleProduct(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	
	}
	
}
