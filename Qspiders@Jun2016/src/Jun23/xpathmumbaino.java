package Jun23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathmumbaino {
	public static void main(String[] args) {
		//open the browser
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// go to the irctc.com
		driver.get("http://irctc.com/displayServlet");
		//find the ph. no of mumbai
		WebElement ph=driver.findElement(By.xpath("//label[text()='Mumbai']/../label[2]"));
		//ph.getAttribute(sdsds); try this by Attribute and by tag
		//get its text and print it.
		String text=ph.getText();
		System.out.println(text);
		// close the browser.
		//driver.close();
	}

}
