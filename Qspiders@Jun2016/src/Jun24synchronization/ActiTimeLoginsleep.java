package Jun24synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginsleep {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://localhost:8080/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
//	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("manager");
	driver.findElement(By.xpath("//*[@id='loginButton']")).click();
	Thread.sleep(8000);
	driver.findElement(By.id("logoutLink")).click();
	driver.close();

}
}
