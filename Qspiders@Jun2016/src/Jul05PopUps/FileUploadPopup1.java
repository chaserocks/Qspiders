package Jul05PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopup1 {
public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.2shared.com/");
		driver.findElement(By.id("upFiled")).sendKeys("d:\\success.png");
		String xp="//input[@title='Upload file']";
		driver.findElement(By.xpath(xp)).click();
   }
}


// NOTE: The above concept works for only browse button(which can inspect it by firebug) i.e : input type ="file". If it is attachment 
// icon then sendkeys() Method will not work such as gmail "attchements" in such cases we can use the third party tools like AUTOIT, ROBOT, Sikulli.