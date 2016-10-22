package Jun30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingListbox {
	public static void main(String[] args) {
		
		String msg="Sorted";
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
      //driver.get("file:///E:/SEstuff/alpha.html");// unsorted html.
		driver.get("file:///E:/SEstuff/alphasorted.html"); // sorted html.
		WebElement listBox=driver.findElement(By.id("alpha"));
		Select select=new Select(listBox);
		List<WebElement> allOptions=select.getOptions();
		int count=allOptions.size();
		
		for(int i=0;i<count-1;i++)
		{
			String options1=allOptions.get(i).getText();
			System.out.println(options1);
			String options2=allOptions.get(i+1).getText();
			System.out.println(options2);
			
			if(options1.compareTo(options2)>0)
			{
				msg="Not Sorted";
				break;
			}
		}
		System.out.println(msg);
		driver.close();
	}
}
