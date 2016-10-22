package Jun17;

/*Some Firefox issue was there, so make sure that u run this eclipse in the Administration profile. I have recorded 
the settings how to enable the Administration pls follow the video EnableAdministration @E:\Mystuff\Chintu\SOFTWARE TESTING STUFF\2.Q-EDGE\Selenium\IMPStuffSE.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo1 {
	
//	private static FirefoxDriver driver; // Demo1.driver=new FirefoxDriver();

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.opera.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\operadriver.exe");
		//WebDriver driver=new OperaDriver();
		
		 // Open the Browser 
		WebDriver driver=new FirefoxDriver();
		// System.setProperty("webdriver.safari.driver","C:\\Program Files (x86)\\Safari\\Safari.exe"); 
		 
// WebDriver driver=new SafariDriver(); //Exception in thread "main" org.openqa.selenium.WebDriverException: Unsupported URL protocol: file:///D:/google.html;
// for more information, see http://code.google.com/p/selenium/issues/detail?id=3773 (WARNING: The server did not provide any stacktrace information)
// Command duration or timeout: 5 milliseconds
		
		
		//Enter the URL
		 
		//driver.get("file:///C:/Users/Administrator/Desktop/google.html");
		driver.get("file:///C:/Users/Chase/Desktop/google.html");
		// Find the Element link and click on it in various ways.
		
//		driver.findElement(By.tagName("a1")).click(); 
		
//		driver.findElement(By.id("a1")).click();
		
//		driver.findElement(By.className("c1")).click();
		
		driver.findElement(By.name("n1")).click();
		
		driver.quit();

	}
}
