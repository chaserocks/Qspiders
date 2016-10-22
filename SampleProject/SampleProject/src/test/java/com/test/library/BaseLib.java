package com.test.library;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public class BaseLib {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		try{
		if(GenericLib.getCongigValue(GenericLib.sConfigFile, "BROWSER").equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",GenericLib.sDirPath+"\\resources\\chromedriver.exe");
			System.out.println("Chrome is set");
			driver = new ChromeDriver();
		}else
		{
			System.out.println("Firefox is set");
			driver = new FirefoxDriver();
		}		
		}
		catch(Exception e){
			System.out.println("Problem in launching driver");
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
