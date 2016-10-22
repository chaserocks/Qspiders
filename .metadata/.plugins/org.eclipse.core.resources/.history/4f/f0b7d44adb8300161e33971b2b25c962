package com.test.scripts;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.library.BaseLib;
import com.test.po.HomePO;

public class HomePageScript extends BaseLib{

	HomePO homePo = null;
	
	@Test(priority=1,enabled=true)
	public void homePage()
	{
		try
		{
		Assert.assertTrue(homePo.getEleWelcomeAdminTxt().isEnabled(),"Welcome admin text button is displayed");	
		homePo.getEleWelcomeAdminTxt().click();
		}
		catch(AssertionError e)
		{
			throw e;
		}
	}
	
	
}
