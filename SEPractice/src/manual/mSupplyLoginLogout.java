package manual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mSupplyLoginLogout {
	
	 public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver", "D:\\Framework\\SEPractice\\exes\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			System.out.println("Application title is ============="+driver.getTitle());
		   // driver.get("http://localhost:8080/login.do");
			driver.close();	
		}
	}


