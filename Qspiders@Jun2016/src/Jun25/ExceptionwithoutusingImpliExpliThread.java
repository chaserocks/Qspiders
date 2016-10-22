package Jun25;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionwithoutusingImpliExpliThread {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://localhost:8080/login.do");
		
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']")).click();
			//driver.findElement(By.id("logoutLink")).click();
			while(true)
			{
				try 
				{
					driver.findElement(By.id("logoutLink")).click(); // asume that u got exception @ logout.
					System.out.println("hai");
					break;
				}
				catch(Exception e)
				{
					System.out.println("bye");
				}
			}
			driver.quit();
  }
}
