package Jul11TestNGSuite;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoA {
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@Test(invocationCount=2) //executes by priority with the ascending order & invocationCount is used for loop or itertes N no.of times  
	public void registerUser()
	{
		Reporter.log("registerUser",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
}
