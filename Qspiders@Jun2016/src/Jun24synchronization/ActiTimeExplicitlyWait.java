package Jun24synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeExplicitlyWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://localhost:82/login.do");
		
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']")).click();
			//driver.findElement(By.xpath("//div[text()='USERS']")).click();
			//driver.findElement(By.xpath("//div[contains(text(),'TASKS')]")).click();
			//driver.findElement(By.id("ext-gen7")).click();
			// ExplicitlyWait:
			WebDriverWait wait=new WebDriverWait(driver,8);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink"))); // or use the predicate of visibilityofElementLocated.
			// under 
			//wait.until(ExpectedConditions.titleContains("Enter")); // or use the predicate of visibilityofElementLocated.
			String title1="Acti-time: ";
		    wait.until(ExpectedConditions.titleIs(title1));	
			String title=driver.getTitle();
			System.out.println(title);
			driver.findElement(By.id("logoutLink")).click();
			driver.close();
	}
}
