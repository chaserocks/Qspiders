package com.bambooinvoice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrMsgbyNegativeScenario {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/bambooinvoice/index.php/login");
		driver.findElement(By.id("username")).sendKeys("mbc2365@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234567");
		driver.findElement(By.id("login")).click();
		String xp="//p[@class='error']";
		WebElement err = driver.findElement(By.xpath(xp));
		
		if(err.isDisplayed())
		{
			System.out.println("Pass:");
			String text=err.getText();
			System.out.println(text);
		}
		else
		{
			System.out.println("Fail: No err Msg");
		}
		driver.close();
 }
}
