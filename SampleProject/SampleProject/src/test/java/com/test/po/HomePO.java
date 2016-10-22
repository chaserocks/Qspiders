package com.test.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePO 
{

	WebDriver driver = null;
	public HomePO(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[contains(text(),'Welcome! Admin')]")
	private WebElement eleWelcomeAdminTxt;
	public WebElement getEleWelcomeAdminTxt(){
		return eleWelcomeAdminTxt;
	}
	
	
}