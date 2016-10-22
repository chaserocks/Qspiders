/***********************************************************************
 * @author 			:		LAKSHMI BS
 * @description		: 		Implemented ITestListener interface and overrided methods as per requirement. It listenes to all the events performed by Testng and keep track of it.
 * @method			:		onTestStart()
 * @method			:		onTestSuccess()
 * @method			:		onTestFailure()
 * @method 			:		onTestSkipped()
 * @method			:		onTestFailedButWithinSuccessPercentage()		
 * @method 			:		onStart()
 * @method 			:		onFinish()
 * @method 
 */
package com.test.library;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener {
	
	public TestngListener() throws IOException 
	{
	}

	public void onTestStart(ITestResult result) 
	{
	}

	public void onTestSuccess(ITestResult result) 
	{
	}

	public void onTestFailure(ITestResult result) 
	{
	}

	public void onTestSkipped(ITestResult result) 
	{
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
	}

	public void onStart(ITestContext context) 
	{
	}

	public void onFinish(ITestContext context) 
	{
	}

}
