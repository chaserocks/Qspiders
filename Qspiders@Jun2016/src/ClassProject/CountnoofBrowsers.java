package ClassProject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountnoofBrowsers {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		Set<String> allwhbrwsrs = driver.getWindowHandles();
		System.out.println(allwhbrwsrs.size());
		driver.quit(); // closes all the Browers
	}

}
