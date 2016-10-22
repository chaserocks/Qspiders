package LaunchDifferentBrowsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserByGheckhodriver {
	
		public static void main(String[] args) {
			
		// System.setProperty("webdriver.firefox.marionette","E:\\Mystuff\\Chintu\\SOFTWARE TESTING STUFF\\2.Q-EDGE\\Selenium\\browsers\\geckodriver.exe");
		 
	     // if above property is not working or not opening the application in browser then try below property

	     System.setProperty("webdriver.gecko.driver","E:\\Mystuff\\Chintu\\SOFTWARE TESTING STUFF\\2.Q-EDGE\\Selenium\\browsers\\geckodriver.exe");

	    WebDriver driver = new FirefoxDriver();

	    driver.get("https://www.gmail.com");

	    System.out.println("Application title is ============="+driver.getTitle());

	    driver.quit();
			}
		
		}
	
	

