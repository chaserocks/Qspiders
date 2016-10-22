package Jul02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class inputinaTxtBoxwhchisDisabled {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/SEstuff/disabledbutton.html");
		RemoteWebDriver r=(RemoteWebDriver) driver;
		String script="document.getElementById('UN').value='admin'";
		r.executeScript(script);
		driver.close();
	}
}
