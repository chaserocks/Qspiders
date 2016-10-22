package Jun16;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class getTitleDemo {
	
	public static void testFirefox(FirefoxDriver driver) throws InterruptedException
	{
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(300);
		driver.close();
	}
	
	public static void testChrome(ChromeDriver driver) throws InterruptedException
	{
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(300);
		driver.close();
	}
	
	public static void testOpera(OperaDriver driver) throws InterruptedException
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
	
	public static void testSafari(SafariDriver driver) throws InterruptedException
	{		
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(800);
		driver.close();
	}
	public static void testIE(InternetExplorerDriver driver) throws InterruptedException
	{		
		driver.get("http://localhost:8080/login.do");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(300);
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp = new FirefoxProfile();
		fp=pr.getProfile("MyProfile");
		FirefoxDriver driver1=new FirefoxDriver(fp);

		//FirefoxDriver driver1=new FirefoxDriver();
		testFirefox(driver1);
				
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver2=new ChromeDriver();
		testChrome(driver2);

		System.setProperty("webdriver.opera.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\operadriver.exe");
		OperaDriver driver3=new OperaDriver();
		testOpera(driver3);

		SafariDriver driver4=new SafariDriver();	
		testSafari(driver4);
		 
		System.setProperty("webdriver.ie.driver","E:/Mystuff/SELINUMWS/BrowserDrivers/IEDriverServer.exe");
		InternetExplorerDriver driver5=new InternetExplorerDriver();
		testIE(driver5);
 }
}