package Jul05PopUps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//driver.get("https://www.makemytrip.com");
		//driver.findElement(By.xpath("//*[@id='widget_row']/div[1]/div/div[2]/ul/li[2]/a")).click();
		driver.get("https://www.makemytrip.com/flights");
		driver.findElement(By.xpath("//a[@data-code='F']")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		String xp1="//span[text()='DEPARTURE']";
		driver.findElement(By.xpath(xp1)).click();
		Thread.sleep(1000);
		String xp2="//td[@fare-date='13-7-2016']"; // use the child but not the parent one i.e. remove /a.
		driver.findElement(By.xpath(xp2)).click();	
	}
}
