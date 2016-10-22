package Jun27;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleautosuggestions {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://google.com");
	driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
	String xp="//div[contains(text(),'selenium')]";
	List<WebElement> aa = driver.findElements(By.xpath(xp));
	int count=aa.size();
	System.out.println(count);
	
	for(int i=0;i<count;i++)
	{
		WebElement a=aa.get(i);
		String text=a.getText();
		System.out.println(text);
	}
	aa.get(count-1).click();
	driver.quit();
 }
}
