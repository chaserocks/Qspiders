package Jun15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class runTimePolymorphism {
	public static void testBrowser(WebDriver driver)  {
		driver.get("http://google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
		public static void main(String[] args) // Works in Administration without fail. enable the Administraion and run it.
		{
			testBrowser(new FirefoxDriver());
			
			System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
			testBrowser(new ChromeDriver());
		}
}
