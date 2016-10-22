package Jul01;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInvalidElementException {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///E:/SEstuff/textbox.html");
		try 
		{
			driver.findElement(By.id("un")).sendKeys("admin");
			System.out.println("Textbox is Enabled");
		}
		catch(InvalidElementStateException e)
		{
			System.out.println("Textbox is disabled");
		}
		driver.close();
	}

}
