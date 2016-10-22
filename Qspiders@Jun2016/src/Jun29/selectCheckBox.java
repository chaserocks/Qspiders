package Jun29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectCheckBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/login.do");
		String v="keepLoggedInCheckBox";
		WebElement chkbox=driver.findElement(By.id(v));
		if(chkbox.isSelected())
		{
			System.out.println("CheckBox is Selected");
			
		}
		else
		{
			System.out.println("CheckBox is Not Selected");
		}
		driver.close();
	}
}
