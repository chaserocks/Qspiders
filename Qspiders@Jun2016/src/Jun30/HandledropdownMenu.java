package Jun30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandledropdownMenu {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.actimind.com/");
		String xp="//span[text()='About Company']";
		WebElement menu=driver.findElement(By.xpath(xp));
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();
		driver.findElement(By.linkText("Basic Facts")).click();
	}
}
