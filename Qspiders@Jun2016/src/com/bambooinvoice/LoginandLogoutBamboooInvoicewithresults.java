package com.bambooinvoice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginandLogoutBamboooInvoicewithresults {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://localhost/bambooinvoice/index.php/login");
	driver.findElement(By.id("username")).sendKeys("rbk.2389@gmail.com");
	driver.findElement(By.id("password")).sendKeys("manager");
	driver.findElement(By.id("login")).click();
	
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
	
	String title1=driver.getTitle();
	System.out.println(title1);
	if(title1.equals("BambooInvoice: Root System"))
	{	
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	driver.findElement(By.xpath("(//a[text()='Logout'])[2]")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
	
	String title=driver.getTitle();
	System.out.println(title);
	if(title.equals("BambooInvoice: Login"))
	{	
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	driver.close();
  }
}
