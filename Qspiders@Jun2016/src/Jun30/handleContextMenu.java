package Jun30;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handleContextMenu {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:82/login.do");
		WebElement link=driver.findElement(By.linkText("Actimind Inc."));
		
		Actions actions=new Actions(driver);
		actions.contextClick(link).perform();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(java.awt.event.KeyEvent.VK_T);
		r.keyRelease(java.awt.event.KeyEvent.VK_T);
	}
	

}
