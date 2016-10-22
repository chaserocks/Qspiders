package Jun29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printinsortedorderofalloptions {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("file:///E:/SEstuff/multiselectlistbox.html");
	WebElement listBox=driver.findElement(By.id("mtr")); // finding the element based on the id 
	Select select =new Select(listBox);
	//main code: 24 to 36
	List<WebElement> allOptions=select.getOptions(); // getting all the Options present in the listbox i.e it creates and stores allOptions of the elements.
	ArrayList<String> allText=new ArrayList<String>(); // ArrayList created and it is a emptylist.
	//or
	//List<String> allText=new ArrayList<String>(); // List is parent and ArrayList is child and ArrLst is upcasting in List and u can use this. 
	for(int i=0;i<allOptions.size();i++)
	{
		String text=allOptions.get(i).getText(); // adding all the Options in Arraylist
		allText.add(text);
	}
	Collections.sort(allText); // Here sorting will be done of the Arraylist 
	for(String text: allText)
	{
		System.out.println(text);
	}
	driver.close();
}
}
