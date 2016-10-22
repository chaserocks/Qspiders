package Jun27;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printwebtablecontents {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///E:/SEstuff/table.html");
	List<WebElement> allcell = driver.findElements(By.xpath("//td"));
	int count=allcell.size();
	System.out.println(count);
	
	for(int i=0;i<count;i++)
	{
		WebElement cell = allcell.get(i); //or one shot way
		String text=cell.getText(); 
		//String text=allcell.get(i).getText();
		System.out.print(text);
	}
	driver.quit();
 }
}
