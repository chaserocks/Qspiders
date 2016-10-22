package Jul11TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemodependsonMethods {
	
	@Test
	public void registerUser()
	{
		Reporter.log("registerUser", true);
	//	Assert.fail();
	}
	
	@Test(dependsOnMethods="registerUser")
	public void deleterUser()
	{
		Reporter.log("registerUser", true);
	}

}
