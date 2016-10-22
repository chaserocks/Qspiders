package Jun28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleselectioninlistbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///E:/SEstuff/multiselectlistbox.html");
     		WebElement listBox = driver.findElement(By.id("mtr"));
			Select select=new Select(listBox);
			
			select.selectByIndex(1);
			select.selectByValue("d");
			select.selectByVisibleText("poori"); // even the duplicate of Apr is present then it take the first value of it and executes the 1st.
			//select.deselectAll(); 
			//or use the following
			if(select.isMultiple())
			{
				System.out.println("It is Multi select listBox");
			select.deselectByIndex(1);
			select.deselectByValue("d");
			select.deselectByVisibleText("poori");
			//or out of the above 3 use the single statement as 
			//select.deselectAll();
			}
			else
			{
				System.out.println("It is not Multi-select listBox");
			}
  }
}