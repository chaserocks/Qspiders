package Jul06;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getTitleandcloseBrwsrWOusingquit {
	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	String a=driver.getWindowHandle();
	System.out.println(a);
	driver.get("https://www.naukri.com");
	Set<String> allBrwsers = driver.getWindowHandles();
	for(String browser:allBrwsers)
	{
		driver.switchTo().window(browser);
		System.out.println(driver.getTitle());
		driver.close();
	}
  }
}
