package Jul05PopUps;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserPopUp {
	public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	//Parent Browser: {3caf6a29-2c1b-4c8b-9a15-564ef6502782}
	String a=driver.getWindowHandle();
	System.out.println(a);
	driver.get("https://www.naukri.com");
	Set<String> wh = driver.getWindowHandles();
	
	for(String w:wh)
	{
	  System.out.println(w); //Child Browser:{73033048-4d2d-4f3a-b6ad-c8cd9f77a2f9} ; {6d6a483d-5274-4d03-884a-fa9edbf065a6}
	}
	driver.quit(); // closes all the browsers.
  }

}
