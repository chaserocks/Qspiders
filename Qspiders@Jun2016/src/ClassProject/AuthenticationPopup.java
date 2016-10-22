package ClassProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class AuthenticationPopup {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	
//		WebDriver driver=new SafariDriver();
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://localhost:8443/!/#Chase");
		//THRU AUTOIT: Before u run this u need to compile the AUTOIT script atleast for once.
		//Runtime.getRuntime().exec("E://SEstuff//AUTOITstuff//AP.exe");
		
		//THRU ROBOT:
		
		//Runtime.getRuntime().exec("E://SEstuff//AUTOITstuff//A.exe");
		// For chrome this works but not with the fireFox and safari
		
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
