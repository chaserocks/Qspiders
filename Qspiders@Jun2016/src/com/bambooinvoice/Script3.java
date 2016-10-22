package com.bambooinvoice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://localhost/bambooinvoice/index.php/login");
	driver.findElement(By.id("username")).sendKeys("rbk.2389@gmail.com");
	driver.findElement(By.id("password")).sendKeys("manager");
	driver.findElement(By.id("login")).click();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	while(true)
	{
	String status=(String) js.executeScript("return document.readyState");
	System.out.println(status);
	if(status.equals("complete"))
	break;
    }
 }
}
