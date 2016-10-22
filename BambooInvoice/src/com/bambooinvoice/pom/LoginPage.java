package com.bambooinvoice.pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;

	public class LoginPage {
		
		// Declaration of the web elements
		@FindBy(id="user_login")
		private WebElement unTB;
		
		@FindBy(id="user_pass")
		private WebElement unPW;
		
		@FindBy(id="wp-submit")
		private WebElement loGn;
		
		@FindBy(linkText="Log Out")
		private WebElement logoutLink;
		
		@FindBy(id="login_error")
		private WebElement loGnErr;
		

		// write a constructor to intilialise the webElements.
		public LoginPage(WebDriver driver) 
		{
			PageFactory.initElements(driver,this);
		}
		
		// utilisation
		public void setUserName(String un)
		{
			unTB.sendKeys(un);
		}
		
		public void clear()
		{
			unTB.clear();
		}
		
		
		public void setPassword(String pw)
		{
			unPW.sendKeys(pw);
		}
		
		public void clickLoginButton()
		{
			loGn.click();
		}

		public void verifyErrMsg()
		{
			Assert.assertTrue(loGnErr.isDisplayed());
		}
		
		public void clickLogoutLink()
		{
			logoutLink.click();
		}
		
	}


