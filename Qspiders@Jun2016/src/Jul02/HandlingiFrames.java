package Jul02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingiFrames {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/SEstuff/DemoA.html");
		
		driver.findElement(By.id("t1")).sendKeys("a");
		// SwitchTo() Method can be done in 3 ways:
		
		// 1) By Index value:
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("t2")).sendKeys("b");
		
		// 2) By locator id value:
//		driver.switchTo().frame("f1");
//		driver.findElement(By.id("t2")).sendKeys("b");

		// 3) By WebElement (Element of the frame)
		WebElement f=driver.findElement(By.className("c1"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t2")).sendKeys("c");
		// 4) To switchback to the default content:
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("d");
	}

}
