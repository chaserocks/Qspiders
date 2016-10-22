package Jun17;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MaximiseResize {
	public static void main(String[] args) throws InterruptedException
	{
		//WebDriver driver=new SafariDriver();
		//System.setProperty("webdriver.firefox.profile", "default"); //This is only for the FF Browser.
		WebDriver driver=new FirefoxDriver(); //Works in Administration without fail. enable the Administraion and run it.
		Thread.sleep(500);
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.navigate().to("http://localhost:8080/login.do");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(3000);            
		driver.navigate().refresh();
		Thread.sleep(3000);
		Dimension d=new Dimension(200,300);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Point p=new Point(400,50);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
	}
}
