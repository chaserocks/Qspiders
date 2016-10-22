package Jun27;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sumofallnospresentinwebtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///E:/SEstuff/table.html");
		List<WebElement> allcell = driver.findElements(By.xpath("//td"));
		int count=allcell.size();
		System.out.println(count);
		
		int sum=0;
		for(WebElement cell:allcell)
		{
			String text=cell.getText();
			try
			{
				int n=Integer.parseInt(text);
			    System.out.println(n);
				sum+=n;
			}
			catch(NumberFormatException e)
			{
				
		    }	
	 }
		System.out.println("Sum:"+sum);
		driver.quit();
  }
}
