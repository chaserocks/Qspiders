package Jul12TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertDemo {
	@Test
	public void testB()
	{
		SoftAssert soft=new SoftAssert(); // to continue the execution even after the comparision fails. we can use this SoftAssert
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String ev="actiTIME - Enter Tim-Track";
		String av=driver.getTitle();
		
		soft.assertEquals(av, ev);
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		soft.assertAll(); //mandatory to give this, then only it will compare & give the result if not it wil give u the false result even if the title is wrong.
	}
}


