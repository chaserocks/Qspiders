package LaunchDifferentBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

// Install the FireFox 46.0 Version only... and Uncheck the updates or enable the never look for updates.

public class FirefoxBrowser {
	 public static void main(String[] args) throws InterruptedException {
		 
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
		   // driver.get("http://localhost:8080/login.do");
			Thread.sleep(100);
			driver.close();	
		}
	}

