package Jun29;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchOptionpresentornot {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your item to be displayed");
		String ev=sc.nextLine();
		int found=0;
		System.out.println("Please wait Searching.....");
		
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///E:/SEstuff/multiselectlistbox.html");
		WebElement listBox=driver.findElement(By.id("mtr"));
		Select select =new Select(listBox);
		List<WebElement> allOptions=select.getOptions();
		
		for(WebElement option:allOptions)
		{
			String av=option.getText();
			if(ev.equals(av))
				found++;
		}
		if(found==0)
		{
			System.out.println("Sorry, Item is not present");
		}
		else if(found==1)
		{
			System.out.println("Item found");
		}
		else
		{
			System.out.println("Items are duplicate");
		}
		driver.close();
 }
}
