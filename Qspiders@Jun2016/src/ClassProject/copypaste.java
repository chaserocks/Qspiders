package ClassProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class copypaste{
	public static void main(String[] args) {	
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///E:/SEstuff/Demo.html");
	 
	WebElement un=driver.findElement(By.id("UN"));
	un.sendKeys(Keys.CONTROL+"ac"); // cntrl+a= to seclect all & c= copy
	WebElement pw=driver.findElement(By.id("PW"));
	pw.sendKeys(Keys.CONTROL+"v"); // cntrl+v= to paste. EmailId.
}
}
