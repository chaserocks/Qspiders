package Jul02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class HandlingiFramesonzoho {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.zoho.com/crm/lp/login.html");
		driver.findElement(By.id("lid")).sendKeys("rbk.2389@gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("chandra");
		driver.findElement(By.id("submit_but")).click();

	}
}
