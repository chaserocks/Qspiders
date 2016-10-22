package ClassProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class fblogin {
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		Thread.sleep(300);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook - Log In or Sign Up"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

		/*String xp1="//input[@id='email']";
		WebElement un=driver.findElement(By.xpath(xp1));*/ 
		//or direct one shot way
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7097845609");
		String xp2="//input[@id='pass']";
		WebElement pw=driver.findElement(By.xpath(xp2));
		pw.sendKeys("chandrasnice5"); // wrong password so fail.
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(500);
		
		String title1=driver.getTitle();
		System.out.println(title1);
		if(title.equals("Facebook"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
