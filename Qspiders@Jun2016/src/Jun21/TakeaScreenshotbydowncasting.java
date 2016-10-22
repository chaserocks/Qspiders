package Jun21;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeaScreenshotbydowncasting {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
//		driver.get("http://localhost:8080/login.do");
		driver.get("http://www.tailorman.com");
		File srcFile=((FirefoxDriver) driver).getScreenshotAs(OutputType.FILE); // downcasting
		File destFile=new File("D:/actitime.png"); // SE only works .png format.
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
	}

}
