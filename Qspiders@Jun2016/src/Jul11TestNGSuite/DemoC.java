package Jul11TestNGSuite;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoC {
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
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
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}

}
