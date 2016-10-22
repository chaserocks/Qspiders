package Jun24synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailLoginImplicitlyWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	driver.get("http://gmail.com");
	driver.findElement(By.id("Email")).sendKeys("rimbola12345@gmail.com");
	driver.findElement(By.id("next")).click();
	driver.findElement(By.id("Passwd")).sendKeys("rimbola54321");
	driver.findElement(By.id("signIn")).click();
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	driver.findElement(By.id("gb_71")).click();
	driver.close();
	
	
	
}
}
