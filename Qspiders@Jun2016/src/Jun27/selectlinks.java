package Jun27;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectlinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///E:/SEstuff/links.html");
		driver.manage().window().maximize();
		List<WebElement> a = driver.findElements(By.xpath("//a"));
		int count=a.size();
		System.out.println(count);
		WebElement b = a.get(1);
		String text = b.getText();
		System.out.println(text);
		b.click();
		//driver.quit();
	}

}
