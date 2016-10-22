package Jul05PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnhandledAlertExceptn {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://irctc.co.in");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
	}

}
