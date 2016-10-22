package Jun24synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeImplicitlyWait {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:8080/login.do");
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//*[@id='loginButton']")).click();
	driver.findElement(By.id("logoutLink")).click();
	driver.close();
  }
}
