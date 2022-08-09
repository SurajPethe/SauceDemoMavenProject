package com.saucedemo.UtilitiesClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class TakeScreenshot
{
	private WebDriver driver;
	private TakesScreenshot ts;
	
	public void takesScreenshots(WebDriver driver) throws IOException
	{
		ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Admin\\Desktop\\Veloity Work\\JAVA Syllabus\\Automation Program\\Screenshot\\B.jpg");	
		FileHandler.copy(source, dest);
	}
	
	
	
}
