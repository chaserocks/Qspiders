package ClassProject;

	import static org.testng.AssertJUnit.assertEquals;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
	  
	public class fblogintestngfile {
		private WebDriver driver;
		
		 @BeforeClass
		 public void Startup()
		 {
		  driver = new FirefoxDriver();
		 }
		 
		 @Test (description="Facebook Login")
		 public void GoogleLogin() throws InterruptedException 
		 {
		  driver.get("http://www.facebook.com");
		  assertEquals("Sign in", driver.findElement(By.id("signIn")).getAttribute("value"));
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 // Login
		  driver.findElement(By.id("email")).sendKeys("ideselenium04@gmail.com");
		  driver.findElement(By.id("pass")).sendKeys("automation123");
		  driver.findElement(By.id("u_0_x")).click();
		  Thread.sleep(60000);
		 
		 //Logout 
		  driver.findElement(By.id("userNavigationLabel")).click();
		  driver.findElement(By.id(".//*[@id='u_5_1']/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();
		  driver.switchTo().defaultContent(); 
		assertEquals("Sign in to facebook", driver.findElement(By.id("button")).getText());
		 }
		 
		@AfterClass
		 public void teardown()
		{
		   driver.quit(); 
		}
	}

	// Do this and after that delete this all comments
	/// Change the package name.


