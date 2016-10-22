package Jun20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath2 {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/SEstuff/xpathDemo4.html");
		
		String xp1="html/body/div[1]/input[1]"; //for selecting both AB=html/body/div[1]/input[1] |(in btwn use pipeline symbol)html/body/div[1]/input[2]
		WebElement A=driver.findElement(By.xpath(xp1)); // or use //input[1]
		A.sendKeys(" Manchikatla");
		
		String xp2="html/body/div[1]/input[2]"; // or use //input[1]
		WebElement B=driver.findElement(By.xpath(xp2));
		B.sendKeys(" Bharath");
		
		String xp3="html/body/div[2]/input[1]"; // or use //div[2]/input[1].
		WebElement C=driver.findElement(By.xpath(xp3));
		C.sendKeys(" Chandra");
		
		String xp4="html/body/div[2]/input[2]"; // or use //div[2]/input[1].
		WebElement D=driver.findElement(By.xpath(xp4));
		D.sendKeys(" 2365");
		
		
		
	}


}
