package Jun27;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectcheckboxes {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///E:/SEstuff/checkbox.html");
		List<WebElement> allCB = driver.findElements(By.xpath("//input"));
		int count = allCB.size();
		System.out.println(count);
		//for loop:1st way ascending way
		//for(int i=0;i<count;i++)
		//or //for loop:2nd way descending way
	//	for(int i=count-1;i>=0;i--)
		/*{
			WebElement cb = allCB.get(i);
			cb.click();
		}	*/
		//or Enhanced for loop or foreach
		for(WebElement cb:allCB)
		{
			cb.click();
		}
	}
}
