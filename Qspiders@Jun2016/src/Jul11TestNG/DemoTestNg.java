package Jul11TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNg {
	
	@BeforeClass 
	public void openApp()
	{
		Reporter.log("openApp",true);
	}
	
	@AfterClass
	public void closeApp()
	{
		Reporter.log("closeApp",true);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
	@Test(priority=1,invocationCount=2) //executes by priority with the ascending order & invocationCount is used for loop or itertes N no.of times  
	public void registerUser()
	{
		Reporter.log("registerUser",true);
	}
	
	@Test(priority=2)
	public void deleteUser()
	{
		Reporter.log(" deleteUser",true);
	}
}
