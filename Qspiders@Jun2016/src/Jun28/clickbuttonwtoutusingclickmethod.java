package Jun28;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class clickbuttonwtoutusingclickmethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.vtiger.com/");
	String xp="//*[text()='Sign in']";
	driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
	
	//or use (When ever there is type='submit' was there u can use directly submit method as like below)
	//driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	driver.close();
  }
}
	
