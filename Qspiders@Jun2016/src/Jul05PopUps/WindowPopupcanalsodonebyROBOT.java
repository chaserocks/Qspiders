package Jul05PopUps;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopupcanalsodonebyROBOT {

	
	public static void main(String[] args) throws Exception {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.53.1")).click();
		Thread.sleep(2000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
