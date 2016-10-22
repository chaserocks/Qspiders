package com.launchGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchGoogle {
	@Test
	public void testLaunch(){
	WebDriver driver = new FirefoxDriver();
	driver.get("https://google.com");
	driver.close();
	}
}
