package Jul04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxButnalligned {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://gmail.com");
	WebElement email=driver.findElement(By.id("Email"));
	int x1=email.getLocation().getX();
	System.out.println(x1);
	
	int w1=email.getSize().getWidth();
	System.out.println(w1);
	
	int w2=email.getSize().getWidth();
	System.out.println(w2);
	
	WebElement next=driver.findElement(By.id("next"));
	int x2=next.getLocation().getX();
	System.out.println(x2);
	
	if(x1==x2)
	
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	if(w1==w2)
		
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}

	driver.close();
  }
}
