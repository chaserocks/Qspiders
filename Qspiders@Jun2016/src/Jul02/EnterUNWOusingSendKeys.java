package Jul02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EnterUNWOusingSendKeys {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.vtiger.com");
		RemoteWebDriver r=(RemoteWebDriver) driver;
		String script="document.getElementById('username').value='a'";
		r.executeScript(script);
		driver.close();
	}
}
