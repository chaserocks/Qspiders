package Jun28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectanddeselectinreverseorder {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///E:/SEstuff/multiselectlistbox.html");
     		WebElement listBox = driver.findElement(By.id("mtr"));
			Select select=new Select(listBox);
			List<WebElement> allOptions = select.getOptions();
			int count=allOptions.size();
			System.out.println(count);
			
			for(int i=count-1;i>=0;i--)
			{
				select.selectByIndex(i);
			}
			
			for(int i=count-1;i>=0;i--)
			{
				select.deselectByIndex(i);
			}
			
  }

}