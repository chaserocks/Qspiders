package Jul01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
			String xp1="//h1[text()='Block 1']";
			WebElement source = driver.findElement(By.xpath(xp1));
			
			String xp2="//h1[text()='Block 3']";
			WebElement target=driver.findElement(By.xpath(xp2));
			
			Actions actions=new Actions(driver);
		    actions.dragAndDrop(source, target).perform();
			//actions.dragAndDropBy(source, xOffset, yOffset).perform();
			driver.close();
	}

}
/*Notes: To move the mouse use MTE.
2) To rightclick the mouse we use the Context link
3) DragandDrop and also the SendKeys to perform the mouse actions.*/