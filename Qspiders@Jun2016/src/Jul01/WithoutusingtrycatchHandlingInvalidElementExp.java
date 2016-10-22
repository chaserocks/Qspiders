package Jul01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutusingtrycatchHandlingInvalidElementExp {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///E:/SEstuff/textbox1.html");
		
		WebElement tb=driver.findElement(By.id("un"));
		if(tb.isEnabled())
		{
			tb.sendKeys("admin");
			System.out.println("TextBox is Enabled");
		}
		else
		{
			System.out.println("TextBox is Disabled");
		}
		driver.close();
	}
}
