package Jun20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pagesource {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/bambooinvoice/index.php/login");
		String code=driver.getPageSource();
		System.out.println(code);	
	  }
	}

