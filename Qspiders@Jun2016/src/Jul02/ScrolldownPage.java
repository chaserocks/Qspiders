package Jul02;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrolldownPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://news.google.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=1;i<10;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(500);
		}
	}
}
