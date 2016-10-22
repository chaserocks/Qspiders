package Jun28;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printallOptions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///E:/SEstuff/multiselectlistbox.html");
		WebElement listBox=driver.findElement(By.id("mtr"));
		Select select =new Select(listBox);
		List<WebElement> allOptions=select.getOptions();
		for(int i=0;i<allOptions.size();i++)
		{
			String text=allOptions.get(i).getText();
			System.out.println(text);
		}
 }
}
