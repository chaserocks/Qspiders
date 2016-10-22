package Jul12TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class AssertEquals {
public void testA() {
	String ev="actiTIME - login";
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost:8080/login.do");
	String av=driver.getTitle();
	Assert.assertEquals(av, ev);
}
}
