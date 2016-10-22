package Jun28;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectanelementinlistbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///E:/SEstuff/month.html");
     		WebElement listBox = driver.findElement(By.id("month"));
			Select select=new Select(listBox);
			//select.selectByIndex(1);
			select.selectByValue("m");
			//select.selectByVisibleText("Apr"); // even the duplicate of Apr is present then it take the first value of it and executes the 1st.
			driver.quit();
	}
}
