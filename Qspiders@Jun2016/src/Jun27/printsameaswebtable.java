package Jun27;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printsameaswebtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("file:///E:/SEstuff/table.html");
			List<WebElement> allcell = driver.findElements(By.xpath("//tr")); //this s for rows.
//			List<WebElement> allcell = driver.findElements(By.xpath("//td")); // this 4 column
			int count=allcell.size();
			System.out.println(count);
			
			
			for(int i=0;i<count;i++)
			{
					WebElement cell = allcell.get(i);
					String text=cell.getText();	
					System.out.println(text);	
			}
	
			driver.close();
			
	}
}
