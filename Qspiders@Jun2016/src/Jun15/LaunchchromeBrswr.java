package Jun15;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchchromeBrswr {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com");
		driver.get("http://localhost:8080/login.do");
		Thread.sleep(500);
		driver.close();	
	}
}
