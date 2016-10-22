package Jun22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathRubyforSEDownloads {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://docs.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Ruby']/../td[4]/a")).click();
		driver.close();
	}
}

