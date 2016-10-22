package Jul05PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/orangehrm_mysql/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("manager");
		driver.findElement(By.id("btnLogin")).click();
		
		Actions actions=new Actions(driver);
		WebElement menu =driver.findElement(By.id("menu_pim_viewPimModule"));
		actions.moveToElement(menu).perform();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_addEmployee")));
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Blacky");
		driver.findElement(By.id("middleName")).sendKeys("cutie");
		driver.findElement(By.id("lastName")).sendKeys("rottie");
		//FileUpload PopUp:
		driver.findElement(By.id("photofile")).sendKeys("D:\\google1.jpg"); // Always Use the double \\ backward slash. 
		//driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\office\\Downloads\\nice.png");
		Thread.sleep(500);
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
}
