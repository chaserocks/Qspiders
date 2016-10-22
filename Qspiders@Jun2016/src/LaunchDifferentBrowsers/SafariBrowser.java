package LaunchDifferentBrowsers;

import org.openqa.selenium.safari.SafariDriver;

// Save this from SeleniumHq SafariDriver.safariextz, After u install the Safari just drag this file on to the safari browser and click on install. U can use as usal as Firefox directly.
public class SafariBrowser {
	 public static void main(String[] args) throws InterruptedException {
		 
// System.setProperty("webdriver.safari.driver","C:\\Program Files (x86)\\Safari\\Safari.exe"); //Optional, this is the path where exactly the safari.exe is installed in ur C drive.
// System.setProperty("webdriver.safari.driver","C:\\Users\\Chase\\Downloads\\SafariDriver.safari.exe");// Optional case. Not Required. once u installed the extz it will work as usal as FF.
		
		 SafariDriver driver=new SafariDriver();	
			//driver.get("https://www.facebook.com");
		      driver.get("http://localhost:8080/login.do"); 
		    //driver.get("file:///D:/google.html");// this doesnt satisfy the static url://Exception in thread "main" org.openqa.selenium.WebDriverException: Unsupported URL protocol: file:///D:/google.html;
		   // for more information, see http://code.google.com/p/selenium/issues/detail?id=3773 (WARNING: The server did not provide any stacktrace information)
		   // Command duration or timeout: 5 milliseconds
//		    driver.manage().window().maximize();
//			Thread.sleep(400);
//			driver.close();	
  }
}
