package Jul11TestNGSuite;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoB {
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}

	@Test(invocationCount=2) //executes by priority with the ascending order & invocationCount is used for loop or itertes N no.of times  
	public void deleteUser()
	{
		Reporter.log("deleteUser",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}

}
