package Jul05PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopupThruROBOT { // U require the SVN software to check this Authentication PopUP. For chrome this works but not with the fireFox and safari
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	
//		WebDriver driver=new SafariDriver();
		WebDriver driver=new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
*/		
		driver.get("https://UsereA:UserA@169.254.229.57:8443/svn/Chase/");
		
		//Runtime.getRuntime().exec("E://SEstuff//AUTOITstuff//A.exe");
		
		Robot rb=new Robot();
	    Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_U);
		rb.keyRelease(KeyEvent.VK_U);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_R);
		rb.keyRelease(KeyEvent.VK_R);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_U);
		rb.keyRelease(KeyEvent.VK_U);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_R);
		rb.keyRelease(KeyEvent.VK_R);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
}

