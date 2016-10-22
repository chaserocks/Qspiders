package Jul05PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AlertPopup {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://irctc.co.in");
		driver.findElement(By.id("loginbutton")).click();
		
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println(msg);
		
		alert.accept(); //U can use only one action to perform by accept or dismiss it & this will accept the alert popoup by clicking the ok button. 
		//alert.dismiss(); //This will close the alert by clicking on the close button. 
		driver.close();
	}

}
