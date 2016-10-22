package Jun16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

//Example for Runtime Polymorphism in SE.

public class WebDriverDemo4allBrwsrs {
	
	public static void testBrowser(WebDriver driver) throws InterruptedException
		{
			driver.get("http://localhost:8080/login.do");
			driver.manage().window().maximize();
			String title=driver.getTitle();
			System.out.println(title);
			String url=driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(300);
			driver.quit();
		}
		
	public static void main(String[] args) throws InterruptedException {

		testBrowser(new FirefoxDriver()); //Works in Administration without fail. enable the Administraion and run it.

		testBrowser(new SafariDriver()); // Since the Extension is installed on the Safari. So u can use it as usal like FF.
		
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		testBrowser(new ChromeDriver());
		
		System.setProperty("webdriver.opera.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\operadriver.exe");
		testBrowser(new OperaDriver());
		 
		System.setProperty("webdriver.ie.driver","E:/Mystuff/SELINUMWS/BrowserDrivers/IEDriverServer.exe");
		testBrowser(new InternetExplorerDriver());
	}
}
