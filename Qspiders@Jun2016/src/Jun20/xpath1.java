package Jun20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath1 {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/SEstuff/Demo3.html");
		
		String xp1="/html/body/input[1]"; // or "//input[1]";(relative xpath). Always xpath index starts with 1. //=root dir
		WebElement Fn=driver.findElement(By.xpath(xp1));
		Fn.sendKeys("Bharath Chandra ");
		
		String xp2="/html/body/input[2]";
		WebElement Ln=driver.findElement(By.xpath(xp2));
		Ln.sendKeys("Bharath Manchi");
		
		String xp3="/html/body/input";
		WebElement n=driver.findElement(By.xpath(xp3));
		n.sendKeys("Manchikatla");	
	}
}
