package LaunchDifferentBrowsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

// Go to the Browser and click Tools and choose the Internet Options and go to Security Tab & Enable 
// all the Internet, Local intranet, Trusted and Restricted Site Apply it click on OK.
public class IEBrowser {
      public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver","E:/Mystuff/SELINUMWS/BrowserDrivers/IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		//driver.get("https://www.facebook.com");
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.close();	
	}
}
