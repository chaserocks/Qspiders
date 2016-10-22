package Jun21;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class TakeScreenShot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new FirefoxDriver();
//	driver.get("http://localhost:8080/login.do");
	driver.get("http://www.tailorman.com");
	EventFiringWebDriver e=new EventFiringWebDriver(driver); //Used for EventFiring. File srcFile=((FirefoxDriver) driver).getScreenshotAs(OutputType.FILE); // downcasting
	File srcFile=e.getScreenshotAs(OutputType.FILE);
	File destFile=new File("D:\\google1.png");
	FileUtils.copyFile(srcFile, destFile);
	driver.close();	
 }
}
