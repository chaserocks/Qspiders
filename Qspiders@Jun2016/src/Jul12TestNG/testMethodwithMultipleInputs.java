package Jul12TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// How do u execute a test Method Multiple times with Different Inputs ?
public class testMethodwithMultipleInputs {
	
	@DataProvider
	public String[][] getData()
	{
		String[][] data=new String[2][2];
		data[0][0]="UserA";
		data[0][1]="123";
		data[1][0]="UserB";
		data[1][1]="456";
		return data;
	}
	
	@Test(dataProvider="getData")
	public void createUser(String un,String pw)
	{
		Reporter.log(un+" "+pw,true);
	}
}
