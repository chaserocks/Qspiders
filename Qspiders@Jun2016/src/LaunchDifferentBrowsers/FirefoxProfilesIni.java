package LaunchDifferentBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

//Steps to be done before : press winkey+R and type "firefox.exe -p profilemanager" then enter, A pop up displays and 
// create new Profile and give some name to it and click on Finish.


public class FirefoxProfilesIni {
	
		 public static void main(String[] args) throws InterruptedException {
			 
			 // Creating the profile object
				ProfilesIni pr=new ProfilesIni();	
			// Creating the FirefoxProfile Object	
				FirefoxProfile fp=new FirefoxProfile();
			// Point fp to the FirefoxProfile which we created.
				fp=pr.getProfile("MyProfile");
			// Launches Firefox along with the MyProfile.
				FirefoxDriver driver=new FirefoxDriver(fp);
				
				//driver.get("https://www.facebook.com");
			    driver.get("http://localhost:8080/login.do");
				Thread.sleep(100);
				driver.close();	
			}
		}


