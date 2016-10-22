package Jul04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class printFontSize {
	public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://demo.actitime.com/login.do");
	WebElement un=driver.findElement(By.id("username"));
	String f=un.getCssValue("font-size");
	System.out.println(f);
	}
}
