package Jul06;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleNewTabInBrwsr {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		String a=driver.getWindowHandle();
		System.out.println(a);
		driver.get("https://www.naukri.com");
		Set<String> allBrwsers = driver.getWindowHandles();
		Iterator<String> iAllBrwsrs=allBrwsers.iterator();
		String parent=iAllBrwsrs.next(); // Returns the object and moves to next whereas as hasNext() only checks whether the next object is there or not.
		String child=iAllBrwsrs.next();
		
		driver.switchTo().window(child);
		driver.close();
		driver.switchTo().window(parent);
		driver.close();	
	}
}
