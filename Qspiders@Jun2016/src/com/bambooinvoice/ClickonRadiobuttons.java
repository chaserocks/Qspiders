package com.bambooinvoice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonRadiobuttons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/bambooinvoice/index.php/login");
		driver.findElement(By.id("username")).sendKeys("rbk.2389@gmail.com");
		driver.findElement(By.id("password")).sendKeys("manager");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.className("root_invoices")).click();
		String xp="//input[@type='radio']";
		List<WebElement> allradiobtns=driver.findElements(By.xpath(xp));
		
		 for(WebElement allrbs : allradiobtns)
		 {
			 Thread.sleep(150);
			 allrbs.click();
			 if(allrbs.isSelected())
			 {
				 System.out.println("pass");
			 }
			 else
			 {
				 System.out.println("fail");
			 }
		 }
		 driver.close();
	}
}
