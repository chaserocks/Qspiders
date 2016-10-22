package Jun20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class csseg1 {
	public static void main(String[] args) {
	
//	WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///E:/SEstuff/Demo2.html");
	WebElement uid=driver.findElement(By.id("UN"));
	uid.sendKeys("rbk.2389@gmail.com");
	
	String css="input[type='password']";  //or  String css="#PW";
	WebElement pwd=driver.findElement(By.cssSelector(css));
	pwd.sendKeys("chandra");
	} 
}

