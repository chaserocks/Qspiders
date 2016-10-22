package Jul12TestNG;

import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// How do u make the TestNG not to execute a Specified Method?
public class NottoExecutespecificMethod {
	
	@BeforeClass
	public void launch()
	{
		Reporter.log("launch",true);
	}
	
	@Test(enabled=false)  // Always the @Test default value is True. but here wantdly making it to false, bcz not to run the test method.
	public void deleteUser()
	{
		Reporter.log("deleteUser",true);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@AfterClass
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
}
