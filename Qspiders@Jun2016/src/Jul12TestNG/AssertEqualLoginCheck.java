package Jul12TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualLoginCheck {
	@Test
	public void testA() throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String ev="actiTIME - Enter Tim-Track";
		String av=driver.getTitle();
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		Assert.assertEquals(av, ev);
	}
	}
