package Jul05PopUps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class WindowPopuponlydonebyAUTOIT {
	public static void main(String[] args) throws IOException {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.seleniumhq.org/download/");
	driver.findElement(By.linkText("2.53.1")).click();
	Runtime.getRuntime().exec("E://SEstuff//AUTOITstuff//se.exe"); // refer the autoit script in the that location.
	}
}
