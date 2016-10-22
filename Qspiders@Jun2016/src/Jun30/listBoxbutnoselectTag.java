package Jun30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class listBoxbutnoselectTag {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demo.actitime.com");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//*[@id='loginButton']")).click();
	
//	WebElement listBox=driver.findElement(By.id("ext-comp-1001"));
	WebElement listBox=driver.findElement(By.xpath("//*[@id='ext-comp-1001']"));
	listBox.clear();
	listBox.sendKeys("roy");
	listBox.sendKeys(Keys.ENTER);
	driver.close();
  }
}
