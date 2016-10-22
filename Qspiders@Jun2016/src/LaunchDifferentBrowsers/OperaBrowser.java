package LaunchDifferentBrowsers;


import org.openqa.selenium.opera.OperaDriver;

public class OperaBrowser {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.opera.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\operadriver.exe");
		OperaDriver driver=new OperaDriver();
		//driver.get("https://www.facebook.com");
		driver.get("http://localhost:8080/login.do");
		Thread.sleep(100);
		driver.quit();	
	}
}


