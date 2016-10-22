package ClassProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TakeScreenshotofAppli {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost:8080/");
	EventFiringWebDriver e=new EventFiringWebDriver(driver);
	File srcFile=e.getScreenshotAs(OutputType.FILE);
	File destFile=new File("E:/SEstuff/sample.png");
	FileUtils.copyFile(srcFile, destFile);
	Thread.sleep(2000);
	driver.close();		
  }
}
