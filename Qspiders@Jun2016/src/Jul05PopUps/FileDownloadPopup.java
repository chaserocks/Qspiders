package Jul05PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadPopup {
	public static void main(String[] args) {
		//create object of FirefoxProfile
		FirefoxProfile MyProfile =new FirefoxProfile();
		
		//If file use zip then dont display popup,dowload it directly
		// setPreferences setting: http://kb.mozillazine.org/About:config_entries
		// search for neverAsk(Ctrl+F): openFile and saveFile, copy it(type:browser.helperApps.neverAsk.saveToDisk) which is required. 
		// and paste at key(String).
		
		// To save the File directly:
	  //String key="browser.helperApps.neverAsk.saveToDisk";
		
		// To Open the File directly: It downloads the file and then opens it.
		String key="browser.helperApps.neverAsk.openFile";
		String value="application/zip,application/jar";
		MyProfile.setPreference(key, value);
		//open firefox with above settings
		WebDriver driver=new FirefoxDriver(MyProfile);
		driver.get("http://docs.seleniumhq.org/download/");
		//click on download link
		String xp="//td[text()='Java']/../td[4]/a";
		driver.findElement(By.xpath(xp)).click();
	}
}
