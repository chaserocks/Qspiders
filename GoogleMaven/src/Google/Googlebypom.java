package Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlebypom {
	
	public void testGoogle() {
		
	WebDriver driver=new FirefoxDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
  }
}
