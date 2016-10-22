package Jul05PopUps;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopupthruAUTOIT {
	public static void main(String[] args) throws IOException {
	
	WebDriver driver=new FirefoxDriver();
	Runtime.getRuntime().exec("E://SEstuff//AUTOITstuff//Auth.exe");
	driver.get("https://localhost:8443/!/#Chase");
	//THRU AUTOIT: Before u run this u need to compile the AUTOIT script atleast for once.
	
}

}
